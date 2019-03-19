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
public class SearchTrailerOrderCriteria extends BaseCriteria {

	private static final long serialVersionUID = 1L;

	/**
	 * 调箱单ID
	 */
	private Long trailerId;

	/**
	 * 调箱单号
	 */
	private String trailerOrderNo;

	/**
	 * 调箱单类型
	 */
	private String trailerTypeCd;

	/**
	 * 调箱单状态 N:新建 L:已装车 D:在途中 ARV:已到达 UL:已接车
	 */
	private String trailerStateCd;

	/**
	 * 运营线路ID.
	 */
	private Integer routeId;

	/**
	 * 运营线路名称.
	 */
	private String routeName;

	/**
	 * 运营公司ID:泉发展.
	 */
	private Integer opCompanyId;

	/**
	 * 运营公司:泉发展.
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
	 * 挂箱牌号
	 */
	private String trailerPlateNo;

	/**
	 * 挂箱供应商ID
	 */
	private Integer trailerVendorId;
	/**
	 * 挂箱供应商
	 */
	private String trailerVendorName;

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
	 * 车头牌号
	 */
	private String truckPlateNo;

	/**
	 * 配载单ID.
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

	public String getTruckVendorName() {
		return truckVendorName;
	}

	public void setTruckVendorName(String truckVendorName) {
		this.truckVendorName = truckVendorName;
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

	public Long getTrailerId() {
		return trailerId;
	}

	public void setTrailerId(Long trailerId) {
		this.trailerId = trailerId;
	}

	public String getTrailerOrderNo() {
		return trailerOrderNo;
	}

	public void setTrailerOrderNo(String trailerOrderNo) {
		this.trailerOrderNo = trailerOrderNo;
	}

	public String getTrailerTypeCd() {
		return trailerTypeCd;
	}

	public void setTrailerTypeCd(String trailerTypeCd) {
		this.trailerTypeCd = trailerTypeCd;
	}

	public String getTrailerStateCd() {
		return trailerStateCd;
	}

	public void setTrailerStateCd(String trailerStateCd) {
		this.trailerStateCd = trailerStateCd;
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

	public Integer getTrailerVendorId() {
		return trailerVendorId;
	}

	public void setTrailerVendorId(Integer trailerVendorId) {
		this.trailerVendorId = trailerVendorId;
	}

	public String getTrailerVendorName() {
		return trailerVendorName;
	}

	public void setTrailerVendorName(String trailerVendorName) {
		this.trailerVendorName = trailerVendorName;
	}

	@Override
	public String toString() {
		return "SearchTrailerOrderCriteria [trailerId=" + trailerId + ", trailerOrderNo=" + trailerOrderNo
				+ ", trailerTypeCd=" + trailerTypeCd + ", trailerStateCd=" + trailerStateCd + ", routeId=" + routeId
				+ ", routeName=" + routeName + ", opCompanyId=" + opCompanyId + ", opCompany=" + opCompany
				+ ", opDepartBranchId=" + opDepartBranchId + ", opDepartBranch=" + opDepartBranch + ", opDestBranchId="
				+ opDestBranchId + ", opDestBranch=" + opDestBranch + ", shiftGroupId=" + shiftGroupId
				+ ", shiftGroupName=" + shiftGroupName + ", trailerPlateNo=" + trailerPlateNo + ", trailerVendorId="
				+ trailerVendorId + ", trailerVendorName=" + trailerVendorName + ", truckDriverMobile="
				+ truckDriverMobile + ", truckDriverId=" + truckDriverId + ", truckDriverName=" + truckDriverName
				+ ", truckVendorName=" + truckVendorName + ", truckVendorId=" + truckVendorId + ", manifestId="
				+ manifestId + ", sort=" + sort + ", sortName=" + sortName + ", ownCompanyId=" + ownCompanyId
				+ ", ownBranchId=" + ownBranchId + "]";
	}

}
