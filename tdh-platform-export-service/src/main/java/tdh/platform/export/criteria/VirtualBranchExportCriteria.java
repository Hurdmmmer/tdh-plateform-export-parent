package tdh.platform.export.criteria;

public class VirtualBranchExportCriteria extends BaseCriteria {
	private static final long serialVersionUID = 1L;

	/**
	 * 父类网点ID；实体网点对应的branchId与parentId一致，为第一级网点
	 */
	private Long parentId;
	/**
	 * 短驳网点组织架构ID.
	 */
	private Integer orgId;

	private String address;

	/**
	 * 是否是oms组织架构的网点
	 */
	private Boolean omsOrgBranch;
	
	private String orgName;// 公司或网点名称.统称组织名称
	
	private String fenceName;//电子围栏名称

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Integer getOrgId() {
		return orgId;
	}

	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Boolean getOmsOrgBranch() {
		return omsOrgBranch;
	}

	public void setOmsOrgBranch(Boolean omsOrgBranch) {
		this.omsOrgBranch = omsOrgBranch;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getFenceName() {
		return fenceName;
	}

	public void setFenceName(String fenceName) {
		this.fenceName = fenceName;
	}
	
	
}
