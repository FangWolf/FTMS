package cn.zqrc.ftms.pro.vo;

import java.util.Date;


/**
 * Logistic entity. @author guo
 * Logistic	物流信息
 */

public class Logistic  implements java.io.Serializable {


	// Fields    

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;//唯一标识
	private Goods goods;//物流对应的商品
	private String info;//备注
	private String receiptPerson;//收货人
	private String transPerson;//运输人
	private String takePerson;//提货人
	private String receiptPhone;//收货人手机号
	private String receiptAdd;//收货人地址
	private String receiptWord;//收货人单位
	private String transPhone;//运输人手机号
	private String transCar;//运输人车牌号
	private String transNum;//运输人身份证号
	private String takePhone;//提货人手机号
	private String takeCar;//提货人车牌号
	private String takeNum;//提货人身份证号
	private Date receiptTime;//收货时间
	private Date takeTime;//提货时间
	private String signFile;//签收文件
	private String name;//物流内容
	private String outClear;//国外发货清关口岸
	private String transStyle;//运输方式
	private String tradeTerms;//贸易术语
	private String tradeCountry;//贸易国
	private String nativeCountry;//原产国
	private String waybillNumber;//运单号

	public Logistic() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Logistic(Integer id, Goods goods, String info, String receiptPerson,
			String transPerson, String takePerson, String receiptPhone,
			String receiptAdd, String receiptWord, String transPhone,
			String transCar, String transNum, String takePhone, String takeCar,
			String takeNum, Date receiptTime, Date takeTime, String signFile,
			String name, String outClear, String transStyle, String tradeTerms,
			String tradeCountry, String nativeCountry, String waybillNumber) {
		super();
		this.id = id;
		this.goods = goods;
		this.info = info;
		this.receiptPerson = receiptPerson;
		this.transPerson = transPerson;
		this.takePerson = takePerson;
		this.receiptPhone = receiptPhone;
		this.receiptAdd = receiptAdd;
		this.receiptWord = receiptWord;
		this.transPhone = transPhone;
		this.transCar = transCar;
		this.transNum = transNum;
		this.takePhone = takePhone;
		this.takeCar = takeCar;
		this.takeNum = takeNum;
		this.receiptTime = receiptTime;
		this.takeTime = takeTime;
		this.signFile = signFile;
		this.name = name;
		this.outClear = outClear;
		this.transStyle = transStyle;
		this.tradeTerms = tradeTerms;
		this.tradeCountry = tradeCountry;
		this.nativeCountry = nativeCountry;
		this.waybillNumber = waybillNumber;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getReceiptPerson() {
		return receiptPerson;
	}
	public void setReceiptPerson(String receiptPerson) {
		this.receiptPerson = receiptPerson;
	}
	public String getTransPerson() {
		return transPerson;
	}
	public void setTransPerson(String transPerson) {
		this.transPerson = transPerson;
	}
	public String getTakePerson() {
		return takePerson;
	}
	public void setTakePerson(String takePerson) {
		this.takePerson = takePerson;
	}
	public String getReceiptPhone() {
		return receiptPhone;
	}
	public void setReceiptPhone(String receiptPhone) {
		this.receiptPhone = receiptPhone;
	}
	public String getReceiptAdd() {
		return receiptAdd;
	}
	public void setReceiptAdd(String receiptAdd) {
		this.receiptAdd = receiptAdd;
	}
	public String getReceiptWord() {
		return receiptWord;
	}
	public void setReceiptWord(String receiptWord) {
		this.receiptWord = receiptWord;
	}
	public String getTransPhone() {
		return transPhone;
	}
	public void setTransPhone(String transPhone) {
		this.transPhone = transPhone;
	}
	public String getTransCar() {
		return transCar;
	}
	public void setTransCar(String transCar) {
		this.transCar = transCar;
	}
	public String getTransNum() {
		return transNum;
	}
	public void setTransNum(String transNum) {
		this.transNum = transNum;
	}
	public String getTakePhone() {
		return takePhone;
	}
	public void setTakePhone(String takePhone) {
		this.takePhone = takePhone;
	}
	public String getTakeCar() {
		return takeCar;
	}
	public void setTakeCar(String takeCar) {
		this.takeCar = takeCar;
	}
	public String getTakeNum() {
		return takeNum;
	}
	public void setTakeNum(String takeNum) {
		this.takeNum = takeNum;
	}
	public Date getReceiptTime() {
		return receiptTime;
	}
	public void setReceiptTime(Date receiptTime) {
		this.receiptTime = receiptTime;
	}
	public Date getTakeTime() {
		return takeTime;
	}
	public void setTakeTime(Date takeTime) {
		this.takeTime = takeTime;
	}
	public String getSignFile() {
		return signFile;
	}
	public void setSignFile(String signFile) {
		this.signFile = signFile;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOutClear() {
		return outClear;
	}
	public void setOutClear(String outClear) {
		this.outClear = outClear;
	}
	public String getTransStyle() {
		return transStyle;
	}
	public void setTransStyle(String transStyle) {
		this.transStyle = transStyle;
	}
	public String getTradeTerms() {
		return tradeTerms;
	}
	public void setTradeTerms(String tradeTerms) {
		this.tradeTerms = tradeTerms;
	}
	public String getTradeCountry() {
		return tradeCountry;
	}
	public void setTradeCountry(String tradeCountry) {
		this.tradeCountry = tradeCountry;
	}
	public String getNativeCountry() {
		return nativeCountry;
	}
	public void setNativeCountry(String nativeCountry) {
		this.nativeCountry = nativeCountry;
	}
	public String getWaybillNumber() {
		return waybillNumber;
	}
	public void setWaybillNumber(String waybillNumber) {
		this.waybillNumber = waybillNumber;
	}
}