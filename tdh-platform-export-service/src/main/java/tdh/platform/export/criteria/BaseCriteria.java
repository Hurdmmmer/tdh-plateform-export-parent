package tdh.platform.export.criteria;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import tdh.thunder.common.Pagination;

import java.util.HashMap;
import java.util.Map;

/**
 * Criteria基类
 * 
 * <pre>
 * Description
 * Copyright:	Copyright (c)2014  
 * Company:		Criteria基类
 * Author:		lll
 * Version:		1.0  
 * Created at:	2016-11-18 4:13:32
 * </pre>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BaseCriteria extends Pagination {

	private static final long serialVersionUID = 738740608290795917L;

	/**
	 * 键值对查询 条件
	 */
	private Map<String, Object> paramsMap = new HashMap<String, Object>();

	private Integer exportTemplateId;

	private Integer branchId;

	private Integer profileId;

	public Integer getExportTemplateId() {
		return exportTemplateId;
	}

	public void setExportTemplateId(Integer exportTemplateId) {
		this.exportTemplateId = exportTemplateId;
	}

	public Map<String, Object> getParamsMap() {
		return paramsMap;
	}

	public void setParamsMap(Map<String, Object> paramsMap) {
		this.paramsMap = paramsMap;
	}

	public Integer getBranchId() {
		return branchId;
	}

	public void setBranchId(Integer branchId) {
		this.branchId = branchId;
	}

	public Integer getProfileId() {
		return profileId;
	}

	public void setProfileId(Integer profileId) {
		this.profileId = profileId;
	}

}
