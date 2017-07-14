package cn.zqrc.ftms.pro.vo;

import java.util.Date;


/**
 * Payment entity. @author guo
 * Payment	付汇使用资金
 */

public class Payment  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;//唯一标识
     private Project project;//付汇对应的资金
     private Letter letter;//信用证明
     private User user;//付汇人
     private Date remTime;//付汇日期
     private String remCur;//付汇汇率
     private String remMon;//付汇钱数+￥$
     private String remRmb;//折合人民币
     private Date billTime;//押汇时间
     private String billMon;//押汇金额+￥$
     private Date eftTime;//电汇时间
     private String eftFile;//电汇文件
     private String eftRate;//电汇汇率
     private String eftMon;//电汇钱数+$
     private String name;//采购物品名称
     private String trade;//内贸采购（注明时间，单位汇票）
     private String info;//备注
     
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Payment(Integer id, Project project, Letter letter, User user,
			Date remTime, String remCur, String remMon, String remRmb,
			Date billTime, String billMon, Date eftTime, String eftFile,
			String eftRate, String eftMon, String name, String trade,
			String info) {
		super();
		this.id = id;
		this.project = project;
		this.letter = letter;
		this.user = user;
		this.remTime = remTime;
		this.remCur = remCur;
		this.remMon = remMon;
		this.remRmb = remRmb;
		this.billTime = billTime;
		this.billMon = billMon;
		this.eftTime = eftTime;
		this.eftFile = eftFile;
		this.eftRate = eftRate;
		this.eftMon = eftMon;
		this.name = name;
		this.trade = trade;
		this.info = info;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public Letter getLetter() {
		return letter;
	}
	public void setLetter(Letter letter) {
		this.letter = letter;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Date getRemTime() {
		return remTime;
	}
	public void setRemTime(Date remTime) {
		this.remTime = remTime;
	}
	public String getRemCur() {
		return remCur;
	}
	public void setRemCur(String remCur) {
		this.remCur = remCur;
	}
	public String getRemMon() {
		return remMon;
	}
	public void setRemMon(String remMon) {
		this.remMon = remMon;
	}
	public String getRemRmb() {
		return remRmb;
	}
	public void setRemRmb(String remRmb) {
		this.remRmb = remRmb;
	}
	public Date getBillTime() {
		return billTime;
	}
	public void setBillTime(Date billTime) {
		this.billTime = billTime;
	}
	public String getBillMon() {
		return billMon;
	}
	public void setBillMon(String billMon) {
		this.billMon = billMon;
	}
	public Date getEftTime() {
		return eftTime;
	}
	public void setEftTime(Date eftTime) {
		this.eftTime = eftTime;
	}
	public String getEftFile() {
		return eftFile;
	}
	public void setEftFile(String eftFile) {
		this.eftFile = eftFile;
	}
	public String getEftRate() {
		return eftRate;
	}
	public void setEftRate(String eftRate) {
		this.eftRate = eftRate;
	}
	public String getEftMon() {
		return eftMon;
	}
	public void setEftMon(String eftMon) {
		this.eftMon = eftMon;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTrade() {
		return trade;
	}
	public void setTrade(String trade) {
		this.trade = trade;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}

}