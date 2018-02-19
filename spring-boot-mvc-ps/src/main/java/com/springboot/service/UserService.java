package com.springboot.service;

import com.springboot.data.Login;
import com.springboot.data.User;

public interface UserService {
	
	void registerUser(User user);
	
	User performLogin(Login login);

}
