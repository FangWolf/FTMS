package cn.zqrc.ftms.pro.vo;

import java.util.Date;


/**
 * Clear entity. @author guo
 * Clear清关	
 */

public class Clear  implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;//唯一标识
	private User user;//清关人
	private Project project;//清关的项目
	private Date declareTime;//报关日期
	private Date returnTime;//回报关日期
	private String code;//海关编号
	private String declareFile;//报关单文件
	private String customsFile;//关税文件
	private String cvatFile;//增值税文件
	private String concumptionFile;//消费税文件
	private String withTwo;//报关单双抬头
	private String info;//备注
	public Clear() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Clear(Integer id, User user, Project project, Date declareTime,
			Date returnTime, String code, String declareFile,
			String customsFile, String cvatFile, String concumptionFile,
			String withTwo, String info) {
		super();
		this.id = id;
		this.user = user;
		this.project = project;
		this.declareTime = declareTime;
		this.returnTime = returnTime;
		this.code = code;
		this.declareFile = declareFile;
		this.customsFile = customsFile;
		this.cvatFile = cvatFile;
		this.concumptionFile = concumptionFile;
		this.withTwo = withTwo;
		this.info = info;
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
	public Date getDeclareTime() {
		return declareTime;
	}
	public void setDeclareTime(Date declareTime) {
		this.declareTime = declareTime;
	}
	public Date getReturnTime() {
		return returnTime;
	}
	public void setReturnTime(Date returnTime) {
		this.returnTime = returnTime;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDeclareFile() {
		return declareFile;
	}
	public void setDeclareFile(String declareFile) {
		this.declareFile = declareFile;
	}
	public String getCustomsFile() {
		return customsFile;
	}
	public void setCustomsFile(String customsFile) {
		this.customsFile = customsFile;
	}
	public String getCvatFile() {
		return cvatFile;
	}
	public void setCvatFile(String cvatFile) {
		this.cvatFile = cvatFile;
	}
	public String getConcumptionFile() {
		return concumptionFile;
	}
	public void setConcumptionFile(String concumptionFile) {
		this.concumptionFile = concumptionFile;
	}
	public String getWithTwo() {
		return withTwo;
	}
	public void setWithTwo(String withTwo) {
		this.withTwo = withTwo;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}

}