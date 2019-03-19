package tdh.platform.export.dao;


import org.apache.ibatis.annotations.Param;
import tdh.platform.export.entity.MqHistory;
import tdh.platform.export.entity.MqHistoryExample;

import java.util.List;

public interface IMqHistoryMapper {
    /**
     * This method corresponds to the database table mq_history
     *
     * @mbggenerated
     */
    int countByExample(MqHistoryExample example);

    /**
     * This method corresponds to the database table mq_history
     *
     * @mbggenerated
     */
    int deleteByExample(MqHistoryExample example);

    /**
     * This method corresponds to the database table mq_history
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method corresponds to the database table mq_history
     *
     * @mbggenerated
     */
    int insert(MqHistory record);

    /**
     * This method corresponds to the database table mq_history
     *
     * @mbggenerated
     */
    int insertSelective(MqHistory record);

    /**
     * This method corresponds to the database table mq_history
     *
     * @mbggenerated
     */
    List<MqHistory> selectByExample(MqHistoryExample example);

    /**
     * This method corresponds to the database table mq_history
     *
     * @mbggenerated
     */
    MqHistory selectByPrimaryKey(Long id);

    /**
     * This method corresponds to the database table mq_history
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") MqHistory record, @Param("example") MqHistoryExample example);

    /**
     * This method corresponds to the database table mq_history
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") MqHistory record, @Param("example") MqHistoryExample example);

    /**
     * This method corresponds to the database table mq_history
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MqHistory record);

    /**
     * This method corresponds to the database table mq_history
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MqHistory record);
}