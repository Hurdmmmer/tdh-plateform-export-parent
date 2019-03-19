package tdh.platform.export.criteria;

/***
 * 
 * <pre>
 * Description 发车单查询参数
 * Copyright:	Copyright (c)2014  
 * Company:		上海天地汇
 * Author:		wangkun
 * Version:		1.0  
 * Created at:	2017-2-8 下午1:55:10
 * </pre>
 */
public class SearchDepartOrderCriteria extends BaseCriteria {

	private static final long serialVersionUID = 5203884935656419271L;
	/**
	 * 如果查询<br>
	 * 正在跑的车,传0，so.`SO_STATE_CD` != "SI" OR ( so.`SO_STATE_CD` IS NULL AND
	 * dpo.DEPART_STATE_CD!="ARV")<br>
	 * 已结束,传1，so.`SO_STATE_CD` = "SI" OR ( so.`SO_STATE_CD` IS NULL AND
	 * dpo.DEPART_STATE_CD="ARV")<br>
	 * 忽略条件不用传值
	 */
	private Integer departEnd = null;
	/**
	 * 发车单ID
	 */
	private Long departId;

	/**
	 * 发车单号
	 */
	private String departOrderNo;

	/**
	 * 发车类型 L:干线发车单,S:短驳发车单
	 */
	private String departTypeCd;

	/**
	 * 发车状态 L:已装车 D:在途中 ARV:已到达 UL:已接车
	 */
	private String departStateCd;

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
	 * 班组ID
	 */
	private Integer shiftGroupId;

	/**
	 * 班组名称
	 */
	private String shiftGroupName;

	/**
	 * 出发时间-起始时间
	 */
	private String departTimeStart;

	/**
	 * 出发时间-截止时间
	 */
	private String departTimeEnd;

	/**
	 * 干线发车类型
	 */
	private String departTruckTypeCd;

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
	 * 司机ID
	 */
	private String truckDriverId;

	/**
	 * 司机姓名
	 */
	private String truckDriverName;
	/**
	 * 车头供应商
	 */
	private String truckVendorName;
	/**
	 * 车头供应商ID
	 */
	private Integer truckVendorId;
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

	public String getTruckDriverId() {
		return truckDriverId;
	}

	public void setTruckDriverId(String truckDriverId) {
		this.truckDriverId = truckDriverId;
	}

	public String getTruckDriverName() {
		return truckDriverName;
	}

	public void setTruckDriverName(String truckDriverName) {
		this.truckDriverName = truckDriverName;
	}

	public Integer getTruckVendorId() {
		return truckVendorId;
	}

	public void setTruckVendorId(Integer truckVendorId) {
		this.truckVendorId = truckVendorId;
	}

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

	public Long getDepartId() {
		return departId;
	}

	public void setDepartId(Long departId) {
		this.departId = departId;
	}

	public String getDepartOrderNo() {
		return departOrderNo;
	}

	public void setDepartOrderNo(String departOrderNo) {
		this.departOrderNo = departOrderNo;
	}

	public String getDepartTypeCd() {
		return departTypeCd;
	}

	public void setDepartTypeCd(String departTypeCd) {
		this.departTypeCd = departTypeCd;
	}

	public String getDepartStateCd() {
		return departStateCd;
	}

	public void setDepartStateCd(String departStateCd) {
		this.departStateCd = departStateCd;
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

	public Integer getShiftGroupId() {
		return shiftGroupId;
	}

	public void setShiftGroupId(Integer shiftGroupId) {
		this.shiftGroupId = shiftGroupId;
	}

	public String getShiftGroupName() {
		return shiftGroupName;
	}

	public void setShiftGroupName(String shiftGroupName) {
		this.shiftGroupName = shiftGroupName;
	}

	public String getDepartTimeStart() {
		return departTimeStart;
	}

	public void setDepartTimeStart(String departTimeStart) {
		this.departTimeStart = departTimeStart;
	}

	public String getDepartTimeEnd() {
		return departTimeEnd;
	}

	public void setDepartTimeEnd(String departTimeEnd) {
		this.departTimeEnd = departTimeEnd;
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

	public String getDepartTruckTypeCd() {
		return departTruckTypeCd;
	}

	public void setDepartTruckTypeCd(String departTruckTypeCd) {
		this.departTruckTypeCd = departTruckTypeCd;
	}

	public Integer getDepartEnd() {
		return departEnd;
	}

	public void setDepartEnd(Integer departEnd) {
		this.departEnd = departEnd;
	}

	@Override
	public String toString() {
		return "SearchDepartOrderCriteria [departEnd=" + departEnd + ", departId=" + departId + ", departOrderNo="
				+ departOrderNo + ", departTypeCd=" + departTypeCd + ", departStateCd=" + departStateCd + ", routeId="
				+ routeId + ", routeName=" + routeName + ", opCompanyId=" + opCompanyId + ", opCompany=" + opCompany
				+ ", opDepartBranchId=" + opDepartBranchId + ", opDepartBranch=" + opDepartBranch + ", opDestBranchId="
				+ opDestBranchId + ", opDestBranch=" + opDestBranch + ", shiftGroupId=" + shiftGroupId
				+ ", shiftGroupName=" + shiftGroupName + ", departTimeStart=" + departTimeStart + ", departTimeEnd="
				+ departTimeEnd + ", departTruckTypeCd=" + departTruckTypeCd + ", truckPlateNo=" + truckPlateNo
				+ ", trailerPlateNo=" + trailerPlateNo + ", truckDriverMobile=" + truckDriverMobile
				+ ", truckDriverId=" + truckDriverId + ", truckDriverName=" + truckDriverName + ", truckVendorName="
				+ truckVendorName + ", truckVendorId=" + truckVendorId + ", manifestId=" + manifestId + ", sort="
				+ sort + ", sortName=" + sortName + ", ownCompanyId=" + ownCompanyId + ", ownBranchId=" + ownBranchId
				+ "]";
	}

}
