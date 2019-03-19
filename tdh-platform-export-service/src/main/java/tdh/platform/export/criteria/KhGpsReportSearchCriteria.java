package tdh.platform.export.criteria;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * <pre>
 * Description	卡航GPS报表查询条件
 * Copyright:	Copyright (c)2014  
 * Company:		上海天地汇
 * Author:		maxbin
 * Version:		1.0  
 * Created at:	2017年11月13日 下午6:18:23
 * </pre>
 */
public class KhGpsReportSearchCriteria extends BaseCriteria {

	private static final long serialVersionUID = 1L;

	// distance
	private String tkNo;

	private String routeName;

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date departTime;

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date arriveTime;

	// fence
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date actArriveStartTime;

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date actArriveEndTime;

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date actDepartStartTime;

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date actDepartEndTime;

	private String fenceName;

	// alarm
	private String alarmTypeCd;

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date alarmStartTime;

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date alarmEndTime;

	private String departOrderNo;// 发车单
	private Integer subjectId; // 操作人信息
	private String subjectName;// 操作人信息

	public String getTkNo() {
		return tkNo;
	}

	public void setTkNo(String tkNo) {
		this.tkNo = tkNo;
	}

	public String getRouteName() {
		return routeName;
	}

	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}

	public Date getDepartTime() {
		return departTime;
	}

	public void setDepartTime(Date departTime) {
		this.departTime = departTime;
	}

	public Date getArriveTime() {
		return arriveTime;
	}

	public void setArriveTime(Date arriveTime) {
		this.arriveTime = arriveTime;
	}

	public Date getActArriveStartTime() {
		return actArriveStartTime;
	}

	public void setActArriveStartTime(Date actArriveStartTime) {
		this.actArriveStartTime = actArriveStartTime;
	}

	public Date getActArriveEndTime() {
		return actArriveEndTime;
	}

	public void setActArriveEndTime(Date actArriveEndTime) {
		this.actArriveEndTime = actArriveEndTime;
	}

	public Date getActDepartStartTime() {
		return actDepartStartTime;
	}

	public void setActDepartStartTime(Date actDepartStartTime) {
		this.actDepartStartTime = actDepartStartTime;
	}

	public Date getActDepartEndTime() {
		return actDepartEndTime;
	}

	public void setActDepartEndTime(Date actDepartEndTime) {
		this.actDepartEndTime = actDepartEndTime;
	}

	public String getFenceName() {
		return fenceName;
	}

	public void setFenceName(String fenceName) {
		this.fenceName = fenceName;
	}

	public String getAlarmTypeCd() {
		return alarmTypeCd;
	}

	public void setAlarmTypeCd(String alarmTypeCd) {
		this.alarmTypeCd = alarmTypeCd;
	}

	public Date getAlarmStartTime() {
		return alarmStartTime;
	}

	public void setAlarmStartTime(Date alarmStartTime) {
		this.alarmStartTime = alarmStartTime;
	}

	public Date getAlarmEndTime() {
		return alarmEndTime;
	}

	public void setAlarmEndTime(Date alarmEndTime) {
		this.alarmEndTime = alarmEndTime;
	}

	public Integer getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Integer subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getDepartOrderNo() {
		return departOrderNo;
	}

	public void setDepartOrderNo(String departOrderNo) {
		this.departOrderNo = departOrderNo;
	}

}
