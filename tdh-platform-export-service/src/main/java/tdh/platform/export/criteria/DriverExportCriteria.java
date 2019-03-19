package tdh.platform.export.criteria;

public class DriverExportCriteria extends BaseCriteria {

	private static final long serialVersionUID = 1L;

	private String resName;
	private String driverTel;
	private String ownTypeCd;
	private String idNo;
	private Integer locateBranchId;

	public String getResName() {
		return resName;
	}

	public void setResName(String resName) {
		this.resName = resName;
	}

	public String getOwnTypeCd() {
		return ownTypeCd;
	}

	public void setOwnTypeCd(String ownTypeCd) {
		this.ownTypeCd = ownTypeCd;
	}

	public String getIdNo() {
		return idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	public Integer getLocateBranchId() {
		return locateBranchId;
	}

	public void setLocateBranchId(Integer locateBranchId) {
		this.locateBranchId = locateBranchId;
	}

	public String getDriverTel() {
		return driverTel;
	}

	public void setDriverTel(String driverTel) {
		this.driverTel = driverTel;
	}

}
