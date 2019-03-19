package tdh.platform.export.criteria;

/***
 * 
 * <pre>
 * Description 短驳单查询参数
 * Copyright:	Copyright (c)2014  
 * Company:		上海天地汇
 * Author:		wangkun
 * Version:		1.0  
 * Created at:	2017-2-8 下午1:55:10
 * </pre>
 */
public class SearchShuttleOrderCriteria extends BaseCriteria {

	private static final long serialVersionUID = -8472095722507546234L;

	/**
	 * 短驳单ID
	 */
	private Long shuttleId;

	/**
	 * 短驳单号
	 */
	private String shuttleOrderNo;

	/**
	 * 短驳类型 TH:提货,SH:送货
	 */
	private String shuttleTypeCd;

	/**
	 * 运营线路ID
	 */
	private Integer routeId;

	/**
	 * 运营线路名称
	 */
	private String routeName;

	/**
	 * 运营公司ID
	 */
	private Integer opCompanyId;

	/**
	 * 运营公司名称
	 */
	private String opCompany;

	/**
	 * 出发网点ID
	 */
	private Integer opDepartBranchId;

	/**
	 * 出发网点名称
	 */
	private String opDepartBranch;

	/**
	 * 到达网点ID
	 */
	private Integer opDestBranchId;

	/**
	 * 到达网点名称
	 */
	private String opDestBranch;

	/**
	 * 开始起始时间
	 */
	private String startTime;

	/**
	 * 开始截止时间
	 */
	private String endTime;

	/**
	 * 车头牌号
	 */
	private String truckPlateNo;
	/**
	 * 车头供应商
	 */
	private String truckVendorName;
	/**
	 * 挂箱牌号
	 */
	private String trailerPlateNo;

	/**
	 * 司机手机号
	 */
	private String truckDriverMobile;

	/**
	 * 配载单ID
	 */
	private String manifestId;

	private String sort;// 排序的顺序asc or desc

	private String sortName; // 排序的列号
	/**
	 * 统一的租户信息字段用于数据隔离,所属公司ID,同运营公司id,order表的SERVICE_CO_ID
	 */
	private Integer ownCompanyId;
	/**
	 * 统一的租户信息用于数据隔离,所属网点ID,同始发网点
	 */
	private Integer ownBranchId;

	public Integer getOwnCompanyId() {
		return ownCompanyId;
	}

	public void setOwnCompanyId(Integer ownCompanyId) {
		this.ownCompanyId = ownCompanyId;
	}

	public Integer getOwnBranchId() {
		return ownBranchId;
	}

	public void setOwnBranchId(Integer ownBranchId) {
		this.ownBranchId = ownBranchId;
	}

	public Long getShuttleId() {
		return shuttleId;
	}

	public void setShuttleId(Long shuttleId) {
		this.shuttleId = shuttleId;
	}

	public String getShuttleOrderNo() {
		return shuttleOrderNo;
	}

	public void setShuttleOrderNo(String shuttleOrderNo) {
		this.shuttleOrderNo = shuttleOrderNo;
	}

	public String getShuttleTypeCd() {
		return shuttleTypeCd;
	}

	public void setShuttleTypeCd(String shuttleTypeCd) {
		this.shuttleTypeCd = shuttleTypeCd;
	}

	public Integer getRouteId() {
		return routeId;
	}

	public void setRouteId(Integer routeId) {
		this.routeId = routeId;
	}

	public String getRouteName() {
		return routeName;
	}

	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}

	public Integer getOpCompanyId() {
		return opCompanyId;
	}

	public void setOpCompanyId(Integer opCompanyId) {
		this.opCompanyId = opCompanyId;
	}

	public String getOpCompany() {
		return opCompany;
	}

	public void setOpCompany(String opCompany) {
		this.opCompany = opCompany;
	}

	public Integer getOpDepartBranchId() {
		return opDepartBranchId;
	}

	public void setOpDepartBranchId(Integer opDepartBranchId) {
		this.opDepartBranchId = opDepartBranchId;
	}

	public String getOpDepartBranch() {
		return opDepartBranch;
	}

	public void setOpDepartBranch(String opDepartBranch) {
		this.opDepartBranch = opDepartBranch;
	}

	public Integer getOpDestBranchId() {
		return opDestBranchId;
	}

	public void setOpDestBranchId(Integer opDestBranchId) {
		this.opDestBranchId = opDestBranchId;
	}

	public String getOpDestBranch() {
		return opDestBranch;
	}

	public void setOpDestBranch(String opDestBranch) {
		this.opDestBranch = opDestBranch;
	}

	public String getTruckPlateNo() {
		return truckPlateNo;
	}

	public void setTruckPlateNo(String truckPlateNo) {
		this.truckPlateNo = truckPlateNo;
	}

	public String getTrailerPlateNo() {
		return trailerPlateNo;
	}

	public void setTrailerPlateNo(String trailerPlateNo) {
		this.trailerPlateNo = trailerPlateNo;
	}

	public String getTruckDriverMobile() {
		return truckDriverMobile;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public void setTruckDriverMobile(String truckDriverMobile) {
		this.truckDriverMobile = truckDriverMobile;
	}

	public String getManifestId() {
		return manifestId;
	}

	public void setManifestId(String manifestId) {
		this.manifestId = manifestId;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getSortName() {
		return sortName;
	}

	public void setSortName(String sortName) {
		this.sortName = sortName;
	}

	public String getTruckVendorName() {
		return truckVendorName;
	}

	public void setTruckVendorName(String truckVendorName) {
		this.truckVendorName = truckVendorName;
	}

}
