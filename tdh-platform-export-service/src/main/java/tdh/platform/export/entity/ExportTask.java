package tdh.platform.export.entity;

import java.io.Serializable;
import java.util.Date;

public class ExportTask implements Serializable {

	/**
	 * Column: ofc_task.ID
	 * 
	 * @mbggenerated
	 */
	private Integer id;
	/**
	 * 任务名称. Column: ofc_task.TASK_NAME
	 * 
	 * @mbggenerated
	 */
	private String taskName;
	/**
	 * 任务类型. Column: ofc_task.TASK_TYPE
	 * 
	 * @mbggenerated
	 */
	private String taskType;
	/**
	 * 任务状态：0新创建，1处理中，9处理完成. Column: ofc_task.TASK_STATUS
	 * 
	 * @mbggenerated
	 */
	private Byte taskStatus;
	/**
	 * 附件. Column: ofc_task.ATTACHMENT
	 * 
	 * @mbggenerated
	 */
	private String attachment;
	/**
	 * 归属用户. Column: ofc_task.CREATED_BY
	 * 
	 * @mbggenerated
	 */
	private Integer createdBy;
	/**
	 * 0正常，1删除. Column: ofc_task.DELETED
	 * 
	 * @mbggenerated
	 */
	private Byte deleted;
	/**
	 * Column: ofc_task.CREATED_TIME
	 * 
	 * @mbggenerated
	 */
	private Date createdTime;
	/**
	 * Column: ofc_task.UPDATED_BY
	 * 
	 * @mbggenerated
	 */
	private Integer updatedBy;
	/**
	 * Column: ofc_task.UPDATED_TIME
	 * 
	 * @mbggenerated
	 */
	private Date updatedTime;

	private String remark;

	private String criteria;

	public String getCriteria() {
		return criteria;
	}

	public void setCriteria(String criteria) {
		this.criteria = criteria;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * @mbggenerated
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @return the value of ofc_task.ID
	 * @mbggenerated
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the value for ofc_task.ID
	 * @mbggenerated
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the value of ofc_task.TASK_NAME
	 * @mbggenerated
	 */
	public String getTaskName() {
		return taskName;
	}

	/**
	 * @param taskName
	 *            the value for ofc_task.TASK_NAME
	 * @mbggenerated
	 */
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	/**
	 * @return the value of ofc_task.TASK_TYPE
	 * @mbggenerated
	 */
	public String getTaskType() {
		return taskType;
	}

	/**
	 * @param taskType
	 *            the value for ofc_task.TASK_TYPE
	 * @mbggenerated
	 */
	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

	/**
	 * @return the value of ofc_task.TASK_STATUS
	 * @mbggenerated
	 */
	public Byte getTaskStatus() {
		return taskStatus;
	}

	/**
	 * @param taskStatus
	 *            the value for ofc_task.TASK_STATUS
	 * @mbggenerated
	 */
	public void setTaskStatus(Byte taskStatus) {
		this.taskStatus = taskStatus;
	}

	/**
	 * @return the value of ofc_task.ATTACHMENT
	 * @mbggenerated
	 */
	public String getAttachment() {
		return attachment;
	}

	/**
	 * @param attachment
	 *            the value for ofc_task.ATTACHMENT
	 * @mbggenerated
	 */
	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}

	/**
	 * @return the value of ofc_task.CREATED_BY
	 * @mbggenerated
	 */
	public Integer getCreatedBy() {
		return createdBy;
	}

	/**
	 * @param createdBy
	 *            the value for ofc_task.CREATED_BY
	 * @mbggenerated
	 */
	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * @return the value of ofc_task.DELETED
	 * @mbggenerated
	 */
	public Byte getDeleted() {
		return deleted;
	}

	/**
	 * @param deleted
	 *            the value for ofc_task.DELETED
	 * @mbggenerated
	 */
	public void setDeleted(Byte deleted) {
		this.deleted = deleted;
	}

	/**
	 * @return the value of ofc_task.CREATED_TIME
	 * @mbggenerated
	 */
	public Date getCreatedTime() {
		return createdTime;
	}

	/**
	 * @param createdTime
	 *            the value for ofc_task.CREATED_TIME
	 * @mbggenerated
	 */
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	/**
	 * @return the value of ofc_task.UPDATED_BY
	 * @mbggenerated
	 */
	public Integer getUpdatedBy() {
		return updatedBy;
	}

	/**
	 * @param updatedBy
	 *            the value for ofc_task.UPDATED_BY
	 * @mbggenerated
	 */
	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}

	/**
	 * @return the value of ofc_task.UPDATED_TIME
	 * @mbggenerated
	 */
	public Date getUpdatedTime() {
		return updatedTime;
	}

	/**
	 * @param updatedTime
	 *            the value for ofc_task.UPDATED_TIME
	 * @mbggenerated
	 */
	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}
}