package cn.zqrc.ftms.pro.action;

import java.util.List;

import cn.zqrc.ftms.base.BaseAction;
import cn.zqrc.ftms.pro.vo.Bid;
import cn.zqrc.ftms.pro.vo.Project;
import cn.zqrc.ftms.pro.vo.User;

import com.opensymphony.xwork2.ActionContext;

/*
 * 项目管理
 * guo
 */
public class MangerAction extends BaseAction<Bid>{


	//	项目列表展示
	public String show(){
		//根据用户的id进行查询归属的项目
//		List<Project> Projects = mangerservice.findByAdmin(String.valueOf(getAdmins().getId()));
		ActionContext.getContext().put("Projects", getAdmins().getProjects());
		return "show";
	}

}
