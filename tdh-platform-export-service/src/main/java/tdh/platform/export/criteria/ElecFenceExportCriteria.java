package tdh.platform.export.criteria;

public class ElecFenceExportCriteria extends BaseCriteria {
	private static final long serialVersionUID = 1L;
	
	 private String fenceName;//电子围栏名称
	 private Byte fenceTypeCd;//围栏类型
	 private String fenceCt;//城市编号
	 private String city;//城市
	public String getFenceName() {
		return fenceName;
	}
	public void setFenceName(String fenceName) {
		this.fenceName = fenceName;
	}
	public Byte getFenceTypeCd() {
		return fenceTypeCd;
	}
	public void setFenceTypeCd(Byte fenceTypeCd) {
		this.fenceTypeCd = fenceTypeCd;
	}
	public String getFenceCt() {
		return fenceCt;
	}
	public void setFenceCt(String fenceCt) {
		this.fenceCt = fenceCt;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	 
	 
	
}
