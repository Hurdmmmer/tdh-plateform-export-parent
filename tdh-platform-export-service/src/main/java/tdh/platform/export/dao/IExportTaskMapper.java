package tdh.platform.export.dao;


import org.apache.ibatis.annotations.Param;
import tdh.platform.export.criteria.ExportTaskCriteria;
import tdh.platform.export.entity.ExportTask;
import tdh.platform.export.entity.ExportTaskDto;
import tdh.platform.export.entity.ExportTaskExample;

import java.util.List;

public interface IExportTaskMapper {

	/**
	 * This method corresponds to the database table ofc_task
	 * 
	 * @mbggenerated
	 */
	int countByExample(ExportTaskExample example);

	/**
	 * This method corresponds to the database table ofc_task
	 * 
	 * @mbggenerated
	 */
	int deleteByExample(ExportTaskExample example);

	/**
	 * This method corresponds to the database table ofc_task
	 * 
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method corresponds to the database table ofc_task
	 * 
	 * @mbggenerated
	 */
	int insert(ExportTask record);

	/**
	 * This method corresponds to the database table ofc_task
	 * 
	 * @mbggenerated
	 */
	int insertSelective(ExportTask record);

	/**
	 * This method corresponds to the database table ofc_task
	 * 
	 * @mbggenerated
	 */
	List<ExportTask> selectByExample(ExportTaskExample example);

	/**
	 * This method corresponds to the database table ofc_task
	 * 
	 * @mbggenerated
	 */
	ExportTask selectByPrimaryKey(Integer id);

	/**
	 * This method corresponds to the database table ofc_task
	 * 
	 * @mbggenerated
	 */
	int updateByExampleSelective(@Param("record") ExportTask record, @Param("example") ExportTaskExample example);

	/**
	 * This method corresponds to the database table ofc_task
	 * 
	 * @mbggenerated
	 */
	int updateByExample(@Param("record") ExportTask record, @Param("example") ExportTaskExample example);

	/**
	 * This method corresponds to the database table ofc_task
	 * 
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(ExportTask record);

	/**
	 * This method corresponds to the database table ofc_task
	 * 
	 * @mbggenerated
	 */
	int updateByPrimaryKey(ExportTask record);

	int countExportTaskList(ExportTaskCriteria criteria);

	List<ExportTaskDto> selectExportTaskList(ExportTaskCriteria criteria);

	List<ExportTask> selectTaskList();

}