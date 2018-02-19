/**
 * 
 */
package com.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.UserDao;
import com.springboot.data.Login;
import com.springboot.data.User;

/**
 * @author shivey.upadhyay
 *
 */
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDao uDao;
	
	@Override
	public void registerUser(User user) {
		uDao.addUser(user);
	}

	@Override
	public User performLogin(Login login) {
		return uDao.validate(login);
	}

}
