/**
 * 
 */
package com.springboot.dao;

import com.springboot.data.Login;
import com.springboot.data.User;

/**
 * @author shivey.upadhyay
 *
 */
public interface UserDao {
	
	String USER_ENTRIES = "USER_ENTRIES";
	
	/**
	 * 
	 * @param user
	 */
	void addUser(User user);
	
	/**
	 * @param login
	 * @return
	 */
	User validate(Login login);

}
