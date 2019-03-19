package tdh.platform.export.criteria;

public class TransManagerReportCriteria extends BaseCriteria {

	private static final long serialVersionUID = 1L;

	/**
	 * 运单号
	 */
	private String shipmentNo;

	/**
	 * 干线发车单号
	 */
	private String departOrderNo;

	/**
	 * 干线车头供应商名称
	 */
	private String departTruckVendorName;

	/**
	 * 干线车头车牌号
	 */
	private String departTruckPlaneNo;

	/**
	 * 干线车挂车牌号
	 */
	private String departTrailerPlaneNo;

	/**
	 * 客户经理手机号
	 */
	private String custMgrMobile;

	/**
	 * 客户经理姓名
	 */
	private String custMgrName;

	public String getCustMgrMobile() {
		return custMgrMobile;
	}

	public void setCustMgrMobile(String custMgrMobile) {
		this.custMgrMobile = custMgrMobile;
	}

	public String getCustMgrName() {
		return custMgrName;
	}

	public void setCustMgrName(String custMgrName) {
		this.custMgrName = custMgrName;
	}

	public String getDepartTruckPlaneNo() {
		return departTruckPlaneNo;
	}

	public void setDepartTruckPlaneNo(String departTruckPlaneNo) {
		this.departTruckPlaneNo = departTruckPlaneNo;
	}

	public String getDepartTruckVendorName() {
		return departTruckVendorName;
	}

	public void setDepartTruckVendorName(String departTruckVendorName) {
		this.departTruckVendorName = departTruckVendorName;
	}

	public String getDepartTrailerPlaneNo() {
		return departTrailerPlaneNo;
	}

	public void setDepartTrailerPlaneNo(String departTrailerPlaneNo) {
		this.departTrailerPlaneNo = departTrailerPlaneNo;
	}

	public String getShipmentNo() {
		return shipmentNo;
	}

	public void setShipmentNo(String shipmentNo) {
		this.shipmentNo = shipmentNo;
	}

	public String getDepartOrderNo() {
		return departOrderNo;
	}

	public void setDepartOrderNo(String departOrderNo) {
		this.departOrderNo = departOrderNo;
	}

	@Override
	public String toString() {
		return "TransManagerReportCriteria [shipmentNo=" + shipmentNo + ", departOrderNo=" + departOrderNo
				+ ", departTruckVendorName=" + departTruckVendorName + ", departTruckPlaneNo=" + departTruckPlaneNo
				+ ", departTrailerPlaneNo=" + departTrailerPlaneNo + ", custMgrMobile=" + custMgrMobile
				+ ", custMgrName=" + custMgrName + "]";
	}

}
