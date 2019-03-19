package tdh.platform.export.service.service;


import tdh.platform.export.entity.ExportContext;

public interface IExportService {
	/** 执行导出任务
	 * */
	void executeExport(ExportContext exportContext) throws Exception;
	/** 将任务状态改为异常 */
	void updateTaskStatus(Integer taskId, String errorMsg);
	public String getAttachmentURL();

	/** 设置默认生成文件的路径， 默认为 /data/x/ofc */
	public void setAttachmentURL(String attachmentURL);

}
