package cn.zqrc.ftms.pro.vo;

import java.util.Date;


/**
 * Invoice entity. @author guo
 * Invoice	发票信息
 */

public class Invoice  implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;//唯一表示
	private Project project;//发票对应的项目
	private Date time;//发票时间
	private String money;//发票金额
	private String info;//备注
	public Invoice() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Invoice(Integer id, Project project, Date time, String money,
			String info) {
		super();
		this.id = id;
		this.project = project;
		this.time = time;
		this.money = money;
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
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
}