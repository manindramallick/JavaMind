/**
 * 
 */
package com.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.dao.UserDao;
import com.springmvc.singleton.data.Login;
import com.springmvc.singleton.data.User;

/**
 * @author shivey.upadhyay
 *
 */
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	public User validateUser(Login login) {
		User u = userDao.validate(login);
		return u;
	}

}
