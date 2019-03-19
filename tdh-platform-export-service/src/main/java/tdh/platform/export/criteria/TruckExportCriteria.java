package tdh.platform.export.criteria;

public class TruckExportCriteria extends BaseCriteria {

	private static final long serialVersionUID = 1L;

	private String plateNo;
	private String tkUsageTypeCd;
	private String ownTypeCd;
	private Integer resStatus;
	private String ownerName;
	private String ownerContact;
	private Integer busyStatus;// 资源状态

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

	public String getOwnTypeCd() {
		return ownTypeCd;
	}

	public void setOwnTypeCd(String ownTypeCd) {
		this.ownTypeCd = ownTypeCd;
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

	public Integer getBusyStatus() {
		return busyStatus;
	}

	public void setBusyStatus(Integer busyStatus) {
		this.busyStatus = busyStatus;
	}

}
