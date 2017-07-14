package cn.zqrc.ftms.pro.action;

import java.util.Date;

import javax.faces.application.Application;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.components.ActionMessage;
import org.springframework.context.ApplicationContext;

import cn.zqrc.ftms.base.BaseAction;
import cn.zqrc.ftms.pro.vo.User;
import cn.zqrc.ftms.tools.DateUtil;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
/**
 * 
 * @author guo
 *	1：通过名字获得用户
 *		用户不存在
 *	2：对比密码用户账号和密码
 *		正确	密码错误
 *	3：返回对应界面
 */
public class UserAction extends BaseAction<User>{
	//	登陆   url:User_login
	public String login(){
		User user = new User();
		user = userservice.fingByName(getModel().getUserName(),getModel().getPassword());
		if(user == null){
			ActionContext.getContext().getSession().put("msg", "账号密码错误，请检查后重新登录！");
			return "error";
		}else{
			user.setLoginTime(new Date());
			user.setLoginIp(ServletActionContext.getRequest().getRemoteAddr());
			userservice.update(user);
			setAdmins(user);
			return "login";
		}
	}

	//	通过id删除
	public String delById(){
		if(getModel().getId().equals(getAdmins().getId())){
			ActionContext.getContext().getSession().put("msg", "不能删除自己！");
			ActionContext.getContext().getValueStack().set("person",userservice.findAll());
			return "staff";
		}else{
			userservice.delete(getModel().getId());
			ActionContext.getContext().getValueStack().set("person",userservice.findAll());
			return "staff";
		}
	}

	//	增加员工
	public String add(){
		return "add";
	}

	//	保存增加员工信息
	public String save(){
		User users = new User();
		users = userservice.findUserName(getModel().getUserName());
		//		判定账号存在
		if(users==null){
			User user = new User();
			user.setUserName(getModel().getUserName());
			user.setName(getModel().getName());
			user.setPhone(getModel().getPhone());
			user.setInfo(getModel().getInfo());
			user.setPassword(getModel().getPassword());
			userservice.save(user);

			userservice.delete(getModel().getId());
			ActionContext.getContext().getValueStack().set("person",userservice.findAll());
			return "staff";
		}else{
			ActionContext.getContext().getSession().put("msg", "该账号已存在，请更换账号！");
			return "add";
		}

	}
	//	跳转修改信息界面
	public String update(){

		ActionContext.getContext().getSession().put("user", userservice.getById(getModel().getId()));
		return "update";
	}
	//	修改员工信息
	public String userUpdate(){
		User user = new User();
		user = userservice.getById(getModel().getId());
		user.setPhone(getModel().getPhone());
		user.setInfo(getModel().getInfo());
		user.setPassword(getModel().getPassword());
		userservice.update(user);
		ActionContext.getContext().getValueStack().set("person",userservice.findAll());
		return "staff";
	}

	/**
	 * 修改用户信息
	 * User_update
	 * @author guo
	 */
	public String myUpdate(){
		User user = getAdmins();
		user.setPassword("");
		userservice.update(user);
		return "myUpdate";
	}
}
