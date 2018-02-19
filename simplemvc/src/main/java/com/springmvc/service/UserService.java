/**
 * 
 */
package com.springmvc.service;

import com.springmvc.singleton.data.Login;
import com.springmvc.singleton.data.User;

/**
 * @author shivey.upadhyay
 *
 */
public interface UserService {
	
	User validateUser(Login login);

}
