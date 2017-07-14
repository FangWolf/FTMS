package cn.zqrc.ftms.pro.action;

import javax.faces.application.Application;

import com.opensymphony.xwork2.ActionContext;

import cn.zqrc.ftms.base.BaseAction;
import cn.zqrc.ftms.pro.vo.User;

/**
 * 基本页面跳转
 * @author JiaQi
 *
 */
public class IndexAction extends BaseAction<User>{
//	situation 跳转priject_situation
	public String situation(){
		return "situation";
	}
	
//	跳转 project_my
	public String my(){
		return "my";
	}
	
//	跳转界面histry 跳转project_histry
	public String histry(){
		return "histry";
	}
	
//	manger 跳转 project_manger
	public String manger(){
//		guo
//		User admins = getAdmins();
		//根据用户的id进行查询归属的项目
//		List<Project> projects = mangerservice.findByAdmin(String.valueOf(admins.getId()));
		ActionContext.getContext().put("projects", getAdmins().getProjects());
		return "manger";
	}
	
//	brand 跳转 project_brand
	public String brand(){
		return "brand";
	}
	
//	staff 跳转staff界面
	public String staff(){
		ActionContext.getContext().getValueStack().set("person",userservice.findAll());
		return "staff";
	}
	
//	person 跳转person
	public String person(){

		return "person";
	}
//	退出登陆
	public String out(){
		ActionContext.getContext().getSession().clear();
		return "out";
	}
}
