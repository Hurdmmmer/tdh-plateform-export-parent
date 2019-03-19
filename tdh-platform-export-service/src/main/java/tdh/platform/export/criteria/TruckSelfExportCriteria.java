package tdh.platform.export.criteria;

public class TruckSelfExportCriteria extends BaseCriteria {

	private static final long serialVersionUID = 1L;

	private String plateNo;
	private String tkUsageTypeCd;
	private Integer resStatus;
	private String ownerName;
	private String ownerContact;

	public String getPlateNo() {
		return plateNo;
	}

	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

	public String getTkUsageTypeCd() {
		return tkUsageTypeCd;
	}

	public void setTkUsageTypeCd(String tkUsageTypeCd) {
		this.tkUsageTypeCd = tkUsageTypeCd;
	}

	public Integer getResStatus() {
		return resStatus;
	}

	public void setResStatus(Integer resStatus) {
		this.resStatus = resStatus;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerContact() {
		return ownerContact;
	}

	public void setOwnerContact(String ownerContact) {
		this.ownerContact = ownerContact;
	}

}
