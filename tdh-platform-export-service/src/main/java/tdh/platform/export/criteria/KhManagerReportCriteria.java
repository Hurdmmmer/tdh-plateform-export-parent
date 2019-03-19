package tdh.platform.export.criteria;

public class KhManagerReportCriteria extends BaseCriteria {

	private static final long serialVersionUID = -8145651595992171872L;

	/**
	 * 客户手机号码
	 */
	private String custMobile;

	/**
	 * 客户名称.
	 */
	private String custName;

	/**
	 * 线路出发地城市代号
	 * 
	 */
	private Integer departCt;

	/**
	 * 线路目的地城市代号
	 */
	private Integer destCt;

	/**
	 * 开始时间
	 */
	private String startTime;

	/**
	 * 截止时间
	 */
	private String endTime;

	/**
	 * 运单号
	 */
	private String shipmnetNo;

	/**
	 * 发车单号
	 */
	private String departNo;

	/**
	 * 干线/短驳供应商名称
	 */
	private String vendorName;

	/**
	 * 干线/短驳车头牌号
	 */
	private String headPlateNo;

	/**
	 * 调箱挂箱车牌号.
	 */
	private String trailerTrailerPlateNo;

	/**
	 * 开票状态
	 */
	private String invoiceStatusCd;

	/**
	 * 对账状态
	 */
	private String finStateId;

	/**
	 * 调箱单-挂箱供应商
	 */
	private String trailerTrailerVendorName;

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

	public String getShipmnetNo() {
		return shipmnetNo;
	}

	public void setShipmnetNo(String shipmnetNo) {
		this.shipmnetNo = shipmnetNo;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getInvoiceStatusCd() {
		return invoiceStatusCd;
	}

	public void setInvoiceStatusCd(String invoiceStatusCd) {
		this.invoiceStatusCd = invoiceStatusCd;
	}

	public String getFinStateId() {
		return finStateId;
	}

	public void setFinStateId(String finStateId) {
		this.finStateId = finStateId;
	}

	public String getDepartNo() {
		return departNo;
	}

	public void setDepartNo(String departNo) {
		this.departNo = departNo;
	}

	public String getHeadPlateNo() {
		return headPlateNo;
	}

	public void setHeadPlateNo(String headPlateNo) {
		this.headPlateNo = headPlateNo;
	}

	public String getTrailerTrailerPlateNo() {
		return trailerTrailerPlateNo;
	}

	public void setTrailerTrailerPlateNo(String trailerTrailerPlateNo) {
		this.trailerTrailerPlateNo = trailerTrailerPlateNo;
	}

	public String getTrailerTrailerVendorName() {
		return trailerTrailerVendorName;
	}

	public void setTrailerTrailerVendorName(String trailerTrailerVendorName) {
		this.trailerTrailerVendorName = trailerTrailerVendorName;
	}

}
