package cn.zqrc.ftms.pro.vo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * Project entity. @author guo
 * Project	项目
 */

public class Project  implements java.io.Serializable {


	// Fields    

	private Integer id;//唯一标识
	private Brand brand;//项目归属的品牌
	private State state;//项目的状态
	private User user;//项目的负责人
	private String insideNum;//内部编号
	private String info;//备注
	private String pactOut;//外贸合同号
	private String pactIn;//内贸合同号
	private String name;//项目名称
	private String emption;//购货方
	private String supply;//项目供应商
	private String angent;//代理商
	private String modeles;//项目规格型号
	private String customsNum;//海关编号
	private String payStyle;//付款方式
	private String moneyOut;//外贸金额
	private String moneyAgent;//代理商价
	private String moneySell;//销售金额
	private String rate;//汇比
	private String customsClearance;//清关口岸
	private Date deliveryTime;//发货日期
	private String transportMethods;//运输方式
	private String tradeTerms;//贸易术语
	private String tradingCountry;//贸易国
	private String importingCountry;//进口国
	private String finallyUser;//最终用户
	private String type;//类型
	private Date beginTime;//项目开标日期
	private String completion;//完结情况（完结/未完结）
	private String archivesNum;//档案编号
	private String HS;//hs编码
	private Set<Payment> payments = new HashSet<Payment>();//项目的支付方式	一对多
	private Set<Invoice> invoices = new HashSet<Invoice>();//项目的发票信息	一对多
	private Set<Examination> examinations = new HashSet<Examination>();//项目的商检信息	一对多
	private Set<Clear> clears = new HashSet<Clear>();//项目的清关信息	一对多
	private Set<Letter> letters = new HashSet<Letter>();//项目的信用证明	一对多
	private Set<Receivable> receivables = new HashSet<Receivable>();//项目的收款信息	一对多
	private Set<Bid> bids = new HashSet<Bid>();//项目的招标信息	一对多
	private Set<Contract> contracts = new HashSet<Contract>();//项目的合同书	一对多
	private Set<Goods> goodses = new HashSet<Goods>();//项目的商品	一对多

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(Integer id, Brand brand, State state, User user,
			String insideNum, String info, String pactOut, String pactIn,
			String name, String emption, String supply, String angent,
			String modeles, String customsNum, String payStyle,
			String moneyOut, String moneyAgent, String moneySell, String rate,
			String customsClearance, Date deliveryTime,
			String transportMethods, String tradeTerms, String tradingCountry,
			String importingCountry, String finallyUser, String type,
			Date beginTime, String completion, String archivesNum, String hS,
			Set<Payment> payments, Set<Invoice> invoices,
			Set<Examination> examinations, Set<Clear> clears,
			Set<Letter> letters, Set<Receivable> receivables, Set<Bid> bids,
			Set<Contract> contracts, Set<Goods> goodses) {
		super();
		this.id = id;
		this.brand = brand;
		this.state = state;
		this.user = user;
		this.insideNum = insideNum;
		this.info = info;
		this.pactOut = pactOut;
		this.pactIn = pactIn;
		this.name = name;
		this.emption = emption;
		this.supply = supply;
		this.angent = angent;
		this.modeles = modeles;
		this.customsNum = customsNum;
		this.payStyle = payStyle;
		this.moneyOut = moneyOut;
		this.moneyAgent = moneyAgent;
		this.moneySell = moneySell;
		this.rate = rate;
		this.customsClearance = customsClearance;
		this.deliveryTime = deliveryTime;
		this.transportMethods = transportMethods;
		this.tradeTerms = tradeTerms;
		this.tradingCountry = tradingCountry;
		this.importingCountry = importingCountry;
		this.finallyUser = finallyUser;
		this.type = type;
		this.beginTime = beginTime;
		this.completion = completion;
		this.archivesNum = archivesNum;
		HS = hS;
		this.payments = payments;
		this.invoices = invoices;
		this.examinations = examinations;
		this.clears = clears;
		this.letters = letters;
		this.receivables = receivables;
		this.bids = bids;
		this.contracts = contracts;
		this.goodses = goodses;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getInsideNum() {
		return insideNum;
	}

	public void setInsideNum(String insideNum) {
		this.insideNum = insideNum;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getPactOut() {
		return pactOut;
	}

	public void setPactOut(String pactOut) {
		this.pactOut = pactOut;
	}

	public String getPactIn() {
		return pactIn;
	}

	public void setPactIn(String pactIn) {
		this.pactIn = pactIn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmption() {
		return emption;
	}

	public void setEmption(String emption) {
		this.emption = emption;
	}

	public String getSupply() {
		return supply;
	}

	public void setSupply(String supply) {
		this.supply = supply;
	}

	public String getAngent() {
		return angent;
	}

	public void setAngent(String angent) {
		this.angent = angent;
	}

	public String getModeles() {
		return modeles;
	}

	public void setModeles(String modeles) {
		this.modeles = modeles;
	}

	public String getCustomsNum() {
		return customsNum;
	}

	public void setCustomsNum(String customsNum) {
		this.customsNum = customsNum;
	}

	public String getPayStyle() {
		return payStyle;
	}

	public void setPayStyle(String payStyle) {
		this.payStyle = payStyle;
	}

	public String getMoneyOut() {
		return moneyOut;
	}

	public void setMoneyOut(String moneyOut) {
		this.moneyOut = moneyOut;
	}

	public String getMoneyAgent() {
		return moneyAgent;
	}

	public void setMoneyAgent(String moneyAgent) {
		this.moneyAgent = moneyAgent;
	}

	public String getMoneySell() {
		return moneySell;
	}

	public void setMoneySell(String moneySell) {
		this.moneySell = moneySell;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getCustomsClearance() {
		return customsClearance;
	}

	public void setCustomsClearance(String customsClearance) {
		this.customsClearance = customsClearance;
	}

	public Date getDeliveryTime() {
		return deliveryTime;
	}

	public void setDeliveryTime(Date deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public String getTransportMethods() {
		return transportMethods;
	}

	public void setTransportMethods(String transportMethods) {
		this.transportMethods = transportMethods;
	}

	public String getTradeTerms() {
		return tradeTerms;
	}

	public void setTradeTerms(String tradeTerms) {
		this.tradeTerms = tradeTerms;
	}

	public String getTradingCountry() {
		return tradingCountry;
	}

	public void setTradingCountry(String tradingCountry) {
		this.tradingCountry = tradingCountry;
	}

	public String getImportingCountry() {
		return importingCountry;
	}

	public void setImportingCountry(String importingCountry) {
		this.importingCountry = importingCountry;
	}

	public String getFinallyUser() {
		return finallyUser;
	}

	public void setFinallyUser(String finallyUser) {
		this.finallyUser = finallyUser;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}

	public String getCompletion() {
		return completion;
	}

	public void setCompletion(String completion) {
		this.completion = completion;
	}

	public String getArchivesNum() {
		return archivesNum;
	}

	public void setArchivesNum(String archivesNum) {
		this.archivesNum = archivesNum;
	}

	public String getHS() {
		return HS;
	}

	public void setHS(String hS) {
		HS = hS;
	}

	public Set<Payment> getPayments() {
		return payments;
	}

	public void setPayments(Set<Payment> payments) {
		this.payments = payments;
	}

	public Set<Invoice> getInvoices() {
		return invoices;
	}

	public void setInvoices(Set<Invoice> invoices) {
		this.invoices = invoices;
	}

	public Set<Examination> getExaminations() {
		return examinations;
	}

	public void setExaminations(Set<Examination> examinations) {
		this.examinations = examinations;
	}

	public Set<Clear> getClears() {
		return clears;
	}

	public void setClears(Set<Clear> clears) {
		this.clears = clears;
	}

	public Set<Letter> getLetters() {
		return letters;
	}

	public void setLetters(Set<Letter> letters) {
		this.letters = letters;
	}

	public Set<Receivable> getReceivables() {
		return receivables;
	}

	public void setReceivables(Set<Receivable> receivables) {
		this.receivables = receivables;
	}

	public Set<Bid> getBids() {
		return bids;
	}

	public void setBids(Set<Bid> bids) {
		this.bids = bids;
	}

	public Set<Contract> getContracts() {
		return contracts;
	}

	public void setContracts(Set<Contract> contracts) {
		this.contracts = contracts;
	}

	public Set<Goods> getGoodses() {
		return goodses;
	}

	public void setGoodses(Set<Goods> goodses) {
		this.goodses = goodses;
	}
	

}