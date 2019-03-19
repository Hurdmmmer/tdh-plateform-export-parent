package tdh.platform.export.dao;


import org.apache.ibatis.annotations.Param;
import tdh.platform.export.entity.ExportTemplate;
import tdh.platform.export.entity.ExportTemplateExample;


import java.util.List;

public interface IExportTemplateMapper {

	/**
	 * This method corresponds to the database table export_template
	 * @mbggenerated
	 */
	int countByExample(ExportTemplateExample example);

	/**
	 * This method corresponds to the database table export_template
	 * @mbggenerated
	 */
	int deleteByExample(ExportTemplateExample example);

	/**
	 * This method corresponds to the database table export_template
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method corresponds to the database table export_template
	 * @mbggenerated
	 */
	int insert(ExportTemplate record);

	/**
	 * This method corresponds to the database table export_template
	 * @mbggenerated
	 */
	int insertSelective(ExportTemplate record);

	/**
	 * This method corresponds to the database table export_template
	 * @mbggenerated
	 */
	List<ExportTemplate> selectByExampleWithBLOBs(ExportTemplateExample example);

	/**
	 * This method corresponds to the database table export_template
	 * @mbggenerated
	 */
	List<ExportTemplate> selectByExample(ExportTemplateExample example);

	/**
	 * This method corresponds to the database table export_template
	 * @mbggenerated
	 */
	ExportTemplate selectByPrimaryKey(Integer id);

	/**
	 * This method corresponds to the database table export_template
	 * @mbggenerated
	 */
	int updateByExampleSelective(@Param("record") ExportTemplate record, @Param("example") ExportTemplateExample example);

	/**
	 * This method corresponds to the database table export_template
	 * @mbggenerated
	 */
	int updateByExampleWithBLOBs(@Param("record") ExportTemplate record, @Param("example") ExportTemplateExample example);

	/**
	 * This method corresponds to the database table export_template
	 * @mbggenerated
	 */
	int updateByExample(@Param("record") ExportTemplate record, @Param("example") ExportTemplateExample example);

	/**
	 * This method corresponds to the database table export_template
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(ExportTemplate record);

	/**
	 * This method corresponds to the database table export_template
	 * @mbggenerated
	 */
	int updateByPrimaryKeyWithBLOBs(ExportTemplate record);

	/**
	 * This method corresponds to the database table export_template
	 * @mbggenerated
	 */
	int updateByPrimaryKey(ExportTemplate record);
}