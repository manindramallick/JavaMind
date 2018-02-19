/**
 * 
 */
package com.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.dao.RegistrationDao;
import com.springmvc.singleton.data.User;

/**
 * @author shivey.upadhyay
 *
 */
@Service
public class RegisterServiceImpl implements RegisterService{
	
	@Autowired
	RegistrationDao dao;

	public void register(User user) {
		dao.registerUser(user);
	}
	
	
	
}
