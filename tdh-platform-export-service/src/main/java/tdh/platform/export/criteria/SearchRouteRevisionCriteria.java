package tdh.platform.export.criteria;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * <pre>
 * Description 线路管理中搜索线路的查询条件
 * Copyright:	Copyright (c)2014  
 * Company:		上海天地汇
 * Author:		xbb
 * Version:		1.0  
 * Created at:	2016年12月2日 下午5:57:29
 * </pre>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchRouteRevisionCriteria extends BaseCriteria {
	private static final long serialVersionUID = 1441803441809076980L;

	private Long routeId;
	private Long revisionId;
	private String opRouteId;
	private Integer departCt;
	private Integer destCt;
	private String departName;
	private String destName;
	private String opRouteName;
	private String stateCd;
	private Date effectiveFrom;
	private Date effectiveTo;
	private BigDecimal duration;
	private Integer distance;
	
	private List<Integer> departCts;
	private List<Integer> destCts;

	/**
	 * 承运商名称
	 */
	private String carrierName;

	/**
	 * 始发网点id
	 */
	private String[] departBranchIds;

	/**
	 * 目的网点id
	 */
	private String[] destBranchIds;

	/**
	 * 仅仅查询可用的线路
	 */
	private Boolean showOnlyAvailable;

	/**
	 * 根据有效性进行过滤
	 */
	private Boolean available;

	/**
	 * 查询往返
	 */
	private Boolean viewRoundtrip;

	/**
	 * 根据参数过滤,需和paramValue同时出现
	 */
	private String paramName;

	/**
	 * 根据参数值过滤,需和paramName同时出现
	 */
	private String paramValue;

	/**
	 * 是否包含被删除的线路
	 */
	private Boolean includeDeleted = false;

	/**
	 * 线路类型;N常规线路;T临时线路
	 */
	private String routeTypeCd;

	/**
	 * 线路分组
	 */
	private String routeGroupId;
	
	/**
	 * 是否查询临近的线路
	 */
	private Boolean relevantRoute = Boolean.FALSE;

	public String[] getDestBranchIds() {
		return destBranchIds;
	}

	public void setDestBranchIds(String[] destBranchIds) {
		this.destBranchIds = destBranchIds;
	}

	public Long getRouteId() {
		return routeId;
	}

	public void setRouteId(Long routeId) {
		this.routeId = routeId;
	}

	public String getOpRouteName() {
		return opRouteName;
	}

	public void setOpRouteName(String opRouteName) {
		this.opRouteName = opRouteName;
	}

	public String getCarrierName() {
		return carrierName;
	}

	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}

	public Long getRevisionId() {
		return revisionId;
	}

	public void setRevisionId(Long revisionId) {
		this.revisionId = revisionId;
	}

	public String getOpRouteId() {
		return opRouteId;
	}

	public void setOpRouteId(String opRouteId) {
		this.opRouteId = opRouteId;
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

	public String getDepartName() {
		return departName;
	}

	public void setDepartName(String departName) {
		this.departName = departName;
	}

	public String getDestName() {
		return destName;
	}

	public void setDestName(String destName) {
		this.destName = destName;
	}

	public String getStateCd() {
		return stateCd;
	}

	public void setStateCd(String stateCd) {
		this.stateCd = stateCd;
	}

	public Date getEffectiveFrom() {
		return effectiveFrom;
	}

	public void setEffectiveFrom(Date effectiveFrom) {
		this.effectiveFrom = effectiveFrom;
	}

	public Date getEffectiveTo() {
		return effectiveTo;
	}

	public void setEffectiveTo(Date effectiveTo) {
		this.effectiveTo = effectiveTo;
	}

	public BigDecimal getDuration() {
		return duration;
	}

	public void setDuration(BigDecimal duration) {
		this.duration = duration;
	}

	public Integer getDistance() {
		return distance;
	}

	public void setDistance(Integer distance) {
		this.distance = distance;
	}

	public String[] getDepartBranchIds() {
		return departBranchIds;
	}

	public void setDepartBranchIds(String[] departBranchIds) {
		this.departBranchIds = departBranchIds;
	}

	public Boolean getShowOnlyAvailable() {
		return showOnlyAvailable;
	}

	public void setShowOnlyAvailable(Boolean showOnlyAvailable) {
		this.showOnlyAvailable = showOnlyAvailable;
	}

	public Boolean getViewRoundtrip() {
		return viewRoundtrip;
	}

	public void setViewRoundtrip(Boolean viewRoundtrip) {
		this.viewRoundtrip = viewRoundtrip;
	}

	public String getParamName() {
		return paramName;
	}

	public void setParamName(String paramName) {
		this.paramName = paramName;
	}

	public String getParamValue() {
		return paramValue;
	}

	public void setParamValue(String paramValue) {
		this.paramValue = paramValue;
	}

	public Boolean getIncludeDeleted() {
		return includeDeleted;
	}

	public void setIncludeDeleted(Boolean includeDeleted) {
		this.includeDeleted = includeDeleted;
	}

	public Boolean getAvailable() {
		return available;
	}

	public void setAvailable(Boolean available) {
		this.available = available;
	}

	public Boolean getRelevantRoute() {
		return relevantRoute;
	}

	public void setRelevantRoute(Boolean relevantRoute) {
		this.relevantRoute = relevantRoute;
	}

	public String getRouteTypeCd() {
		return routeTypeCd;
	}

	public void setRouteTypeCd(String routeTypeCd) {
		this.routeTypeCd = routeTypeCd;
	}

	public String getRouteGroupId() {
		return routeGroupId;
	}

	public void setRouteGroupId(String routeGroupId) {
		this.routeGroupId = routeGroupId;
	}

	public List<Integer> getDepartCts() {
		return departCts;
	}

	public void setDepartCts(List<Integer> departCts) {
		this.departCts = departCts;
	}

	public List<Integer> getDestCts() {
		return destCts;
	}

	public void setDestCts(List<Integer> destCts) {
		this.destCts = destCts;
	}
	
	
}
