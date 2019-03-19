package tdh.platform.export.service.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import tdh.platform.export.entity.ExportTaskDto;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;


public interface IExportTaskService {

	Integer createExportTask(ExportTaskDto exportTaskDto) throws IllegalAccessException, InvocationTargetException,
			NoSuchMethodException, JsonProcessingException;

	List<ExportTaskDto> exportTaskList() throws IOException;


}
