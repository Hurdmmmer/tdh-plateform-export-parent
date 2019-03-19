package tdh.platform.export.criteria;

/**
 * 线路绑定资源导出条件
 * <pre>
 * Description
 * Copyright:	Copyright (c)2014  
 * Company:		上海天地汇
 * Author:		TDH
 * Version:		1.0  
 * Created at:	2017年5月8日 上午10:35:14  
 * </pre>
 */
public class RouteBindResourceCriteria extends BaseCriteria {

	private static final long serialVersionUID = 1L;

	private Long routeId;

	private boolean bindStatus;

	private String resTypeCd;

	public Long getRouteId() {
		return routeId;
	}

	public void setRouteId(Long routeId) {
		this.routeId = routeId;
	}

	public boolean isBindStatus() {
		return bindStatus;
	}

	public void setBindStatus(boolean bindStatus) {
		this.bindStatus = bindStatus;
	}

	public String getResTypeCd() {
		return resTypeCd;
	}

	public void setResTypeCd(String resTypeCd) {
		this.resTypeCd = resTypeCd;
	}

}
