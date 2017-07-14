package cn.zqrc.ftms.pro.vo;

import java.util.Date;


/**
 * Bid entity. @author guo
 *  bid投标记录
 *  
 */

public class Bid  implements java.io.Serializable {


	private static final long serialVersionUID = 1L;
	private Integer id;//主键唯一识别
	private Project project;//投标对应的项目
	private String user;//投标人
	private Date beginTime;//投标时间
	private Date bidTime;//中标时间
	private String elec;//机电证明编号
	private String elecFile;//机电产品进口许可证文件
	private String result;//招标结果文件
	private String notice;//中标通知书
	private String info;//备注
	
	public Bid() {
		super();
	}
	
	public Bid(Integer id, Project project, String user, Date beginTime,
			Date bidTime, String elec, String elecFile, String result,
			String notice, String info) {
		super();
		this.id = id;
		this.project = project;
		this.user = user;
		this.beginTime = beginTime;
		this.bidTime = bidTime;
		this.elec = elec;
		this.elecFile = elecFile;
		this.result = result;
		this.notice = notice;
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
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public Date getBeginTime() {
		return beginTime;
	}
	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}
	public Date getBidTime() {
		return bidTime;
	}
	public void setBidTime(Date bidTime) {
		this.bidTime = bidTime;
	}
	public String getElec() {
		return elec;
	}
	public void setElec(String elec) {
		this.elec = elec;
	}
	public String getElecFile() {
		return elecFile;
	}
	public void setElecFile(String elecFile) {
		this.elecFile = elecFile;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getNotice() {
		return notice;
	}
	public void setNotice(String notice) {
		this.notice = notice;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}


	
}