package cn.zqrc.ftms.pro.service.impl;

/**
 * 项目管理serviceimpl
 * guo
 */
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.zqrc.ftms.base.BaseDaoImpl;
import cn.zqrc.ftms.pro.service.MangerService;
import cn.zqrc.ftms.pro.vo.Project;
@Service
@Transactional
public class MangerServiceImpl extends BaseDaoImpl<Project> implements MangerService{

//	通过用户名查询此用户所拥有的项目
//	public List<Project> findByAdmin(String user) {
//		// TODO Auto-generated method stub
//		return (List<Project>)getSession().createQuery("FROM Project p WHERE p.user = ? ").setString(0,user).list();
//	}

}
