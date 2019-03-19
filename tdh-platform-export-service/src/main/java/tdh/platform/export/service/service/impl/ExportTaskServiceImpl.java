package tdh.platform.export.service.service.impl;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Lists;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import tdh.platform.export.dao.IExportTaskMapper;
import tdh.platform.export.entity.ExportContext;
import tdh.platform.export.entity.ExportTask;
import tdh.platform.export.entity.ExportTaskDto;
import tdh.platform.export.service.service.IExportTaskService;
import tdh.platform.export.service.service.CustomRabbitTemplate;
import tdh.platform.export.utils.ExportConstants;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

@Service
public class ExportTaskServiceImpl implements IExportTaskService {
	private ObjectMapper om = new ObjectMapper();
	@Autowired
	private IExportTaskMapper exportTaskMapper;
    @Autowired
    @Qualifier("exportMqTemplate")
    private CustomRabbitTemplate customRabbitTemplate;

	@Override
	public Integer createExportTask(ExportTaskDto exportTaskDto) throws IllegalAccessException,
			InvocationTargetException, NoSuchMethodException, JsonProcessingException {

		Assert.notNull(exportTaskDto.getExportContext(), "查询参数不能为空");
		Assert.notNull(exportTaskDto.getExportContext().getCriteria(),"查询参数不能为空" );
		ExportTask exportTask = new ExportTask();
		exportTaskDto.setDeleted(ExportConstants.BYTE_FALSE);
		exportTaskDto.setTaskStatus(ExportConstants.TASK_STATUS_0);
		PropertyUtils.copyProperties(exportTask, exportTaskDto);
		exportTask.setCriteria(om.writeValueAsString(exportTaskDto.getExportContext()));
		exportTaskMapper.insertSelective(exportTask);
		// 发送 mq 消息
		ExportContext exportContext = exportTaskDto.getExportContext();
		// 设置任务 id
		exportContext.setTaskId(exportTask.getId());
		customRabbitTemplate.convertAndSend(om.writeValueAsString(exportContext));

		return exportTask.getId();
	}

	@Override
	public List<ExportTaskDto> exportTaskList() throws IOException {
		List<ExportTask> exportTasks = this.exportTaskMapper.selectTaskList();
		if (CollectionUtils.isEmpty(exportTasks)) {
			return null;
		}
		List<ExportTaskDto> dtos = Lists.newArrayList();
		for (ExportTask task : exportTasks) {
			ExportTaskDto exportTaskDto = new ExportTaskDto();
			exportTaskDto.setRemark(task.getRemark());
			exportTaskDto.setAttachment(task.getAttachment());
			exportTaskDto.setCreatedBy(task.getCreatedBy());
			exportTaskDto.setCreatedTime(task.getCreatedTime());
			exportTaskDto.setDeleted(task.getDeleted());
			exportTaskDto.setTaskName(task.getTaskName());
			exportTaskDto.setTaskStatus(task.getTaskStatus());
			exportTaskDto.setTaskType(task.getTaskType());
			exportTaskDto.setUpdatedBy(task.getUpdatedBy());
			exportTaskDto.setUpdatedTime(task.getUpdatedTime());
			exportTaskDto.setId(task.getId());
			String json = task.getCriteria();
			exportTaskDto.setExportContext(om.readValue(json, ExportContext.class));
			dtos.add(exportTaskDto);
		}
		return dtos;
	}


}
