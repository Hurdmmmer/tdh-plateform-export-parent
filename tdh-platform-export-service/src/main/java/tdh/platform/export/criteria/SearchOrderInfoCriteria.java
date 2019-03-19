package tdh.platform.export.criteria;

public class SearchOrderInfoCriteria extends BaseCriteria {

	private static final long serialVersionUID = 7478188814380116560L;

	private String orderId;// 订单Id
	private String orderNo;// 订单编号

	private String stateCd;// 订单状态

	private String srcProdCd;// 订单来源

	private String startTime;// 订单起始开单时间

	private String endTime;// 订单截止开单时间

	private String orderTypeCd;

	private String soStateCd;// 运单状态

	private String opRouteId;

	private String sort;// 排序的顺序asc or desc

	private String sortName; // 排序的列号

	private String shipmentNo;// 运单号

	private String shipmentStartTime;// 运单起始开单时间

	private String shipmentEndTime;// 运单截止开单时间

	private String createdStartTime;// 订单起始创建时间

	private String createdEndTime;// 订单截止创建时间

	private Integer departCt;// 线路-起运地

	private Integer destCt;// 线路-目的地

	private String custMobile;// 客户手机号

	private String custName;// 客户姓名

	private Integer shipmentFlag;// 是否已经转运单,1-是，0-否

	private Integer ownCompanyId;// 所属公司ID

	private Integer ownBranchId;// 所属网点ID,同始发网点

	private String custMgrMobile;// 客户经理手机号

	private String sourceOrderNo;// 上游单号

	public String getSourceOrderNo() {
		return sourceOrderNo;
	}

	public void setSourceOrderNo(String sourceOrderNo) {
		this.sourceOrderNo = sourceOrderNo;
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

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getStateCd() {
		return stateCd;
	}

	public void setStateCd(String stateCd) {
		this.stateCd = stateCd;
	}

	public String getSrcProdCd() {
		return srcProdCd;
	}

	public void setSrcProdCd(String srcProdCd) {
		this.srcProdCd = srcProdCd;
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

	public String getOrderTypeCd() {
		return orderTypeCd;
	}

	public void setOrderTypeCd(String orderTypeCd) {
		this.orderTypeCd = orderTypeCd;
	}

	public String getSoStateCd() {
		return soStateCd;
	}

	public void setSoStateCd(String soStateCd) {
		this.soStateCd = soStateCd;
	}

	public String getOpRouteId() {
		return opRouteId;
	}

	public void setOpRouteId(String opRouteId) {
		this.opRouteId = opRouteId;
	}

	public String getShipmentNo() {
		return shipmentNo;
	}

	public void setShipmentNo(String shipmentNo) {
		this.shipmentNo = shipmentNo;
	}

	public String getShipmentStartTime() {
		return shipmentStartTime;
	}

	public void setShipmentStartTime(String shipmentStartTime) {
		this.shipmentStartTime = shipmentStartTime;
	}

	public String getShipmentEndTime() {
		return shipmentEndTime;
	}

	public void setShipmentEndTime(String shipmentEndTime) {
		this.shipmentEndTime = shipmentEndTime;
	}

	public String getCreatedStartTime() {
		return createdStartTime;
	}

	public void setCreatedStartTime(String createdStartTime) {
		this.createdStartTime = createdStartTime;
	}

	public String getCreatedEndTime() {
		return createdEndTime;
	}

	public void setCreatedEndTime(String createdEndTime) {
		this.createdEndTime = createdEndTime;
	}

	public Integer getDepartCt() {
		return departCt;
	}

	public void setDepartCt(Integer departCt) {
		this.departCt = departCt;
	}

	public Integer getDestCt() {
		return destCt;
	}

	public void setDestCt(Integer destCt) {
		this.destCt = destCt;
	}

	public String getCustMobile() {
		return custMobile;
	}

	public void setCustMobile(String custMobile) {
		this.custMobile = custMobile;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public Integer getShipmentFlag() {
		return shipmentFlag;
	}

	public void setShipmentFlag(Integer shipmentFlag) {
		this.shipmentFlag = shipmentFlag;
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

	public String getCustMgrMobile() {
		return custMgrMobile;
	}

	public void setCustMgrMobile(String custMgrMobile) {
		this.custMgrMobile = custMgrMobile;
	}

	@Override
	public String toString() {
		return "SearchOrderInfoCriteria [orderId=" + orderId + ", orderNo=" + orderNo + ", stateCd=" + stateCd
				+ ", srcProdCd=" + srcProdCd + ", startTime=" + startTime + ", endTime=" + endTime + ", orderTypeCd="
				+ orderTypeCd + ", soStateCd=" + soStateCd + ", opRouteId=" + opRouteId + ", sort=" + sort
				+ ", sortName=" + sortName + ", shipmentNo=" + shipmentNo + ", shipmentStartTime=" + shipmentStartTime
				+ ", shipmentEndTime=" + shipmentEndTime + ", createdStartTime=" + createdStartTime
				+ ", createdEndTime=" + createdEndTime + ", departCt=" + departCt + ", destCt=" + destCt
				+ ", custMobile=" + custMobile + ", custName=" + custName + ", shipmentFlag=" + shipmentFlag
				+ ", ownCompanyId=" + ownCompanyId + ", ownBranchId=" + ownBranchId + ", custMgrMobile="
				+ custMgrMobile + ", sourceOrderNo=" + sourceOrderNo + "]";
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

}
