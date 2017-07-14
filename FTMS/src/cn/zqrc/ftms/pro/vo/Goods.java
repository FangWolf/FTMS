package cn.zqrc.ftms.pro.vo;

import java.util.HashSet;
import java.util.Set;


/**
 * Goods entity. @author guo
 * Goods	商品
 */

public class Goods  implements java.io.Serializable {


	private static final long serialVersionUID = 1L;
	private Integer id;//唯一标识
	private String num;//数量
	private String info;//备注
	private Project project;//商品对应的项目
	private Set<Logistic> logistics = new HashSet<Logistic>();//物流信息对应的商品	多对一
	private Set<Storage> storages = new HashSet<Storage>();//库存对应的商品	多对一

	public Goods() {
	}

	public Goods(Integer id, String num, String info, Project project,
			Set<Logistic> logistics, Set<Storage> storages) {
		super();
		this.id = id;
		this.num = num;
		this.info = info;
		this.project = project;
		this.logistics = logistics;
		this.storages = storages;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public Set<Logistic> getLogistics() {
		return logistics;
	}

	public void setLogistics(Set<Logistic> logistics) {
		this.logistics = logistics;
	}

	public Set<Storage> getStorages() {
		return storages;
	}

	public void setStorages(Set<Storage> storages) {
		this.storages = storages;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}