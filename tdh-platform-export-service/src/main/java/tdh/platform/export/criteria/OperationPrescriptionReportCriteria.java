package tdh.platform.export.criteria;

public class OperationPrescriptionReportCriteria extends BaseCriteria {

	private static final long serialVersionUID = 1L;

	/**
	 * 会员手机号
	 */
	private String custMobile;

	/**
	 * 会员名称
	 */
	private String custName;

	/**
	 * 线路id
	 */
	private Long opRouteId;

	/**
	 * 运单号
	 */
	private String shipmentNo;

	/**
	 * 干线/短驳车头供应商
	 */
	private String truckVendorName;

	/**
	 * 调箱单挂箱供应商
	 */
	private String trailerTrailerVendorName;

	/**
	 * 发车单号
	 */
	private String departNo;

	/**
	 * 起始开单时间
	 */
	private String startTime;

	/**
	 * 截止开单时间
	 */
	private String endTime;
	/**
	 * 线路名称
	 */
	private String routeName;

	public String getRouteName() {
		return routeName;
	}

	public void setRouteName(String routeName) {
		this.routeName = routeName;
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

	public Long getOpRouteId() {
		return opRouteId;
	}

	public void setOpRouteId(Long opRouteId) {
		this.opRouteId = opRouteId;
	}

	public String getShipmentNo() {
		return shipmentNo;
	}

	public void setShipmentNo(String shipmentNo) {
		this.shipmentNo = shipmentNo;
	}

	public String getTruckVendorName() {
		return truckVendorName;
	}

	public void setTruckVendorName(String truckVendorName) {
		this.truckVendorName = truckVendorName;
	}

	public String getTrailerTrailerVendorName() {
		return trailerTrailerVendorName;
	}

	public void setTrailerTrailerVendorName(String trailerTrailerVendorName) {
		this.trailerTrailerVendorName = trailerTrailerVendorName;
	}

	public String getDepartNo() {
		return departNo;
	}

	public void setDepartNo(String departNo) {
		this.departNo = departNo;
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

	@Override
	public String toString() {
		return "OperationPrescriptionReportCriteria [custMobile=" + custMobile + ", custName=" + custName
				+ ", opRouteId=" + opRouteId + ", shipmentNo=" + shipmentNo + ", truckVendorName=" + truckVendorName
				+ ", trailerTrailerVendorName=" + trailerTrailerVendorName + ", departNo=" + departNo + ", startTime="
				+ startTime + ", endTime=" + endTime + "]";
	}

}
