package tdh.platform.export.criteria;

public class ContractChangExportCriteria extends BaseCriteria {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * 车牌号
	 */
	private String plateNo;

	/**
	 * 合作方式
	 */
	private String cooperantTypeCd;
	
	private String toVendorName;

	public String getPlateNo() {
		return plateNo;
	}

	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

	public String getCooperantTypeCd() {
		return cooperantTypeCd;
	}

	public void setCooperantTypeCd(String cooperantTypeCd) {
		this.cooperantTypeCd = cooperantTypeCd;
	}

	public String getToVendorName() {
		return toVendorName;
	}

	public void setToVendorName(String toVendorName) {
		this.toVendorName = toVendorName;
	}
}
