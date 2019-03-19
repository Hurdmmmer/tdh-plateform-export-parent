package tdh.platform.export.criteria;

public class TrailerExportCriteria extends BaseCriteria {

	private static final long serialVersionUID = 1L;

	private String plateNo;// 车牌号码.
	private String trailerTypeCd;// 车厢类型:van-厢车;flat(flatbedTruck-板车);high(highGateTruck-高栏);.
	private String ownTypeCd;// 0自有,1合同,2临时.
	private Integer resStatus;// 资源状态:0可用，1不可用.
	private String ownerName;// 车主姓名/单位.
	private String ownerContact;// 车主联系方式.
	private String cooperantTypeCd; // 合作方式
	private String resUseTypeCd; //车厢状态(车平台)
	private String busyStatus;//资源状态：忙碌，空闲。
	public String getPlateNo() {
		return plateNo;
	}

	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

	public String getTrailerTypeCd() {
		return trailerTypeCd;
	}

	public void setTrailerTypeCd(String trailerTypeCd) {
		this.trailerTypeCd = trailerTypeCd;
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

	public String getCooperantTypeCd() {
		return cooperantTypeCd;
	}

	public void setCooperantTypeCd(String cooperantTypeCd) {
		this.cooperantTypeCd = cooperantTypeCd;
	}

	public String getResUseTypeCd() {
		return resUseTypeCd;
	}

	public void setResUseTypeCd(String resUseTypeCd) {
		this.resUseTypeCd = resUseTypeCd;
	}

	public String getBusyStatus() {
		return busyStatus;
	}

	public void setBusyStatus(String busyStatus) {
		this.busyStatus = busyStatus;
	}
	
	

}
