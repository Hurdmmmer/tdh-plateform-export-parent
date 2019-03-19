package tdh.platform.export.utils;

/**
 * 系统消息的键值。本文件可通过tools项目自动从数据库读取生成。
 * 
 * <pre>
 * Description
 * Copyright:	Copyright (c)2014  
 * Company:		上海天地汇
 * Author:		eric
 * Version:		1.0  
 * Created at:	2016年11月13日 下午3:05:14
 * </pre>
 */
public interface M {

	/**
	 * 每个单据中每个结算对象只能用于一种身份(TargetRoleCd)
	 */
	String FIN_ORDERTARGET_UNEQUALS = "fin.ordertarget.unequals";

	/**
	 * 暂不支持单据中包含结算对象【收/付】两种收支类型同时存在
	 */
	String FIN_ORDERTARGET_ACCOUNTTYPE_UNEQUALS = "fin.ordertarget.accounttype.unequals";
	/**
	 * 缺少参数
	 */
	String FIN_PARAMS_NOT_FOUND = "fin.params.not.found";
	/**
	 * 传入的参数无效(没有找到对应数据)
	 */
	String FIN_PARAMS_INVALID = "fin.params.invalid";

	/**
	 * 内部数据信息错误
	 */
	String FIN_INTERNAL_DATA_ERROE = "fin.internal.data.error";

	/**
	 * 传入的金额区间不对(大于0,小于等于总额)
	 */
	String FIN_CASH_PARAMS_AMOUNT_ERROE = "fin.cash.params.amount.error";
	/**
	 * 不可重复提交交账信息
	 */
	String FIN_CASH_APPLY_REPEAT = "fin.cash.apply.repeat";
	/**
	 * 交账信息已处理结束
	 */
	String FIN_CASH_APPLY_END = "fin.cash.apply.end";
	/**
	 * 结算单中尚存在现金结算未结束
	 */
	String FIN_STATE_CASH_NO_END = "fin.state.cash.no.end";
	/**
	 * 部分结算单已经生产对账单
	 */
	String FIN_STATE_SUBMIT_REPEAT = "fin.state.submit.repeat";
	/**
	 * 对账单状态不匹配，不可更新对账单
	 */
	String FIN_STATE_ALREADY_END = "fin.state.already.end";
	/**
	 * 无效的参数
	 */
	String SHP_ERR_PARAMS_INVALID = "shp.err.params.invalid";
	/**
	 * 对账单无此发票类型
	 */
	String STATE_ERROR_NO_INVOICE_TYPE = "state.error.no.invoice.type";

	/**
	 * 传入的结算对象{0}并非平台会员，请添加后重试
	 */
	String FIN_TARGET_NOT_MEMBER = "fin.target.not.member";

	/**
	 * 当前运单状态不可修改
	 */
	String SHP_ERR_UPDATE_STATE = "shp.err.update.state";

	/**
	 * 取消费用登记失败，订单号{0}以被提交过{1}张申请单
	 */
	String FIN_REGR_CANCEL_ERROR_CASH_APPLY = "fin.regr.cancel.error.cash.apply";

	/**
	 * 取消费用登记失败，订单号{0}已生成{1}张对账单
	 */
	String FIN_REGR_CANCEL_ERROR_STATE = "fin.regr.cancel.error.state";

	/**
	 * 对账单状态为已确认才可作废
	 */
	String FIN_STATE_CONFIRM_ERROR = "fin.state.confirm.error";

	/**
	 * 未设置规则
	 */
	String RULE_NOT_SPECIFIED = "rule.not.specified";

	/**
	 * 未找到规则
	 */
	String RULE_NOT_FOUND = "rule.not.found";

	String COMMON_RECORD_NOT_FOUND = "common.record.not.found";

	String ROUTE_CANNOT_BE_DELETED = "route.cannot.be.deleted";

	String ROUTE_NOT_FOUND = "route.not.found";

	/**
	 * user def 对账单状态不符合调账的规则
	 */
	String FIN_STATE_NOT_ADJUST = "fin.state.not.adjust";

	/**
	 * 已核销或部分核销的不允许删除
	 */
	String FIN_DEBITNOTE_NOT_DELETE = "fin.debitnote.not.delete";

	/**
	 * 收款账单删除失败
	 */
	String FIN_DEBITNOTE_ERROR_DELETE = "fin.debitnote.error.delete";

	/**
	 * 删除成功
	 */
	String SUCCESS_DELETE = "success.delete";

	/**
	 * 删除失败
	 */
	String FAIL_DELETE = "fail.delete";

	/**
	 * 保存成功
	 */
	String SUCCESS_SAVE = "success.save";

	/**
	 * 保存失败
	 */
	String FAIL_SAVE = "fail.save";

	/**
	 * 纯运费不能小于线路底价
	 */
	String SHP_ERR_FREIGHT = "shp.err.freight";

	/**
	 * {0}类发票可用开票额度不足.
	 */
	String FIN_STATE_INVOICE_AMOUNT_INSI = "fin.state.invoice.amount.insi";

	/**
	 * 导出类型不匹配
	 */
	String EXPORT_TYPE_ERROR = "export.type.error";

	/**
	 * 发票已经绑定对账单
	 */
	String INVOICE_BIND_STATE_IS_TRUE = "invoice.bind.state.is.true";

	/**
	 * 对账单已经作废，不能进行其他操作
	 */
	String FIN_STATEMENT_STAT_INVA = "fin.statement.stat.inva";

	/**
	 * 对账单已经完成，不能进行其他操作
	 */
	String FIN_STATEMENT_STAT_FULF = "fin.statement.stat.fulf";

	/**
	 * 对账单状态已绑定发票或者已结算，不允许再做调账操作。
	 */
	String FIN_STATEMENT_AUDIT_NOTALLOWED = "fin.statement.audit.notallowed";

	/**
	 * 发票类型不对应
	 */
	String FIN_INVOICE_TYPE_NOT_MATCH = "fin.invoice.type.not.match";

	/**
	 * 对账单下该发票类型可开票金额不足
	 */
	String INVOICE_TYPE_DIFFAMOUNT_ZERO = "invoice.type.diffamount.zero";

	/**
	 * 对账单状态已经生成付款单
	 */
	String STATEMENT_RECEIPT_EXIST = "statement.receipt.exist";

	/**
	 * 对账单已经生成开票申请单
	 */
	String FIN_STATE_HAVE_INVOICE_APPLY = "fin.state.have.invoice.apply";
	/**
	 * 对账单已经生成发票核销单
	 */
	String FIN_STATE_HAVE_INVOICE_DEBIT = "fin.state.have.invoice.debit";

	/**
	 * 对账单状态必须为已确认才可进行此操作
	 */
	String STATEMENT_STATUS_MUST_LOCK = "statement_status_must_lock";

	/**
	 * 导出列表为空,不可以进行导出
	 */
	String EXPORT_LIST_SIZE_ZERO = "export_list_size_zero";

	/**
	 * 取消费用登记失败，订单号{0}已被核销
	 */
	String FIN_REGR_CANCEL_ERROR_DEBIT = "fin.regr.cancel.error.debit";

	/**
	 * 业务类型不匹配
	 */
	String BUSINESS_TYPE_NOT_MATCH = "business.type.not.match";

	/**
	 * 对账单状态已变更，请刷新页面后重试
	 */
	String STATEMENT_STATUS_CHANGED = "statement.status.changed";

	/**
	 * 角色为企业的会员名称必须相同
	 */
	String STATEMENT_MEMBER_NAME_NOT_MATCH = "statement.member.name.not.match";

	/**
	 * 会员信息已经存在
	 */
	String MEMBER_HAVE_EXIST = "member_have_exist";

	/**
	 * 文件不可以为空
	 */
	String FILE_IS_EMPTY = "file_is_empty";

	/**
	 * 读取文件内容为空
	 */
	String FILE_READ_EMPTY = "file.read.empty";

	/**
	 * 文件不是Excel
	 */
	String FILE_IS_NOT_EXCEL = "file_is_not_excel";
	/**
	 * 导入数量不能超过1000条
	 */
	String IMPORT_NUMBER_LIMIT_THOUSAND = "import_number_limit_thousand";
	/**
	 * 结算对象不一致
	 */
	String TARGET_UUID_NOT_MATCH = "target_uuid_not_match";
	/**
	 * 第{0}行,单号为空
	 */
	String ORDER_NO_IS_BLANK = "order_no_is_blank";

	/**
	 * 第{0}行单号{1},重复存在
	 */
	String ORDER_NO_REPEAT = "order_no_repeat";

	/**
	 * 单号{0},已经生成对账单
	 */
	String ORDER_STATEMENT_IS_BIND = "order_statement_is_bind";

	/**
	 * 单号{0},不存在
	 */
	String ORDER_NO_NOT_EXIST = "order_no_not_exist";

	/**
	 * 执行该操作的结算中心不一致
	 */
	String SETTLEMENT_CENTER_NOT_MATCH = "settlement.center.not.match";

	/**
	 * 执行该操作的业务网点不一致
	 */
	String OWN_BRANCH_NOT_MATCH = "own.branch.not.match";

	/**
	 * 第{0}行,[{1}]格式不正确,正确格式:[{2}],参考文档:无车承运人电子路单报文格式.pdf
	 */
	String NOCAR_CARRIER_DATA_VALIDATE = "nocar_carrier_data_validate";

	/**
	 * 第{0}行,[{1}]值在代码集中不存在,正确格式:[{2}],参考文档:无车承运人文档说明.xlsx
	 */
	String NOCAR_CARRIER_CODE_NOT_EXIST = "nocar_carrier_code_not_exist";

	/**
	 * 第{0}行,[{1}]必须在[{2}]之后
	 */
	String NOCAR_CARRIER_DATE_VALIDATE = "nocar_carrier_date_validate";

	/**
	 * 第{0}行,[{1}]不能迟于[{2}]{3}天
	 */
	String NOCAR_CARR_DATE_OUT_TWO_MONTH = "nocar_carr_date_out_two_month";

	/**
	 * 第{0}行,[{1}]应该大于等于[{2}]{3}分钟
	 */
	String NOCAR_CARR_DATE_OUT_HOUR = "nocar.carr.date.out.hour";

	/**
	 * 字典表中不存在此DTCODE:{0}
	 */
	String NOCAR_CARR_DTCODE_NOT_EXIST = "nocar_carr_dtcode_not_exist";
	/**
	 * 车牌号:{0}已经存在,不允许重复添加
	 */
	String NOCAR_PLATE_NO_IS_EXIST = "nocar.plate.no.is.exist";
	/**
	 * 与车牌号:{0}相关联的数据为空
	 */
	String NOCAR_PLATE_NO_UNION_DATA_NULL = "nocar.plate.no.union.data.null";
	/**
	 * 您目前登录的组织架构较高，请登录具体网点后再操作。
	 */
	String OPERA_TO_ORG_BRANCH_AUTH = "opera.to.org.branch.auth";

	/**
	 * 单据已经生成对账单，取消失败
	 */
	String ORDER_IS_BIND_STATEMENT = "order.is.bind.statement";

	/**
	 * 发票已经绑定过开票申请单
	 */
	String INVOICE_BIND_INVOICE_APPLY_IS_TRUE = "invoice.bind.invoice.apply.is.true";

	/**
	 * 单号{0}发票绑定过金额，取消失败
	 */
	String INVOICE_BIND_MONEY_IS_TRUE = "invoice.bind.money.is.true";

	/**
	 * 发票申请单已经绑定过发票
	 */
	String INVOICE_APPLY_BIND_INVOICE_IS_TRUE = "invoice.apply.bind.invoice.is.true";
	/**
	 * 核销单据收付类型不一致
	 */
	String DEBIT_ACCOUNT_TYPE_CD_NOT_MATCH = "debit.account.type.cd.not.match";
	/**
	 * 收款登记信息对应的调整单有误
	 */
	String DEBIT_NOT_MATCH_ADJUST_ORDER = "debit.not.match.adjust.order";

	/**
	 * 对账单金额必须为正数
	 */
	String ORDER_STATEMENT_AMOUNT_IS_INVALID = "order.statement.amount.is.invalid";

	/**
	 * 该调整单已经关联过收款登记
	 */
	String FIN_ADJUST_UNION_DEBIT_IS_TRUE = "fin.adjust.union.debit.is.true";

	/**
	 * 单据已结算
	 */
	String FIN_ORDER_ACCOUNT_STATUS_IS_DONE = "fin.order.account.status.is.done";

	/**
	 * 支付金额大于单据金额
	 */
	String FIN_ORDER_AMOUNT_IS_INVALID = "fin.order.amount.is.invalid";

	/**
	 * 单号为{}的单据信息不存在
	 */
	String FIN_ORDER_TARGET_MAPPING_NOT_EXIST = "fin.order.target.mapping.not.exist";

	/**
	 * 支付单据{0}正在支付或者已支付
	 */
	String FIN_ORDER_STATUS_INVALID = "fin.order.status.invalid";

	/**
	 * 线路不同
	 */
	String ROUTE_GROUP_NOT_MATCH = "route.group.not.match";

	/**
	 * 导入数量不能超过200条
	 */
	String IMPORT_NUMBER_LIMIT_TWO_HUNDRED = "import.number.limit.two.hundred";

	/**
	 * 承运人角色不匹配
	 */
	String TARGET_ROLE_CD_NOT_MATCH = "target.role.cd.not.match";

	/**
	 * 结算对象不存在
	 */
	String FIN_TARGET_NOT_EXIST = "fin.target.not.exist";

	/**
	 * 手机号{0}对应的结算对象不唯一
	 */
	String FIN_TARGET_HAVE_MORE = "fin.target.have.more";

	/**
	 * 结算对象手机号为空
	 */
	String FIN_TARGET_ACCOUNT_NO_BLANK = "fin.target.account.no.blank";

	/**
	 * 会员UUID为空
	 */
	String FIN_TARGET_UUID_BLANK = "fin.target.uuid.blank";

	/**
	 * 对账单已无可付金额生成付款单
	 */
	String STATEMENT_RECEIPT_AMOUNT_ERROR = "statement.receipt.amount.error";

	/**
	 * 付款申请单未关联任何的对账单或单据明细
	 */
	String RECEIPT_FOUND_NO_DETAIL = "receipt.found.no.detail";

	/**
	 * 结算角色不同
	 */
	String TARGET_UCAT_NOT_MATCH = "target.ucat.not.match";

	/**
	 * 取消费用登记失败，订单号{0}已生成付款申请单
	 */
	String FIN_REGR_CANCEL_ERROR_RECEIPT = "fin.regr.cancel.error.receipt";

	/**
	 * 您有未完成的线上交易，请先完成线上交易！
	 */
	String HAS_NOT_COMPLETED_TRADE = "has.not.completed.trade";

	/**
	 * 客户尚未签约为卡航会员
	 */
	String USER_NOT_SIGN_KH_MEMBER = "user.not.sign.kh.member";

	/**
	 * 只有已接单状态的订单才能转运单
	 */
	String ORDER_STATUS_ISNOT_ALERADY_RECEIVE_ORDER = "order.status.isnot.alerady.receive.order";

	/**
	 * 数据转换错误(用于PropertyUtils.copyProperties())
	 */
	String DATA_TRANS_ERROR = "data.trans.error";

	/**
	 * 使用的线路已被删除,线路名称：{0},线路Id：{1}
	 */
	String ORDER_USE_ROUTE_ALERADY_DELETED = "order.use.route.alerady.deleted";

	/**
	 * 找不到对应的运单
	 */
	String ORDER_NOT_FOUND_SHIPMENT = "order.not.found.shipment";

	/**
	 * 运单信息已经发生变化
	 */
	String ORDER_SHIPMENT_INFO_ALERADY_CHANGED = "order.shipment.info.alerady.changed";

	/**
	 * 找不到对应的线路费用数据
	 */
	String ORDER_NOT_FOUND_ROUTE_COST_DATA = "order.not.found.route.cost.data";

	/**
	 * 已经生成发车单，不可修改
	 */
	String ORDER_DEPART_ALERADY_CREATED_NOT_MODIFICATION = "order.depart.alerady.created.not.modification";

	/**
	 * 已经生成调箱单，不可修改
	 */
	String ORDER_TRAILER_ALERADY_CREATED_NOT_MODIFICATION = "order.trailer.alerady.created.not.modification";

	/**
	 * 已经生成短驳外包单，不可修改
	 */
	String ORDER_SHUTTLE_ALERADY_CREATED_NOT_MODIFICATION = "order.shuttle.alerady.created.not.modification";

	/**
	 * 已经生成发车单，不可关闭
	 */
	String ORDER_DEPART_ALERADY_CREATED_NOT_CLOSED = "order.depart.alerady.created.not.closed";

	/**
	 * 已经生成调箱单，不可关闭
	 */
	String ORDER_TRAILER_ALERADY_CREATED_NOT_CLOSED = "order.trailer.alerady.created.not.closed";

	/**
	 * 已经生成短驳外包单，不可关闭
	 */
	String ORDER_SHUTTLE_ALERADY_CREATED_NOT_CLOSED = "order.shuttle.alerady.created.not.closed";

	/**
	 * 当前运单状态不可作废
	 */
	String ORDER_NOW_SHIPMENT_STATUS_NOT_CANCELLATION = "order.now.shipment.status.not.cancellation";

	/**
	 * 当前运单状态不可签收
	 */
	String ORDER_NOW_SHIPMENT_STATUS_NOT_SIGN_RECEIVE = "order.now.shipment.status.not.sign.receive";

	/**
	 * 运单不能为空
	 */
	String ORDER_SHIPMENT_NOT_NULL = "order.shipment.not.null";

	/**
	 * 运单不可修改({0})
	 */
	String ORDER_SHIPMENT_NOT_MODIFICATION = "order.shipment.not.modification";

	/**
	 * 查询请求对象为null
	 */
	String ORDER_SEARCH_REQUEST_OBJECT_IS_NULL = "order.search.request.object.is.null";

	/**
	 * 当前操作人信息未提供
	 */
	String ORDER_HAS_NOT_NOW_OPERATION_INFO = "order.has.not.now.operation.info";

	/**
	 * 非干线发车出发网点ID、出发网点名称、到达网点ID、到达网点名称为必填项
	 */
	String ORDER_NOT_L_DEPART_WEBSITE_NAME_AND_ARRIVE_WEBSITE_NAME_IS_REQUIRED = "order.not.l.depart.website.name.and.arrive.website.name.is.required";

	/**
	 * 短驳运单数据orderId错误
	 */
	String ORDER_SHUTTLE_SHIPMENT_DATA_ORDERID_ERROR = "order.shuttle.shipment.data.orderId.error";

	/**
	 * 找不到对应orderId的短驳服务单
	 */
	String ORDER_NOT_FOUND_ORDERID_SHUTTLE_SHIPMENT = "order.not.found.orderId.shuttle.shipment";

	/**
	 * 运单已经生成发车单
	 */
	String ORDER_SHIPMENT_ALERADY_CREATED_DEPART = "order.shipment.alerady.created.depart";

	/**
	 * 线路不能为空
	 */
	String ORDER_ROUTE_NOT_NULL = "order.route.not.null";

	/**
	 * 运单状态已改变，不可生成发车单
	 */
	String ORDER_SHIPMENT_STATUS_CHANGED_NOT_CREATED_DEPART = "order.shipment.status.changed.not.created.depart";

	/**
	 * 运单线路不一致
	 */
	String ORDER_SHIPMENT_ROUTE_DIFFERENCE = "order.shipment.route.difference";

	/**
	 * 发车单费用信息不能为空
	 */
	String ORDER_DEPART_COST_INFO_NOT_NULL = "order.depart.cost.info.not.null";

	/**
	 * 调箱单费用信息不能为空
	 */
	String ORDER_TRAILER_COST_INFO_NOT_NULL = "order.trailer.cost.info.not.null";

	/**
	 * 发车单类型错误
	 */
	String ORDER_DEPART_TYPE_ERROR = "order.depart.type.error";

	/**
	 * 找不到对应的发车单
	 */
	String ORDER_DEPART_NOT_FOUND = "order.depart.not.found";

	/**
	 * 发车单的ID与单号不匹配
	 */
	String ORDER_DEPARTID_AND_DEPARTNO_DIFFERENCE = "order.departId.and.departNo.difference";

	/**
	 * 运单数据orderId错误
	 */
	String ORDER_SHIPMENT_DATA_ORDERID_ERROR = "order.shipment.data.orderId.error";

	/**
	 * 找不到对应数据({0})
	 */
	String ORDER_NOT_FOUND_DATA = "order.not.found.data";

	/**
	 * 发车状态信息错误
	 */
	String ORDER_DEPART_STATUS_INFO_ERROR = "order.depart.status.info.error";

	/**
	 * 发车单状态已改变，不可删除
	 */
	// String ORDER_DEPART_STATUS_CHANGE_NOT_DELETED =
	// "order.depart.status.change.not.deleted";

	/**
	 * 发车单不可删除({0})
	 */
	String ORDER_DEPART_NOT_DELETED = "order.depart.not.deleted";

	/**
	 * 单据类型错误
	 */
	String ORDER_TYPE_ERROR = "order.type.error";

	/**
	 * 运单状态已发生变化
	 */
	String ORDER_SHIPMENT_STATUS_ALERADY_CHANGED = "order.shipment.status.alerady.changed";

	/**
	 * 找不到对应departId
	 */
	String ORDER_NOT_FOUND_DEPARTID = "order.not.found.departId";

	/**
	 * 找不到对应orderId
	 */
	String ORDER_NOT_FOUND_ORDERID = "order.not.found.orderId";

	/**
	 * 已转运单，不可取消，如有问题，请联系客服(4000339090)。
	 */
	String ORDER_ALERADY_TRANS_SHIPMENT_NOT_CANCEL = "order.alerady.trans.shipment.not.cancel";

	/**
	 * 运单已关闭
	 */
	String ORDER_SHIPMENT_ALERADY_CLOSED = "order.shipment.alerady.closed";

	/**
	 * {0}需晚于{1}！
	 */
	String ORDER_XTIME_SHOULD_PAST_XTIME = "order.xTime.should.past.Time";

	/**
	 * 收货时间需晚于提货时间！ 收货时间需晚于客户送达时间！{0}需晚于{1}
	 */
	// String ORDER_CNEETIME_SHOULD_PAST_CLIENT_DELIVERTIME =
	// "order.cneeTime.should.past.client.deliverTime";

	/**
	 * 无法从路由规则计算结果中获取所需的信息:运营公司、网点等
	 */
	String NOT_GET_INFO_IN_ROUTE_RULE_COUNT_RESULT = "not.get.info.in.route.rule.count.result";

	/**
	 * 运单已经生成短驳外包单
	 */
	String ORDER_SHIPMENT_ALERADY_CREATED_SHUTTLE = "order.shipment.alerady.created.shuttle";

	/**
	 * 运单状态已改变，不可生成短驳外包单
	 */
	String ORDER_SHIPMENT_STATUS_ALERADY_CHANGED_NOT_CREATED_SHUTTLE = "order.shipment.status.alerady.changed.not.created.shuttle";

	/**
	 * 短驳状态信息错误
	 */
	String ORDER_SHUTTLE_STATUS_ERROR = "order.shuttle.status.error";

	/**
	 * 短驳外包单不可删除({0})
	 */
	String ORDER_SHUTTLE_NOT_DELETED = "order.shuttle.not.deleted";

	/**
	 * 短驳外包单的ID与单号不匹配
	 */
	String ORDER_SHUTTLE_ID_AND_ORDERNO_DIFFERENCE = "order.shuttle.id.and.orderNo.difference";

	/**
	 * 找不到对应的短驳外包单
	 */
	String ORDER_NOT_FOUND_SHUTTLE = "order.not.found.shuttle";

	/**
	 * 短驳外包单费用信息不能为空
	 */
	String ORDER_SHUTTLE_COST_INFO_NOT_NULL = "order.shuttle.cost.info.not.null";

	/**
	 * 调箱单不可删除({0})
	 */
	String ORDER_TRAILER_NOT_DELETED = "order.trailer.not.deleted";

	/**
	 * 调箱单的ID与单号不匹配
	 */
	String ORDER_TRAILER_ID_AND_ORDERNO_DIFFERENCE = "order.trailer.id.and.orderNo.difference";

	/**
	 * 找不到对应的调箱单
	 */
	String ORDER_NOT_FOUND_TRAILER = "order.not.found.trailer";

	/**
	 * 运单还没有生成短驳外包单
	 */
	String ORDER_SHIPMENT_HAS_NOT_CREATED_SHUTTLE_SHIP = "order.shipment.has.not.created.shuttle.ship";

	/**
	 * 数据错误：短驳外包单不唯一
	 */
	String ORDER_DATA_ERROR_SHUTTLE_SHIP_IS_NOT_UNIQUE = "order.data.error.shuttle.ship.is.not.unique";

	/**
	 * 运单已经生成短驳服务单
	 */
	String ORDER_SHIPMENT_ALERADY_CREATED_SHUTTLE_SHIP = "order.shipment.alerady.created.shuttle.ship";

	/**
	 * 短驳服务单费用信息不能为空
	 */
	String ORDER_SHUTTLE_SHIP_COST_INFO_NOT_NULL = "order.shuttle.ship.cost.info.not.null";

	/**
	 * 找不到对应的短驳服务单
	 */
	String ORDER_NOT_FOUND_SHUTTLE_SHIP = "order.not.found.shuttle.ship";

	/**
	 * 单据Id不能为空
	 */
	String ORDER_SHUTTLE_SHIP_ID_NOT_NULL = "order.shuttle.ship.id.not.null";

	/**
	 * 短驳服务单不可删除
	 */
	String ORDER_SHUTTLE_SHIP_NOT_DELETED = "order.shuttle.ship.not.deleted";

	/**
	 * 短驳服务单的ID与单号不匹配
	 */
	String ORDER_SHUTTLE_SHIP_ID_AND_ORDERNO_DIFFERENCE = "order.shuttle.ship.id.and.orderNo.difference";

	/**
	 * 订/运单不存在
	 */
	String ORDER_OR_SHIPMENT_NOT_EXIST = "order.or.shipment.not.exist";

	/**
	 * 会员ID不能为空！
	 */
	String ORDER_CUST_PROFILEID_NOT_NULL = "order.cust.profileId.not.null";

	/**
	 * 找不到对应订单体的OrderHandler({0})
	 */
	String ORDER_NOT_FOUND_ORDERBODY_ORDERHANDLER = "order.not.found.orderBody.orderHandler";

	/**
	 * {0}不可生成调整单！
	 */
	String ORDER_NOT_CREATED_EXPENSE_ADJUST = "order.not.created.expense.adjust";

	/**
	 * 新增调整单失败：{0}
	 */
	String ORDER_NEW_CREATED_EXPENSE_ADJUST_FAILED = "order.new.created.expense.adjust.failed";

	/**
	 * 当前运单不存在！
	 */
	String ORDER_NOW_SHIPMENT_NOT_EXIST = "order.now.shipment.not.exist";

	/**
	 * 运单号不能为空
	 */
	String ORDER_SHIPMENTNO_NOT_NULL = "order.shipmentNo.not.null";

	/**
	 * 运单或运单对应的运输单据已经生成对账单！
	 */
	String ORDER_SHIPMENT_IS_BIND_STATEMENT = "order.shipment.is.bind.shipment";

	/**
	 * 修改失败:{0}
	 */
	String ORDER_UPDATED_FAILED = "order.updated.failed";

	/**
	 * 缺少参数：{0}
	 */
	String ORDER_LACK_PARAMS = "order.lack.params";

	/**
	 * 当前订单未付款
	 */
	String ORDER_UNPAID_ERROR = "order.unpaid.error";
}