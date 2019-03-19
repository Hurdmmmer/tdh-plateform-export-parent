package tdh.platform.export.utils;

import java.math.BigDecimal;

/**
 * <pre>
 * Description
 * Copyright:	Copyright (c)2014
 * Company:		上海天地汇
 * Author:		yanhui.rao
 * Version:		1.0
 * Created at:	2016年11月22日 上午21:00:32
 * </pre>
 */

public class ExportConstants {

	private ExportConstants() {
	}

	/**
	 * 处理成功
	 */
	public static final String RES_CODE_200 = "200";

	/**
	 * 处理时出错
	 */
	public static final String RES_CODE_500 = "500";

	/**
	 * 定义响应状态码 返回成功
	 */
	public static final boolean RES_SUCCESS = true;
	/**
	 * 定义响应状态码 返回失败
	 */
	public static final boolean RES_FAILED = false;
	/**
	 * 定义异常消息长度
	 */
	public static final int RESPONSE_ERROR_MESSAGE_LENGTH = 100;
	/**
	 * 定义响应状态码 返回异常
	 */
	public static final String RESPONSE_RESULT_EXCEPTION_CODE = "-1";
	/**
	 * REDIS默认缓存过期时间4小时
	 */
	public static final Integer DEFAULTEXPIRETIME = 14400;
	/**
	 * REDIS缓存的校验时间30分
	 */
	public static final Integer VALIDATEEXPIRETIME = 1800;
	/**
	 * 字符串分隔符 ,
	 */
	public static final String SPLIT_OPERATE_TYPE1 = ",";
	/**
	 * 字符串分隔符 ;
	 */
	public static final String SPLIT_OPERATE_TYPE2 = ";";
	/**
	 * 字符串分隔符 [
	 */
	public static final String SPLIT_OPERATE_TYPE3 = "[";
	/**
	 * 字符串分隔符 ]
	 */
	public static final String SPLIT_OPERATE_TYPE4 = "]";
	/**
	 * 字符串分隔符 {
	 */
	public static final String SPLIT_OPERATE_TYPE5 = "{";
	/**
	 * 字符串分隔符 }
	 */
	public static final String SPLIT_OPERATE_TYPE6 = "}";
	/**
	 * 字符串分隔符-
	 */
	public static final String SPLIT_OPERATE_TYPE7 = "-";
	/**
	 * 字符串合并符号
	 */
	public static final String CONNECT_OPERATE_TYPE1 = "$";
	/**
	 * 保留两位小数
	 */
	public static final String FORMAT_DECIMAL_TWO = "##,###,##0.00";
	/**
	 * 保留两位小数
	 */
	public static final String FORMAT_DECIMAL_TWO_EXT = "##,###,###.##";
	/**
	 * 保留两位小数
	 */
	public static final String FORMAT_DECIMAL_THREE = "##,###,##0.000";
	/**
	 * 保留两位小数
	 */
	public static final String FORMAT_DECIMAL_THREE_EXT = "##,###,###.###";
	/**
	 * 补位显示 8位
	 */
	public static final String FORMAT_DECIMAL_EIGHT_EXT = "#######00000000";
	/**
	 * 字符拼接类型
	 */
	public static final String REPLACE_EMPTY_TYPE = "";
	/**
	 * 正则表达式对应空白字符
	 */
	public static final String RULE_OF_SPACE = "\\s";
	/**
	 * 正则表达式对应空白字符
	 */
	public static final String RULE_OF_SPACE_DEFAULT = "\\";
	/**
	 * 正则表达式对应多个空白字符
	 */
	public static final String RULE_OF_MANY_SPACE = "\\s+";
	/**
	 * 查询客户最近20个不重复的发货人信息不能为空!
	 */
	public static final String SHIPMENT_HISTORY = "查询客户最近20个不重复的发货人信息不能为空!";
	/**
	 * 查询客户对应发货单位的最近20个不重复的收货人信息!
	 */
	public static final String SHIPMENT_CNEEHISTORY = "查询客户对应发货单位的最近20个不重复的收货人信息!";
	/**
	 * 查询客户对于发货单位的最近20个不重复的货物信息!
	 */
	public static final String SHIPMENT_CARGOHISTORY = "查询客户对于发货单位的最近20个不重复的货物信息!";
	/**
	 * 删除失败错误消息
	 */
	public static final String DELTE_FAILED_MSG = "删除失败!";
	/**
	 * 添加TRUE的标识
	 */
	public static final String TRUE_FLAG = "true";
	/**
	 * 添加FALSE标识
	 */
	public static final String FALSE_FLAG = "false";

	/**
	 * byte类型表示的true值
	 */
	public static final byte BYTE_TRUE = 1;

	/**
	 * byte类型表示的false值
	 */
	public static final byte BYTE_FALSE = 0;

	/**
	 * byte类型表示的error值
	 */
	public static final byte BYTE_ERROR = 2;

	/**
	 * 逻辑删除-否
	 */
	public static final int IS_DELETE_0 = 0;

	/**
	 * 逻辑删除-是
	 */
	public static final int IS_DELETE_1 = 1;

	/**
	 * 未审核
	 */
	public static final String STATE_CD_0 = "0";
	/**
	 * 已审核
	 */
	public static final String STATE_CD_1 = "1";
	/**
	 * 审核驳回
	 */
	public static final String STATE_CD_2 = "2";

	/**
	 * redis前缀-结算对象
	 */
	public static final String REDIS_PREFIX_TARGET = "TARGET:";

	/**
	 * redis前缀-系统消息
	 */
	public static final String REDIS_PREFIX_SYSMSG = "SYSMSG:";

	/**
	 * PropertyUtils 属性拷贝出错
	 */
	public static final int PROPCOPY_ERROR_INT = 501;

	/**
	 * 绑定发票操作方式,财务
	 */
	public static final String INOVICE_OPERATE_TYPE_FIN = "FIN_";
	/**
	 * 绑定发票操作方式,业务
	 */
	public static final String INOVICE_OPERATE_TYPE_BIZ = "BIZ_";

	/**
	 * 审核状态：0未审核；1通过；2失败
	 */
	public static final String STATES_CODE_0 = "0";
	public static final String STATES_CODE_1 = "1";
	public static final String STATES_CODE_2 = "2";

	/**
	 * 导出任务状态：0新创建，1处理异常，9处理完成
	 */
	public static final byte TASK_STATUS_0 = 0;
	public static final byte TASK_STATUS_1 = 1;
	public static final byte TASK_STATUS_9 = 9;

	/**
	 * 数据库操作成功code
	 */
	public static final String OPERATION_CODE_1 = "1";

	/**
	 * 缓存key--运营线路
	 */
	public static final String ROUTE_CACHE_KEY = "RouteSelection";

	/**
	 * 网点线路选择的key前缀
	 */
	public static final String BRANCH_ROUTE_CACHE_KEY = "BranchRouteSelection";

	/**
	 * 缓存key--系统参数
	 */
	public static final String SYSPARAM_CACHE_KEY = "tdh.platform.ofc.querySysParameterByParamName:";

	/**
	 * 缓存key--组织架构
	 */
	public static final String ORG_CACHE_KEY = "tdh.platform.ofc.org.listOrg";

	/**
	 * 缓存key--线路分配规则
	 */
	public static final String ROUTE_DISPATCH_RULE_CACHE_KEY = "OperationRuleBiz:ROUTE_DISPATCH";

	/**
	 * 缓存key--网点
	 */
	public static final String BRANCH_CACHE_KEY = "tdh.platform.ofc.branch.listBranch";

	/**
	 * 运输资源类型
	 */
	public static final String TRANS_RES_TYPE_CD_TD = "TD";// 司机
	public static final String TRANS_RES_TYPE_CD_TK = "TK";// 车头
	public static final String TRANS_RES_TYPE_CD_TR = "TR";// 车挂（车厢）

	public static final int TRANS_RES_NULL_601 = 601;// 资源id为空

	public static final int CONTRACT_ID_NULL_602 = 602;// 合同id为空
	/**
	 * 组织架构
	 */
	public static final String ORG_TYPE_CD_DEPT = "0";// 部门
	public static final String ORG_TYPE_CD_COMPANY = "1";// 公司
	public static final String ORG_TYPE_CD_BRANCH = "2";// 网点

	public static final BigDecimal BIG_DECIMAL_NEG_1 = new BigDecimal("-1");
	public static final BigDecimal BIG_DECIMAL_0 = new BigDecimal("0");

	public static final String ORDER_PREFIX_FC = "FC";

	/**
	 * 规则计算结果中的运营公司id的参数key
	 */
	public static final String KEY_COMPANY_ID = "COMPANY_ID";

	/**
	 * 规则计算结果中的运营公司始发网点id的参数key
	 */
	public static final String KEY_DEPART_BRANCH_ID = "DEPART_BRANCH_ID";

	/**
	 * 规则计算结果中的运营公司目的网点id的参数key
	 */
	public static final String KEY_DEST_BRANCH_ID = "DEST_BRANCH_ID";

	/**
	 * 规则计算结果中的提货短驳运营公司id的参数key
	 */
	public static final String KEY_DEPART_SHUTTLE_COMPANY_ID = "DEPART_SHUTTLE_COMPANY_ID";

	/**
	 * 规则计算结果中的提货短驳公司网点id的参数key
	 */
	public static final String KEY_DEPART_SHUTTLE_BRANCH_ID = "DEPART_SHUTTLE_BRANCH_ID";

	/**
	 * 规则计算结果中的送货短驳公司id的参数key
	 */
	public static final String KEY_DEST_SHUTTLE_COMPANY_ID = "DEST_SHUTTLE_COMPANY_ID";

	/**
	 * 规则计算结果中的送货短驳公司网点id的参数key
	 */
	public static final String KEY_DEST_SHUTTLE_BRANCH_ID = "DEST_SHUTTLE_BRANCH_ID";

	public static final byte VERSION_0 = 0;

	public static final Byte VERSION_DEL = -1;

	/**
	 * 系统操作员ID
	 */
	public static final Integer SYS_SUBJECT_ID = 0;

	/**
	 * 系统操作员姓名
	 */
	public static final String SYS_SUBJECT_NAME = "系统";

	/**
	 * 客户对账列表导出
	 */
	public static final String EXPORT_TASK_TYPE_ORDERTARGE = "客户对账";
	/**
	 * 收款登记列表导出
	 */
	public static final String EXPORT_TASK_TYPE_DEBITNOTE = "收款登记";
	/**
	 * 收款对账单明细导出
	 */
	public static final String EXPORT_TASK_TYPE_STATECUSDET = "收款对账单明细";
	/**
	 * 付款对账单明细导出
	 */
	public static final String EXPORT_TASK_TYPE_STATESUPPDET = "付款对账单明细";

	/**
	 * admin 线路资源导出
	 */
	public static final String EXPORT_TASK_TYPE_ROUTERESOURCE = "线路资源";

	/**
	 * admin 线路价格信息导出
	 */
	public static final String EXPORT_TASK_TYPE_ROUTEPRICE = "线路价格";

	/**
	 * admin 司机列表导出
	 */
	public static final String EXPORT_TASK_TYPE_DRIVERRESOURCE = "司机列表";

	/**
	 * admin 车头列表导出
	 */
	public static final String EXPORT_TASK_TYPE_TRUCKRESOURCE = "车头列表";

	/**
	 * admin 车厢列表导出
	 */
	public static final String EXPORT_TASK_TYPE_TRAILERRESOURCE = "车厢列表";

	/**
	 * admin 供应商列表导出
	 */
	public static final String EXPORT_TASK_TYPE_VENDORRESOURCE = "承运商列表";

	/**
	 * admin 调厢记录列表导出
	 */
	public static final String EXPORT_TASK_TYPE_CONTRACT_CHANGES_RESOURCE = "调厢记录列表";

	/**
	 * admin 导出类型-司机列表
	 */
	public static final String EXPORT_TYPE_DRIVERRESOURCE = "SJLB";

	/**
	 * admin 导出类型-车头列表
	 */
	public static final String EXPORT_TYPE_TRUCKRESOURCE = "CTLB";

	/**
	 * admin 导出类型-车厢列表
	 */
	public static final String EXPORT_TYPE_TRAILERRESOURCE = "CXLB";

	/**
	 * admin 导出类型-供应商列表
	 */
	public static final String EXPORT_TYPE_VENDORRESOURCE = "VDLB";

	/**
	 * admin 导出类型-调厢记录列表
	 */
	public static final String EXPORT_TYPE_CONTRACT_CHANGES_RESOURCE = "TXJLLB";

	/**
	 * admin 导出类型-线路资源
	 */
	public static final String EXPORT_TYPE_ROUTERESOURCE = "XLZY";

	/**
	 * admin 导出类型-线路价格
	 */
	public static final String EXPORT_TYPE_ROUTEPRICE = "XLJG";

	/**
	 * 导出类型-客户对账
	 */
	public static final String EXPORT_TYPE_ORDERTARGE = "KHDZ";
	/**
	 * 导出类型-收款登记
	 */
	public static final String EXPORT_TYPE_DEBITNOTE = "SKDJ";
	/**
	 * 导出类型-收款对账单明细
	 */
	public static final String EXPORT_TYPE_STATECUSDET = "SKDZDMX";
	/**
	 * 导出类型-付款对账单明细
	 */
	public static final String EXPORT_TYPE_STATESUPPDET = "FKDZDMX";

	/**
	 * 运单列表导出
	 */
	public static final String EXPORT_TASK_TYPE_SHIPMENT = "运单列表";

	/**
	 * 公司运单列表导出
	 */
	public static final String EXPORT_TASK_TYPE_COMPANY_SHIPMENT = "公司运单列表";
	/**
	 * 公司发车单列表导出
	 */
	public static final String EXPORT_TASK_TYPE_COMPANY_DEPART = "公司发车单列表";
	/**
	 * 发车单列表导出
	 */
	public static final String EXPORT_TASK_TYPE_DEPART = "发车单列表";

	/**
	 * 短驳发车单列表导出
	 */
	public static final String EXPORT_TASK_TYPE_SHUTTLE_DEPART = "短驳发车单列表";

	/**
	 * 短驳服务单列表导出
	 */
	public static final String EXPORT_TASK_TYPE_SHUTTLE_SHIP = "短驳服务单列表";

	/**
	 * 短驳外包单列表导出
	 */
	public static final String EXPORT_TASK_TYPE_SHUTTLE = "短驳外包单列表";

	/**
	 * 公司短驳外包单列表导出
	 */
	public static final String EXPORT_TASK_TYPE_COMPANY_SHUTTLE = "公司短驳外包单列表";

	/**
	 * 调箱单列表导出
	 */
	public static final String EXPORT_TASK_TYPE_TRAILER_ORDER = "调箱单列表";

	/**
	 * 公司调箱单列表导出
	 */
	public static final String EXPORT_TASK_TYPE_COMPANY_TRAILER_ORDER = "公司调箱单列表";

	/**
	 * 营业数据报表导出
	 */
	public static final String EXPORT_TASK_TYPE_KH_MANAGER_REPORT = "营业数据报表";

	/**
	 * 运营日报表导出
	 */
	public static final String EXPORT_TASK_TYPE_TRANS_MANAGER_REPORT = "运营日报表";

	/**
	 * 运作时效报表导出
	 */
	public static final String EXPORT_TASK_TYPE_OPERATION_PRESCRIPTION_REPORT = "运作时效报表";

	/**
	 * 车辆里程报表
	 */
	public static final String EXPORT_TASK_TYPE_KH_GPS_REPORT_DISTANCE = "车辆里程报表";

	/**
	 * 车辆进出报表
	 */
	public static final String EXPORT_TASK_TYPE_KH_GPS_REPORT_FENCE = "车辆进出报表";

	/**
	 * 车辆预警消息报表
	 */
	public static final String EXPORT_TASK_TYPE_KH_GPS_REPORT_ALARM = "车辆预警消息报表";

	/**
	 * 导出类型-运单列表
	 */
	public static final String EXPORT_TYPE_SHIPMENT = "SHIP";
	/**
	 * 导出类型-公司运单列表
	 */
	public static final String EXPORT_TYPE_COMPANY_SHIPMENT = "COMPANYSHIP";
	/**
	 * 导出类型-公司发车单列表
	 */
	public static final String EXPORT_TYPE_COMPANY_DEPART = "COMPANYDEPART";
	/**
	 * 导出类型-发车单列表
	 */
	public static final String EXPORT_TYPE_DEPART = "DEPART";

	/**
	 * 导出类型-短驳发车单列表
	 */
	public static final String EXPORT_TYPE_SHUTTLE_DEPART = "SHUTTLEDEPART";

	/**
	 * 导出类型-短驳服务单列表
	 */
	public static final String EXPORT_TYPE_SHUTTLE_SHIP = "SHUTTLESHIP";

	/**
	 * 导出类型-短驳外包单列表
	 */
	public static final String EXPORT_TYPE_SHUTTLE = "SHUTTLE";

	/**
	 * 导出类型-公司短驳外包单列表
	 */
	public static final String EXPORT_TYPE_COMPANY_SHUTTLE = "COMPANYSHUTTLE";

	/**
	 * 导出类型-调箱单列表
	 */
	public static final String EXPORT_TYPE_TRAILER_ORDER = "TRAILERORDER";

	/**
	 * 导出类型-公司调箱单列表
	 */
	public static final String EXPORT_TYPE_COMPANY_TRAILER_ORDER = "COMPANYTRAILERORDER";

	/**
	 * 导出类型-营业数据报表
	 */
	public static final String EXPORT_TYPE_KH_MANAGER_REPORT = "KHMANAGERREPORT";

	/**
	 * 导出类型-运营日报表
	 */
	public static final String EXPORT_TYPE_TRANS_MANAGER_REPORT = "TRANSMANAGERREPORT";

	/**
	 * 导出类型-运作时效报表
	 */
	public static final String EXPORT_TYPE_OPERATION_PRESCRIPTION_REPORT = "OPERATIONPRESCRIPTIONREPORT";

	/**
	 * 导出类型-车辆里程报表
	 */
	public static final String EXPORT_TYPE_KH_GPS_REPORT_DISTANCE = "KHGPSREPORTDISTANCE";

	/**
	 * 导出类型-车辆进出报表
	 */
	public static final String EXPORT_TYPE_KH_GPS_REPORT_FENCE = "KHGPSREPORTFENCE";

	/**
	 * 导出类型-车辆预警消息报表
	 */
	public static final String EXPORT_TYPE_KH_GPS_REPORT_ALARM = "KHGPSREPORTALARM";

	/**
	 * 导出类型-优卡订单列表
	 */
	public static final String EXPORT_TYPE_YK_UTORDER = "YKUTORDER";

	/**
	 * 导出类型-优卡异常订单列表
	 */
	public static final String EXPORT_TYPE_YK_UTORDERABNORMAL = "YKUTORDERABNORMAL";

	/**
	 * 导出类型-优卡报表
	 */
	public static final String EXPORT_TYPE_YK_UTREPORT = "YKUTREPORT";

	/**
	 * 资源类型RESOURCE_TYPE_CD不为GROUP
	 */
	public static final String RESOURCE_NOT_GROUP = "GROUP";

	/**
	 * 甩挂校验，资源是否绑定线路上
	 */
	public static final String RESOURCE_ON_ROUTE = "1";

	/**
	 * 甩挂校验，资源被占用
	 */
	public static final String RESOURCE_BE_USED = "2";

	/**
	 * 甩挂校验，资源不在当前网点
	 */
	public static final String RESOURCE_NOT_BRANCH = "3";

	/**
	 * 字典表value1的值表示正
	 */
	public static final String DICT_VALUE_TYPE_ADD = "ADD";

	/**
	 * 字典表value1的值表示负
	 */
	public static final String DICT_VALUE_TYPE_MINUS = "MINUS";

	/**
	 * 应收预收款列表导出
	 */
	public static final String EXPORT_TASK_TYPE_RECEIVE = "应收预收款列表";

	/**
	 * 发票申请单号前缀
	 */
	public static final String INVOICE_APPLY_NO_PREFIX_IA = "IA";

	/**
	 * 驳回原因前缀
	 */
	public static final String CANCLE_PREFIX = "驳回原因:";

	/**
	 * 固定发票抬头
	 */
	public static final String INVOICE_FINAL_PAYEE = "泉州天地汇物流发展有限公司";

	/**
	 * 固定发票抬头
	 */
	public static final String INVOICE_APPLY_INVOICE_PREFIX = "BKP";

	/**
	 * 结算对象 -- 个人 发票对象:路桥费报销
	 */
	public static final String FIN_PERSONAL_TARGET_UUID_RBF = "FIN_PERSONAL_TARGET_UUID_RBF";

	/**
	 * 结算对象 -- 个人 发票对象:税务代开
	 */
	public static final String FIN_PERSONAL_TARGET_UUID_LAC = "FIN_PERSONAL_TARGET_UUID_LAC";

	/**
	 * 会员类型 B -- 企业
	 */
	public static final String MEMBER_CLASS_TYPE_B = "B";

	/**
	 * 上游对账单列表导出
	 */
	public static final String EXPORT_TASK_TYPE_UPSTREAM_STATE = "上游对账单列表";

	/**
	 * 油费对账单列表导出
	 */
	public static final String EXPORT_TASK_TYPE_OIL_STATE = "油费对账单列表";

	/**
	 * 油费对账单明细导出
	 */
	public static final String EXPORT_TASK_TYPE_OIL_STATE_DETAIL = "油费对账单明细";

	/**
	 * 承运人对账单列表导出
	 */
	public static final String EXPORT_TASK_TYPE_CARR_STATE = "承运人对账单列表";

	/**
	 * 承运人对账单明细导出
	 */
	public static final String EXPORT_TASK_TYPE_CARR_STATE_DETAIL = "承运人对账单明细";

	/**
	 * 导出类型-应收预收款列表
	 */
	public static final String EXPORT_TYPE_RECEIVE = "RECEIVE";

	/**
	 * 导出类型-上游对账单列表
	 */
	public static final String EXPORT_TYPE_UPSTREAM_STATE = "UPSTREAMSTATE";

	/**
	 * 导出类型-油费对账单列表
	 */
	public static final String EXPORT_TYPE_OIL_STATE = "OILSTATE";

	/**
	 * 导出类型-油费对账单明细
	 */
	public static final String EXPORT_TYPE_OIL_STATE_DETAIL = "OILSTATEDETAIL";

	/**
	 * 导出类型-承运人对账单列表
	 */
	public static final String EXPORT_TYPE_CARR_STATE = "CARRSTATE";

	/**
	 * 导出类型-承运人对账单明细
	 */
	public static final String EXPORT_TYPE_CARR_STATE_DETAIL = "CARRSTATEDETAIL";

	/**
	 * 结算中心-profileId
	 */
	public static final String REDIS_PREFIX_PROFILEID = "PROFILEID:";

	/**
	 * 人民币 -- RMB
	 */
	public static final String MONEY_RMB = "人民币";

	/**
	 * 美元 -- DOLLAR
	 */
	public static final String MONEY_DOLLAR = "美元";

	/**
	 * 运单来源 -- 天地卡航 TDKH
	 */
	public static final String SYSTEM_RESOURCE_TDKH = "TDKH";
	/**
	 * 运单来源 -- 优卡 UT
	 */
	public static final String SYSTEM_RESOURCE_UT = "UT";
	/**
	 * 运单来源 -- 园区 YQ
	 */
	public static final String SYSTEM_RESOURCE_YQ = "YQ";
	/**
	 * 无车承运documentName -- 无车承运人电子路单
	 */
	public static final String CARRIER_DOCUMENT_NAME = "无车承运人电子路单";
	/**
	 * 无车承运documentVersionNumber -- 2015WCCYR
	 */
	public static final String CARRIER_DOCUMENT_VERSION_NUMBER = "2015WCCYR";

	/**
	 * 无车承运 resultCode -- 1
	 */
	public static final String RESULT_CODE_ONE = "1";
	/**
	 * 无车承运 车辆载质量
	 */
	public static final String NOCAR_VEHICLE_TONNAGE_MAX = "NOCAR_VEHICLE_TONNAGE_MAX";
	/**
	 * 无车承运 货币总金额
	 */
	public static final String NOCAR_TOTAL_AMOUNT_MAX = "NOCAR_TOTAL_AMOUNT_MAX";
	/**
	 * 无车承运 货物项毛重
	 */
	public static final String NOCAR_GOODS_WEIGHT_MAX = "NOCAR_GOODS_WEIGHT_MAX";
	/**
	 * 无车承运 牌照类型代码
	 */
	public static final String NOCAR_PLATE_TYPE = "NOCAR_PLATE_TYPE";
	/**
	 * 无车承运 业务类型代码
	 */
	public static final String NOCAR_BUSI_TYPE = "NOCAR_BUSI_TYPE";
	/**
	 * 无车承运 车辆分类代码
	 */
	public static final String NOCAR_CAR_SORT = "NOCAR_CAR_SORT";
	/**
	 * 无车承运 货物类型分类代码
	 */
	public static final String NOCAR_GOODS_SORT = "NOCAR_GOODS_SORT";
	/**
	 * 无车承运 完成时间大于发车时间的分钟数
	 */
	public static final String NOCAR_TIME_MINUTE = "NOCAR_TIME_MINUTE";
	/**
	 * 无车承运 上报单据时间天数
	 */
	public static final String NOCAR_TIME_DAY = "NOCAR_TIME_DAY";

	/**
	 * 大区网点 -0
	 */
	public static final String VALUEOF_REGION_BRANCH = "0";

	/**
	 * 挂箱供应商对账列表导出
	 */
	public static final String EXPORT_TASK_TYPE_TRUNKBOX = "挂箱供应商";

	/**
	 * 干线供应商对账列表导出
	 */
	public static final String EXPORT_TASK_TYPE_TRUNK = "干线供应商";

	/**
	 * 短驳供应商对账列表导出
	 */
	public static final String EXPORT_TASK_TYPE_SHORT = "短驳供应商";

	/**
	 * 调账管理列表导出
	 */
	public static final String EXPORT_TASK_TYPE_SUPPLIER_ADJUS_DETAIL = "调账管理";

	/**
	 * 导出类型-调账管理明细
	 */
	public static final String EXPORT_TYPE_SUPPLIER_ADJUS_DETAIL = "TZGL";

	/**
	 * 收款核销列表导出
	 */
	public static final String EXPORT_TASK_TYPE_RECEIPT = "收款核销";

	/**
	 * 导出类型-收款核销
	 */
	public static final String EXPORT_TYPE_RECEIPT = "SKHX";

	/**
	 * 付款申请单列表导出
	 */
	public static final String EXPORT_TASK_TYPE_RECEIPT_APPLY_BILL = "付款申请单";

	/**
	 * 导出类型-付款申请单
	 */
	public static final String EXPORT_TYPE_RECEIPT_APPLY_BILL = "FKSQD";

	/**
	 * TMS零担运单列表导出
	 */
	public static final String EXPORT_TASK_TYPE_TMS = "TMS零担运单列表";

	/**
	 * 导出类型-TMS零担运单列表
	 */
	public static final String EXPORT_TYPE_TMS = "TMS";

	/**
	 * 合同类型-签约合同
	 */
	public static final String CONTRACT_TYPE_QY = "QY";

	/**
	 * 合同类型-常跑车合同
	 */
	public static final String CONTRACT_TYPE_B = "B";

	/**
	 * 合同类型-临时合同
	 */
	public static final String CONTRACT_TYPE_C = "C";

	/**
	 * admin 导出类型-自营车头列表
	 */
	public static final String EXPORT_TYPE_SELFTRUCKRESOURCE = "ZYCTLB";

	/**
	 * admin 自营车头列表导出
	 */
	public static final String EXPORT_TASK_TYPE_SELFTRUCKRESOURCE = "自营车头列表";

	/**
	 * admin 导出类型-签约合同列表
	 */
	public static final String EXPORT_TYPE_SignContract = "QYHTLB";

	/**
	 * admin 签约合同列表导出
	 */
	public static final String EXPORT_TASK_TYPE_SignContract = "签约合同列表";

	/**
	 * admin 导出类型-外雇合同列表
	 */
	public static final String EXPORT_TYPE_TempContract = "WGHTLB";

	/**
	 * admin 外雇合同列表导出
	 */
	public static final String EXPORT_TASK_TYPE_TempContract = "外雇合同列表";

	/**
	 * 结算系统对接支付的证书密码
	 */
	public static final String PAY_SIGN_PASSWORD = "123456";

	/**
	 * 客户 结算对象身份-客户组(包含CUST,CUST_T)
	 */
	public static final String FIN_TARGET_UCAT_CUST_GROUP = "CUST_GROUP";
	/**
	 * admin 导出类型-电子围栏
	 */
	public static final String EXPORT_TYPE_ElecFence = "WLLB";

	/**
	 * admin 电子围栏列表导出
	 */
	public static final String EXPORT_TASK_TYPE_ElecFence = "围栏列表";

	/**
	 * admin 导出类型-电子围栏
	 */
	public static final String EXPORT_TYPE_Branch = "WDLB";

	/**
	 * admin 电子围栏列表导出
	 */
	public static final String EXPORT_TASK_TYPE_Branch = "网点列表";
	/**
	 * 无车承运参考文档PDF
	 */
	public static final String LOGINK_PDF = "LOGINK_PDF";

	/**
	 * 无车承运参考文档EXCEL
	 */
	public static final String LOGINK_EXCEL = "LOGINK_EXCEL";

	/**
	 * 处理OK -- 200
	 */
	public static final Integer RES_CODE_INT_200 = 200;

	/**
	 * 卡航3.0标识
	 */
	public static final String BIZ_TYPE_V3 = "V3";

	/**
	 * 卡航2.0标识
	 */
	public static final String BIZ_TYPE_V2 = "V2";

	/**
	 * 导出类型-开票申请单列表
	 */
	public static final String EXPORT_TYPE_INVOICE_APPLY = "INVOICEAPPLY";

	/**
	 * 开票申请单列表导出
	 */
	public static final String EXPORT_TASK_TYPE_INVOICE_APPLY = "开票申请单列表";

	/**
	 * 申请开票列表导出
	 */
	public static final String EXPORT_TASK_TYPE_INVAPPLYORDER = "申请开票";

	/**
	 * 鹰眼订单异常列表
	 */
	public static final String EXPORT_TASK_TYPE_YKUTORDERANOMALY = "YKUTORDERANOMALY";

	/**
	 * 鹰眼会员登录异常列表
	 */
	public static final String EXPORT_TASK_TYPE_YKUTCUSTOMERLOGINANOMALY = "YKUTCUSTOMERLOGINANOMALY";

	/**
	 * 鹰眼设备登录异常列表
	 */
	public static final String EXPORT_TASK_TYPE_YKUTDEVICELOGINANOMALY = "YKUTDEVICELOGINANOMALY";

	/**
	 * 鹰眼订单异常详情列表
	 */
	public static final String EXPORT_TASK_TYPE_YKUTORDERANOMALYDETAIL = "YKUTORDERANOMALYDETAIL";

	/**
	 * 开票申请单关联单据列表导出
	 */
	public static final String EXPORT_TASK_TYPE_INVAPPLYINFO = "开票申请单关联单据";
}