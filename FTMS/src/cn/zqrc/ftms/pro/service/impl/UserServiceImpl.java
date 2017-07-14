package cn.zqrc.ftms.pro.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.zqrc.ftms.base.BaseDaoImpl;
import cn.zqrc.ftms.pro.service.UserService;
import cn.zqrc.ftms.pro.vo.User;

@Service
@Transactional
public class UserServiceImpl extends BaseDaoImpl<User> implements UserService{

//	获取登陆账号
	public User fingByName(String userName,String pass) {
		return (User)getSession().createQuery("FROM User u WHERE u.userName = ? and u.password = ?").setString(0,userName).setString(1,pass).uniqueResult();
	}

//	判断账号是否存在
	public User findUserName(String userName) {
		return (User)getSession().createQuery("FROM User u WHERE u.userName = ?").setString(0,userName).uniqueResult();
	}
}
