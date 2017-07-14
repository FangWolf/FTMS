package cn.zqrc.ftms.pro.vo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * Letter entity. @author guo
 * Letter	信用证
 */

public class Letter  implements java.io.Serializable {

	// Fields    

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;//唯一标识
	private Project project;//信用证对应的项目
	private Date beginTime;//信用证办证时间
	private String billType;//押汇类型
	private String currency;//币种
	private String info;//备注
	private String user;//信用证对应的人员名称
	private String file1;//信用证电文文件（文件）
	private String file2;//信用证修改证文件（文件）
	private Date updateTime;//修改信用证的时间
	private Set<Payment> payments = new HashSet<Payment>();//付汇时需要信用证 多对一
	public Letter() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Letter(Integer id, Project project, Date beginTime, String billType,
			String currency, String info, String user, String file1,
			String file2, Date updateTime, Set<Payment> payments) {
		super();
		this.id = id;
		this.project = project;
		this.beginTime = beginTime;
		this.billType = billType;
		this.currency = currency;
		this.info = info;
		this.user = user;
		this.file1 = file1;
		this.file2 = file2;
		this.updateTime = updateTime;
		this.payments = payments;
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
	public Date getBeginTime() {
		return beginTime;
	}
	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}
	public String getBillType() {
		return billType;
	}
	public void setBillType(String billType) {
		this.billType = billType;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getFile1() {
		return file1;
	}
	public void setFile1(String file1) {
		this.file1 = file1;
	}
	public String getFile2() {
		return file2;
	}
	public void setFile2(String file2) {
		this.file2 = file2;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public Set<Payment> getPayments() {
		return payments;
	}
	public void setPayments(Set<Payment> payments) {
		this.payments = payments;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

}