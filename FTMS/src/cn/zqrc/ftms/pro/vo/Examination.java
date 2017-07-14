package cn.zqrc.ftms.pro.vo;

import java.util.Date;


/**
 * Examination entity. @author guo
 * Examination商检信息
 */

public class Examination  implements java.io.Serializable {


	private static final long serialVersionUID = 1L;
	private Integer id;//唯一标识
	private User user;//商检人
	private Project project;//商检的项目
	private String info;//备注
	private String agency;//商检部门	上海质检分局
	private String state;//商检状态	验收/出证
	private String name;//商检具体名
	private Date time;//商检时间
	private String style;//商检方式
	private String inspectionFile;//保荐单文件
	private String acceptanceFile;//验收报告文件
	private String certificateFile;//商检证
	private String placePerson;//场地工程师名字
	private String installPerson;//装机工程师名字
	private String placePhone;//场地工程师手机号
	private String installPhone;//装机工程师手机号

	public Examination() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Examination(Integer id, User user, Project project, String info,
			String agency, String state, String name, Date time, String style,
			String inspectionFile, String acceptanceFile,
			String certificateFile, String placePerson, String installPerson,
			String placePhone, String installPhone) {
		super();
		this.id = id;
		this.user = user;
		this.project = project;
		this.info = info;
		this.agency = agency;
		this.state = state;
		this.name = name;
		this.time = time;
		this.style = style;
		this.inspectionFile = inspectionFile;
		this.acceptanceFile = acceptanceFile;
		this.certificateFile = certificateFile;
		this.placePerson = placePerson;
		this.installPerson = installPerson;
		this.placePhone = placePhone;
		this.installPhone = installPhone;
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
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getAgency() {
		return agency;
	}
	public void setAgency(String agency) {
		this.agency = agency;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public String getInspectionFile() {
		return inspectionFile;
	}
	public void setInspectionFile(String inspectionFile) {
		this.inspectionFile = inspectionFile;
	}
	public String getAcceptanceFile() {
		return acceptanceFile;
	}
	public void setAcceptanceFile(String acceptanceFile) {
		this.acceptanceFile = acceptanceFile;
	}
	public String getCertificateFile() {
		return certificateFile;
	}
	public void setCertificateFile(String certificateFile) {
		this.certificateFile = certificateFile;
	}
	public String getPlacePerson() {
		return placePerson;
	}
	public void setPlacePerson(String placePerson) {
		this.placePerson = placePerson;
	}
	public String getInstallPerson() {
		return installPerson;
	}
	public void setInstallPerson(String installPerson) {
		this.installPerson = installPerson;
	}
	public String getPlacePhone() {
		return placePhone;
	}
	public void setPlacePhone(String placePhone) {
		this.placePhone = placePhone;
	}
	public String getInstallPhone() {
		return installPhone;
	}
	public void setInstallPhone(String installPhone) {
		this.installPhone = installPhone;
	}
}