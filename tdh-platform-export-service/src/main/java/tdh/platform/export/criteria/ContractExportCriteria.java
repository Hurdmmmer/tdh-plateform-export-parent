package tdh.platform.export.criteria;

import org.apache.commons.lang3.StringUtils;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class ContractExportCriteria extends BaseCriteria {

	private static final long serialVersionUID = 1L;

	private Long contractId;// 合同Id
	private String contractNo;// 合同编号
	private String opTypeCd;// 运作类型:TRAIL试运营，QY签约
	private String contractStateCd;// 合同状态：NEW新建、SBT待审核(提交审核)、REJECT已驳回、PASS审核通过、EFFECT已生效、STOP已终止、OVERDUE已到期
	private Integer vendorId;// 承运商ID
	private String vendorName;// 承运商NAME
	private String resName;// 资源NAME
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date contractStartDate;// 开始签约时间(合同创建时间)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date contractEndDate;// 结束签约时间(合同创建时间)

	private String contractTypeCd;// 合同类型：QY签约；B常跑；C临时
	private String userTypeCd;// 会员类型:B企业，C个人
	private Integer willOverdueDay;// 将要过期的天数

	private Long contractRouteId; // 合作线路.

	private String[] contractTypeCds;// 合同类型：签约合同--QY签约；外雇合同--B常跑、C临时,根据contractTypeCdStr转换成数组

	private String contractTypeCdStr;// 合同类型：签约合同--QY签约；外雇合同--B常跑、C临时

	public String getContractNo() {
		return contractNo;
	}

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public String getOpTypeCd() {
		return opTypeCd;
	}

	public void setOpTypeCd(String opTypeCd) {
		this.opTypeCd = opTypeCd;
	}

	public String getContractStateCd() {
		return contractStateCd;
	}

	public void setContractStateCd(String contractStateCd) {
		this.contractStateCd = contractStateCd;
	}

	public Integer getVendorId() {
		return vendorId;
	}

	public void setVendorId(Integer vendorId) {
		this.vendorId = vendorId;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public Date getContractStartDate() {
		return contractStartDate;
	}

	public void setContractStartDate(Date contractStartDate) {
		this.contractStartDate = contractStartDate;
	}

	public Date getContractEndDate() {
		return contractEndDate;
	}

	public void setContractEndDate(Date contractEndDate) {
		this.contractEndDate = contractEndDate;
	}

	public String getContractTypeCd() {
		return contractTypeCd;
	}

	public void setContractTypeCd(String contractTypeCd) {
		this.contractTypeCd = contractTypeCd;
	}

	public String getUserTypeCd() {
		return userTypeCd;
	}

	public void setUserTypeCd(String userTypeCd) {
		this.userTypeCd = userTypeCd;
	}

	public Integer getWillOverdueDay() {
		return willOverdueDay;
	}

	public void setWillOverdueDay(Integer willOverdueDay) {
		this.willOverdueDay = willOverdueDay;
	}

	public String[] getContractTypeCds() {
		if (StringUtils.isNoneBlank(contractTypeCdStr)) {
			return contractTypeCdStr.split(",");
		}
		return contractTypeCds;
	}

	public void setContractTypeCds(String[] contractTypeCds) {
		this.contractTypeCds = contractTypeCds;
	}

	public String getContractTypeCdStr() {
		return contractTypeCdStr;
	}

	public void setContractTypeCdStr(String contractTypeCdStr) {
		this.contractTypeCdStr = contractTypeCdStr;
	}

	public String getResName() {
		return resName;
	}

	public void setResName(String resName) {
		this.resName = resName;
	}

	public Long getContractId() {
		return contractId;
	}

	public void setContractId(Long contractId) {
		this.contractId = contractId;
	}

	public Long getContractRouteId() {
		return contractRouteId;
	}

	public void setContractRouteId(Long contractRouteId) {
		this.contractRouteId = contractRouteId;
	}

}
