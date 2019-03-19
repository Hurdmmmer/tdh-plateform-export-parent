package tdh.platform.export.criteria;

import java.util.List;

/**
 * 
 * <pre>
 * Description
 * Copyright:	Copyright (c)2014  
 * Company:		上海天地汇
 * Author:		fy
 * Version:		1.0  
 * Created at:	2017-3-13 下午6:07:30
 * </pre>
 */
public class ExportTaskCriteria extends BaseCriteria {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4228084172250363012L;

	/**
	 * 是否是初始化page页
	 * 
	 * @return
	 */
	private String initTypePage;

	private Integer createdBy;

	private String taskType;
	
	private List<String> taskTypes;

	public String getTaskType() {
		return taskType;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	public String getInitTypePage() {
		return initTypePage;
	}

	public void setInitTypePage(String initTypePage) {
		this.initTypePage = initTypePage;
	}

	public List<String> getTaskTypes() {
		return taskTypes;
	}

	public void setTaskTypes(List<String> taskTypes) {
		this.taskTypes = taskTypes;
	}
}