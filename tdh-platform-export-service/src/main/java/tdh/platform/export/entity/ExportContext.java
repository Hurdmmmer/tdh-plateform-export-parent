package tdh.platform.export.entity;

import tdh.thunderframework.aa.context.PlatformSubject;

import java.io.Serializable;

public class ExportContext implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4246478430776220619L;

	private Integer taskId;

	private Integer exportTemplateId;
	
	private String criteria;
	
	private String exportType;
	
	private PlatformSubject subject;

	public String getCriteria() {
		return criteria;
	}

	public void setCriteria(String criteria) {
		this.criteria = criteria;
	}

	public String getExportType() {
		return exportType;
	}

	public void setExportType(String exportType) {
		this.exportType = exportType;
	}

	public Integer getExportTemplateId() {
		return exportTemplateId;
	}

	public void setExportTemplateId(Integer exportTemplateId) {
		this.exportTemplateId = exportTemplateId;
	}

	public Integer getTaskId() {
		return taskId;
	}

	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}

	public PlatformSubject getSubject() {
		return subject;
	}

	public void setSubject(PlatformSubject subject) {
		this.subject = subject;
	}

}