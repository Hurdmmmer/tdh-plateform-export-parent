package tdh.platform.export.criteria;

/**
 * 
 * <pre>
 * Description
 * Copyright:	Copyright (c)2014  
 * Company:		上海天地汇
 * Author:		TDH
 * Version:		1.0  
 * Created at:	2017年2月10日 下午6:12:26
 * </pre>
 */
public class SearchShuttleShipOrderCriteria extends BaseCriteria {

	private static final long serialVersionUID = 1L;

	/**
	 * 短驳单ID
	 */
	private Long shuttleShipId;

	/**
	 * 短驳订单单号（对应ofc-order）
	 */
	private String orderNo;

	/**
	 * 短驳运单运单单号.
	 */
	private String shuttleShipOrderNo;

	/**
	 * 短驳运单状态 TS:转运单 L:已装车 D:在途中 ARV:已到达 UL:已接车.
	 */
	private String shuttleShipStateCd;

	/**
	 * 短驳运单类型 TH:提货,SH:送货.
	 */
	private String shuttleShipTypeCd;

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
	 * 起始时间
	 */
	private String startTime;

	/**
	 * 截止时间
	 */
	private String endTime;

	/**
	 * 车头牌号
	 */
	private String truckPlateNo;

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

	/**
	 * 0-按计划开始时间查询
	 * 
	 * 1-按实际开始时间查询
	 * 
	 * 2-按计划结束时间查询
	 * 
	 * 3-按实际结束时间查询
	 */
	private Integer queryTimeFlag;

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

	public Long getShuttleShipId() {
		return shuttleShipId;
	}

	public void setShuttleShipId(Long shuttleShipId) {
		this.shuttleShipId = shuttleShipId;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getShuttleShipOrderNo() {
		return shuttleShipOrderNo;
	}

	public void setShuttleShipOrderNo(String shuttleShipOrderNo) {
		this.shuttleShipOrderNo = shuttleShipOrderNo;
	}

	public String getShuttleShipStateCd() {
		return shuttleShipStateCd;
	}

	public void setShuttleShipStateCd(String shuttleShipStateCd) {
		this.shuttleShipStateCd = shuttleShipStateCd;
	}

	public String getShuttleShipTypeCd() {
		return shuttleShipTypeCd;
	}

	public void setShuttleShipTypeCd(String shuttleShipTypeCd) {
		this.shuttleShipTypeCd = shuttleShipTypeCd;
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

	public void setTruckDriverMobile(String truckDriverMobile) {
		this.truckDriverMobile = truckDriverMobile;
	}

	public String getManifestId() {
		return manifestId;
	}

	public void setManifestId(String manifestId) {
		this.manifestId = manifestId;
	}

	public Integer getQueryTimeFlag() {
		return queryTimeFlag;
	}

	public void setQueryTimeFlag(Integer queryTimeFlag) {
		this.queryTimeFlag = queryTimeFlag;
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

}
