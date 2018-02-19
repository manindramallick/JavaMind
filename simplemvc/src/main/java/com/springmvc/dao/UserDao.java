/**
 * 
 */
package com.springmvc.dao;

import com.springmvc.singleton.data.Login;
import com.springmvc.singleton.data.User;

/**
 * @author shivey.upadhyay
 *
 */
public interface UserDao {
	
	User validate(Login login);

}
