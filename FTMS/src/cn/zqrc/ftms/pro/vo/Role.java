package cn.zqrc.ftms.pro.vo;

import java.util.HashSet;
import java.util.Set;


/**
 * Role entity. @author guo
 * Role	角色表
 */

public class Role  implements java.io.Serializable {


	// Fields    

	private Integer id;//唯一标识
	private String desc;//描述
	private String name;//具体权限	立项人	招标人	商务厅人	银行人	清关人	商检人	保险人
	private Set<User> users = new HashSet<User>();//权限下对应的人 一对多

	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Role(Integer id, String desc, String name, Set<User> users) {
		super();
		this.id = id;
		this.desc = desc;
		this.name = name;
		this.users = users;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

}