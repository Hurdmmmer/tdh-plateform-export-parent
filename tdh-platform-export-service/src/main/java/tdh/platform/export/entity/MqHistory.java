package tdh.platform.export.entity;

import java.io.Serializable;
import java.util.Date;

public class MqHistory implements Serializable {
	/**
	 * Column�� mq_history.ID
	 *
	 * @mbggenerated
	 */
	private Long id;

	/**
	 * MQ交换机. Column�� mq_history.EXCHANGE
	 *
	 * @mbggenerated
	 */
	private String exchange;

	/**
	 * 路由. Column�� mq_history.ROUTINGKEY
	 *
	 * @mbggenerated
	 */
	private String routingkey;

	/**
	 * 发送的消息. Column�� mq_history.MESSAGE
	 *
	 * @mbggenerated
	 */
	private Object message;

	/**
	 * 是否成功，1为成功. Column�� mq_history.SUCCESS
	 *
	 * @mbggenerated
	 */
	private Integer success;

	/**
	 * 待执行，这里是指，需要job重新执行的消息，为1的时候需要重新执行. Column�� mq_history.PENDING_EXEC
	 *
	 * @mbggenerated
	 */
	private Integer pendingExec;

	/**
	 * Column�� mq_history.CREATED_BY
	 *
	 * @mbggenerated
	 */
	private Integer createdBy;

	/**
	 * Column�� mq_history.CREATED_BY_NAME
	 *
	 * @mbggenerated
	 */
	private String createdByName;

	/**
	 * Column�� mq_history.CREATED_TIME
	 *
	 * @mbggenerated
	 */
	private Date createdTime;

	/**
	 * Column�� mq_history.UPDATED_BY
	 *
	 * @mbggenerated
	 */
	private Integer updatedBy;

	/**
	 * Column�� mq_history.UPDATED_BY_NAME
	 *
	 * @mbggenerated
	 */
	private String updatedByName;

	/**
	 * Column�� mq_history.UPDATED_TIME
	 *
	 * @mbggenerated
	 */
	private Date updatedTime;

	/**
	 * Column�� mq_history.VERSION
	 *
	 * @mbggenerated
	 */
	private Integer version;

	/**
	 *
	 * @mbggenerated
	 */
	private static final long serialVersionUID = -6676263228057670125L;

	/**
	 * @return the value of mq_history.ID
	 *
	 * @mbggenerated
	 */
	public Long getId() {
		return id;
	}

	/**
	 *
	 * @param id
	 *            the value for mq_history.ID
	 *
	 * @mbggenerated
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the value of mq_history.EXCHANGE
	 *
	 * @mbggenerated
	 */
	public String getExchange() {
		return exchange;
	}

	/**
	 *
	 * @param exchange
	 *            the value for mq_history.EXCHANGE
	 *
	 * @mbggenerated
	 */
	public void setExchange(String exchange) {
		this.exchange = exchange;
	}

	/**
	 * @return the value of mq_history.ROUTINGKEY
	 *
	 * @mbggenerated
	 */
	public String getRoutingkey() {
		return routingkey;
	}

	/**
	 *
	 * @param routingkey
	 *            the value for mq_history.ROUTINGKEY
	 *
	 * @mbggenerated
	 */
	public void setRoutingkey(String routingkey) {
		this.routingkey = routingkey;
	}

	/**
	 * @return the value of mq_history.MESSAGE
	 *
	 * @mbggenerated
	 */
	public Object getMessage() {
		return message;
	}

	/**
	 *
	 * @param message
	 *            the value for mq_history.MESSAGE
	 *
	 * @mbggenerated
	 */
	public void setMessage(Object message) {
		this.message = message;
	}

	/**
	 * @return the value of mq_history.SUCCESS
	 *
	 * @mbggenerated
	 */
	public Integer getSuccess() {
		return success;
	}

	/**
	 *
	 * @param success
	 *            the value for mq_history.SUCCESS
	 *
	 * @mbggenerated
	 */
	public void setSuccess(Integer success) {
		this.success = success;
	}

	/**
	 * @return the value of mq_history.PENDING_EXEC
	 *
	 * @mbggenerated
	 */
	public Integer getPendingExec() {
		return pendingExec;
	}

	/**
	 *
	 * @param pendingExec
	 *            the value for mq_history.PENDING_EXEC
	 *
	 * @mbggenerated
	 */
	public void setPendingExec(Integer pendingExec) {
		this.pendingExec = pendingExec;
	}

	/**
	 * @return the value of mq_history.CREATED_BY
	 *
	 * @mbggenerated
	 */
	public Integer getCreatedBy() {
		return createdBy;
	}

	/**
	 *
	 * @param createdBy
	 *            the value for mq_history.CREATED_BY
	 *
	 * @mbggenerated
	 */
	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * @return the value of mq_history.CREATED_BY_NAME
	 *
	 * @mbggenerated
	 */
	public String getCreatedByName() {
		return createdByName;
	}

	/**
	 *
	 * @param createdByName
	 *            the value for mq_history.CREATED_BY_NAME
	 *
	 * @mbggenerated
	 */
	public void setCreatedByName(String createdByName) {
		this.createdByName = createdByName;
	}

	/**
	 * @return the value of mq_history.CREATED_TIME
	 *
	 * @mbggenerated
	 */
	public Date getCreatedTime() {
		return createdTime;
	}

	/**
	 *
	 * @param createdTime
	 *            the value for mq_history.CREATED_TIME
	 *
	 * @mbggenerated
	 */
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	/**
	 * @return the value of mq_history.UPDATED_BY
	 *
	 * @mbggenerated
	 */
	public Integer getUpdatedBy() {
		return updatedBy;
	}

	/**
	 *
	 * @param updatedBy
	 *            the value for mq_history.UPDATED_BY
	 *
	 * @mbggenerated
	 */
	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}

	/**
	 * @return the value of mq_history.UPDATED_BY_NAME
	 *
	 * @mbggenerated
	 */
	public String getUpdatedByName() {
		return updatedByName;
	}

	/**
	 *
	 * @param updatedByName
	 *            the value for mq_history.UPDATED_BY_NAME
	 *
	 * @mbggenerated
	 */
	public void setUpdatedByName(String updatedByName) {
		this.updatedByName = updatedByName;
	}

	/**
	 * @return the value of mq_history.UPDATED_TIME
	 *
	 * @mbggenerated
	 */
	public Date getUpdatedTime() {
		return updatedTime;
	}

	/**
	 *
	 * @param updatedTime
	 *            the value for mq_history.UPDATED_TIME
	 *
	 * @mbggenerated
	 */
	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}

	/**
	 * @return the value of mq_history.VERSION
	 *
	 * @mbggenerated
	 */
	public Integer getVersion() {
		return version;
	}

	/**
	 *
	 * @param version
	 *            the value for mq_history.VERSION
	 *
	 * @mbggenerated
	 */
	public void setVersion(Integer version) {
		this.version = version;
	}
}