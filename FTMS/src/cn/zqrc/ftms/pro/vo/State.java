package cn.zqrc.ftms.pro.vo;

import java.util.HashSet;
import java.util.Set;


/**
 * State entity. @author guo
 * 项目状态表
 */

public class State  implements java.io.Serializable {


	private static final long serialVersionUID = 1L;
	private Integer id;//唯一标识
	private String info;//备注
	private Set<Project> projects = new HashSet<Project>();//这个状态下的项目	一对多

	public State() {
		super();
		// TODO Auto-generated constructor stub
	}

	public State(Integer id, String info, Set<Project> projects) {
		super();
		this.id = id;
		this.info = info;
		this.projects = projects;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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