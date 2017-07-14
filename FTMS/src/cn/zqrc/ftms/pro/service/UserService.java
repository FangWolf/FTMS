package cn.zqrc.ftms.pro.service;

import cn.zqrc.ftms.base.BaseDao;
import cn.zqrc.ftms.pro.vo.User;

public interface UserService extends BaseDao<User>{
//	获取登陆对象
	public User fingByName(String name,String pass);
//	判断账号是否存在
	public User findUserName(String userName);
}
