package org.service.imp;

import org.dao.UserDao;
import org.model.User;
import org.service.UserService;

public class UserServiceImp implements UserService{
	private UserDao userDao;		//对 UserDao 依赖注入
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public boolean addUser(User user) {
		return userDao.addUser(user);
	}

}
