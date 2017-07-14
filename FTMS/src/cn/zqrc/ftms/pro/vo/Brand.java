package cn.zqrc.ftms.pro.vo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * Brand entity. @author guo
 *  Brand品牌	品牌下有项目项目下有商品
 *  
 */

public class Brand  implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;//唯一编号
	private User user;//品牌负责人
	private String name;//品牌的名字
	private String num;//品牌的数量
	private Date creatTime;//品牌的创建时间
	private String info;//备注
	private Set<Project> projects = new HashSet<Project>();//一对多	品牌下有好多项目
	
	public Brand() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Brand(Integer id, User user, String name, String num,
			Date creatTime, String info, Set<Project> projects) {
		super();
		this.id = id;
		this.user = user;
		this.name = name;
		this.num = num;
		this.creatTime = creatTime;
		this.info = info;
		this.projects = projects;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public Date getCreatTime() {
		return creatTime;
	}
	public void setCreatTime(Date creatTime) {
		this.creatTime = creatTime;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public Set<Project> getProjects() {
		return projects;
	}
	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}

}