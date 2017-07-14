package cn.zqrc.ftms.pro.vo;

import java.util.Date;


/**
 * Receivable entity. @author guo
 * Receivable	收款信息
 */

public class Receivable  implements java.io.Serializable {


	private static final long serialVersionUID = 1L;
	private Integer id;//唯一标识
	private User user;//负责人
	private Project project;//收款的项目
	private String actualMoney;//实际收款钱
	private String mustMoney;//应收款钱
	private Date actualTime;//实际收款日期
	private Date mustTime;//应收款日期
	private String receivedTotal;//收款合计
	private String tailTotal;//尾款合计
	private String sendUser;//发款人
	private String acceptUser;//收款人
	private Date taxTime;//发票日期
	private String customsAmount;//关税金额
	private String consumptionAmount;//消费税金额
	private String vatAmount;//增值税金额
	private Date returnDate;//回票日期
	private String info;//备注
	private String cableAmount;//电汇费
	private String inspectionAmount;//商检费
	private String storageAmount;//仓储费
	private String bidAmount;//招标费
	private String serviceAmount;//服务费
	private String otherAmount;//其它费
	private String cases;//报关单（文件）

	public Receivable() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Receivable(Integer id, User user, Project project,
			String actualMoney, String mustMoney, Date actualTime,
			Date mustTime, String receivedTotal, String tailTotal,
			String sendUser, String acceptUser, Date taxTime,
			String customsAmount, String consumptionAmount, String vatAmount,
			Date returnDate, String info, String cableAmount,
			String inspectionAmount, String storageAmount, String bidAmount,
			String serviceAmount, String otherAmount, String cases) {
		super();
		this.id = id;
		this.user = user;
		this.project = project;
		this.actualMoney = actualMoney;
		this.mustMoney = mustMoney;
		this.actualTime = actualTime;
		this.mustTime = mustTime;
		this.receivedTotal = receivedTotal;
		this.tailTotal = tailTotal;
		this.sendUser = sendUser;
		this.acceptUser = acceptUser;
		this.taxTime = taxTime;
		this.customsAmount = customsAmount;
		this.consumptionAmount = consumptionAmount;
		this.vatAmount = vatAmount;
		this.returnDate = returnDate;
		this.info = info;
		this.cableAmount = cableAmount;
		this.inspectionAmount = inspectionAmount;
		this.storageAmount = storageAmount;
		this.bidAmount = bidAmount;
		this.serviceAmount = serviceAmount;
		this.otherAmount = otherAmount;
		this.cases = cases;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public String getActualMoney() {
		return actualMoney;
	}
	public void setActualMoney(String actualMoney) {
		this.actualMoney = actualMoney;
	}
	public String getMustMoney() {
		return mustMoney;
	}
	public void setMustMoney(String mustMoney) {
		this.mustMoney = mustMoney;
	}
	public Date getActualTime() {
		return actualTime;
	}
	public void setActualTime(Date actualTime) {
		this.actualTime = actualTime;
	}
	public Date getMustTime() {
		return mustTime;
	}
	public void setMustTime(Date mustTime) {
		this.mustTime = mustTime;
	}
	public String getReceivedTotal() {
		return receivedTotal;
	}
	public void setReceivedTotal(String receivedTotal) {
		this.receivedTotal = receivedTotal;
	}
	public String getTailTotal() {
		return tailTotal;
	}
	public void setTailTotal(String tailTotal) {
		this.tailTotal = tailTotal;
	}
	public String getSendUser() {
		return sendUser;
	}
	public void setSendUser(String sendUser) {
		this.sendUser = sendUser;
	}
	public String getAcceptUser() {
		return acceptUser;
	}
	public void setAcceptUser(String acceptUser) {
		this.acceptUser = acceptUser;
	}
	public Date getTaxTime() {
		return taxTime;
	}
	public void setTaxTime(Date taxTime) {
		this.taxTime = taxTime;
	}
	public String getCustomsAmount() {
		return customsAmount;
	}
	public void setCustomsAmount(String customsAmount) {
		this.customsAmount = customsAmount;
	}
	public String getConsumptionAmount() {
		return consumptionAmount;
	}
	public void setConsumptionAmount(String consumptionAmount) {
		this.consumptionAmount = consumptionAmount;
	}
	public String getVatAmount() {
		return vatAmount;
	}
	public void setVatAmount(String vatAmount) {
		this.vatAmount = vatAmount;
	}
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getCableAmount() {
		return cableAmount;
	}
	public void setCableAmount(String cableAmount) {
		this.cableAmount = cableAmount;
	}
	public String getInspectionAmount() {
		return inspectionAmount;
	}
	public void setInspectionAmount(String inspectionAmount) {
		this.inspectionAmount = inspectionAmount;
	}
	public String getStorageAmount() {
		return storageAmount;
	}
	public void setStorageAmount(String storageAmount) {
		this.storageAmount = storageAmount;
	}
	public String getBidAmount() {
		return bidAmount;
	}
	public void setBidAmount(String bidAmount) {
		this.bidAmount = bidAmount;
	}
	public String getServiceAmount() {
		return serviceAmount;
	}
	public void setServiceAmount(String serviceAmount) {
		this.serviceAmount = serviceAmount;
	}
	public String getOtherAmount() {
		return otherAmount;
	}
	public void setOtherAmount(String otherAmount) {
		this.otherAmount = otherAmount;
	}
	public String getCases() {
		return cases;
	}
	public void setCases(String cases) {
		this.cases = cases;
	}


}