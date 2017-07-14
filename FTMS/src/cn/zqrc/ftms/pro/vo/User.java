package cn.zqrc.ftms.pro.vo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * User entity. @author guo
 * User	用户表
 */

public class User  implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;//唯一标识
	private Role role;//角色
	private String userName;//用户名
	private String password;//密码
	private String name;//真实姓名
	private String phone;//手机号
	private Date loginTime;//登录时间
	private String loginIp;//登陆ip
	private String letterCart;//信用证号
	private String info;//备注
	private Set<Brand> brands = new HashSet<Brand>();//代理的品牌
	private Set<Examination> examinations = new HashSet<Examination>();//商检信息
	private Set<Clear> clears = new HashSet<Clear>();//清关信息
	private Set<Payment> payments = new HashSet<Payment>();//付款信息
	private Set<Project> projects = new HashSet<Project>();//管理的项目
	private Set<Receivable> receivables = new HashSet<Receivable>();//收款信息
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Integer id, Role role, String password, String name,
			String phone, String userName, Date loginTime, String loginIp,
			String letterCart, String info, Set<Brand> brands,
			Set<Examination> examinations, Set<Clear> clears,
			Set<Payment> payments, Set<Project> projects,
			Set<Receivable> receivables) {
		super();
		this.id = id;
		this.role = role;
		this.password = password;
		this.name = name;
		this.phone = phone;
		this.userName = userName;
		this.loginTime = loginTime;
		this.loginIp = loginIp;
		this.letterCart = letterCart;
		this.info = info;
		this.brands = brands;
		this.examinations = examinations;
		this.clears = clears;
		this.payments = payments;
		this.projects = projects;
		this.receivables = receivables;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Date getLoginTime() {
		return loginTime;
	}
	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}
	public String getLoginIp() {
		return loginIp;
	}
	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}
	public String getLetterCart() {
		return letterCart;
	}
	public void setLetterCart(String letterCart) {
		this.letterCart = letterCart;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public Set<Brand> getBrands() {
		return brands;
	}
	public void setBrands(Set<Brand> brands) {
		this.brands = brands;
	}
	public Set<Examination> getExaminations() {
		return examinations;
	}
	public void setExaminations(Set<Examination> examinations) {
		this.examinations = examinations;
	}
	public Set<Clear> getClears() {
		return clears;
	}
	public void setClears(Set<Clear> clears) {
		this.clears = clears;
	}
	public Set<Payment> getPayments() {
		return payments;
	}
	public void setPayments(Set<Payment> payments) {
		this.payments = payments;
	}
	public Set<Project> getProjects() {
		return projects;
	}
	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}
	public Set<Receivable> getReceivables() {
		return receivables;
	}
	public void setReceivables(Set<Receivable> receivables) {
		this.receivables = receivables;
	}
}