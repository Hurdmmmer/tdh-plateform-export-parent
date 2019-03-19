package tdh.platform.export.entity;

import java.io.Serializable;
import java.util.Date;

public class ExportTemplate implements Serializable {

	/**
	 * Column: export_template.id
	 * 
	 * @mbggenerated
	 */
	private Integer id;
	/**
	 * 类名. Column: export_template.class_name
	 * 
	 * @mbggenerated
	 */
	private String className;
	/**
	 * 方法名. Column: export_template.method_name
	 * 
	 * @mbggenerated
	 */
	private String methodName;
	/**
	 * 导出文件名. Column: export_template.file_name
	 * 
	 * @mbggenerated
	 */
	private String fileName;
	/**
	 * 备注. Column: export_template.remarks
	 * 
	 * @mbggenerated
	 */
	private String remarks;
	/**
	 * Column: export_template.DELETED
	 * 
	 * @mbggenerated
	 */
	private Byte deleted;
	/**
	 * Column: export_template.CREATED_TIME
	 * 
	 * @mbggenerated
	 */
	private Date createdTime;
	/**
	 * Column: export_template.UPDATED_TIME
	 * 
	 * @mbggenerated
	 */
	private Date updatedTime;
	/**
	 * Column: export_template.CREATED_BY
	 * 
	 * @mbggenerated
	 */
	private Integer createdBy;
	/**
	 * Column: export_template.CREATED_BY_NAME
	 * 
	 * @mbggenerated
	 */
	private String createdByName;
	/**
	 * Column: export_template.UPDATED_BY
	 * 
	 * @mbggenerated
	 */
	private Integer updatedBy;
	/**
	 * Column: export_template.UPDATED_BY_NAME
	 * 
	 * @mbggenerated
	 */
	private String updatedByName;
	/**
	 * Column: export_template.VERSION
	 * 
	 * @mbggenerated
	 */
	private Integer version;
	/**
	 * ireport,模板资源，二进制文件. Column: export_template.resource
	 * 
	 * @mbggenerated
	 */
	private byte[] resource;
	/**
	 * @mbggenerated
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @return the value of export_template.id
	 * @mbggenerated
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the value for export_template.id
	 * @mbggenerated
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the value of export_template.class_name
	 * @mbggenerated
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * @param className
	 *            the value for export_template.class_name
	 * @mbggenerated
	 */
	public void setClassName(String className) {
		this.className = className;
	}

	/**
	 * @return the value of export_template.method_name
	 * @mbggenerated
	 */
	public String getMethodName() {
		return methodName;
	}

	/**
	 * @param methodName
	 *            the value for export_template.method_name
	 * @mbggenerated
	 */
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	/**
	 * @return the value of export_template.file_name
	 * @mbggenerated
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * @param fileName
	 *            the value for export_template.file_name
	 * @mbggenerated
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	/**
	 * @return the value of export_template.remarks
	 * @mbggenerated
	 */
	public String getRemarks() {
		return remarks;
	}

	/**
	 * @param remarks
	 *            the value for export_template.remarks
	 * @mbggenerated
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	/**
	 * @return the value of export_template.DELETED
	 * @mbggenerated
	 */
	public Byte getDeleted() {
		return deleted;
	}

	/**
	 * @param deleted
	 *            the value for export_template.DELETED
	 * @mbggenerated
	 */
	public void setDeleted(Byte deleted) {
		this.deleted = deleted;
	}

	/**
	 * @return the value of export_template.CREATED_TIME
	 * @mbggenerated
	 */
	public Date getCreatedTime() {
		return createdTime;
	}

	/**
	 * @param createdTime
	 *            the value for export_template.CREATED_TIME
	 * @mbggenerated
	 */
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	/**
	 * @return the value of export_template.UPDATED_TIME
	 * @mbggenerated
	 */
	public Date getUpdatedTime() {
		return updatedTime;
	}

	/**
	 * @param updatedTime
	 *            the value for export_template.UPDATED_TIME
	 * @mbggenerated
	 */
	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}

	/**
	 * @return the value of export_template.CREATED_BY
	 * @mbggenerated
	 */
	public Integer getCreatedBy() {
		return createdBy;
	}

	/**
	 * @param createdBy
	 *            the value for export_template.CREATED_BY
	 * @mbggenerated
	 */
	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * @return the value of export_template.CREATED_BY_NAME
	 * @mbggenerated
	 */
	public String getCreatedByName() {
		return createdByName;
	}

	/**
	 * @param createdByName
	 *            the value for export_template.CREATED_BY_NAME
	 * @mbggenerated
	 */
	public void setCreatedByName(String createdByName) {
		this.createdByName = createdByName;
	}

	/**
	 * @return the value of export_template.UPDATED_BY
	 * @mbggenerated
	 */
	public Integer getUpdatedBy() {
		return updatedBy;
	}

	/**
	 * @param updatedBy
	 *            the value for export_template.UPDATED_BY
	 * @mbggenerated
	 */
	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}

	/**
	 * @return the value of export_template.UPDATED_BY_NAME
	 * @mbggenerated
	 */
	public String getUpdatedByName() {
		return updatedByName;
	}

	/**
	 * @param updatedByName
	 *            the value for export_template.UPDATED_BY_NAME
	 * @mbggenerated
	 */
	public void setUpdatedByName(String updatedByName) {
		this.updatedByName = updatedByName;
	}

	/**
	 * @return the value of export_template.VERSION
	 * @mbggenerated
	 */
	public Integer getVersion() {
		return version;
	}

	/**
	 * @param version
	 *            the value for export_template.VERSION
	 * @mbggenerated
	 */
	public void setVersion(Integer version) {
		this.version = version;
	}

	/**
	 * @return the value of export_template.resource
	 * @mbggenerated
	 */
	public byte[] getResource() {
		return resource;
	}

	/**
	 * @param resource
	 *            the value for export_template.resource
	 * @mbggenerated
	 */
	public void setResource(byte[] resource) {
		this.resource = resource;
	}
}