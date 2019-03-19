package tdh.platform.export.criteria;

public class VendorExportCriteria extends BaseCriteria {

	private static final long serialVersionUID = 1L;

	private String vendorName;

	private String vendorTypeCd;

	private Integer profileId;
	
	private String memberType;
	
	private String collaState;
	
	private String fromDate;
	
	private String toDate;
	
	
	
	public Integer getProfileId() {
		return profileId;
	}

	public void setProfileId(Integer profileId) {
		this.profileId = profileId;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getVendorTypeCd() {
		return vendorTypeCd;
	}

	public void setVendorTypeCd(String vendorTypeCd) {
		this.vendorTypeCd = vendorTypeCd;
	}

	@Override
	public String getDefaultSort() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getValidSortFields() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getMemberType() {
		return memberType;
	}

	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}

	public String getCollaState() {
		return collaState;
	}

	public void setCollaState(String collaState) {
		this.collaState = collaState;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	
}
