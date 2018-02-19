/**
 * 
 */
package com.springmvc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springmvc.singleton.data.Login;
import com.springmvc.singleton.data.MvcAppContext;
import com.springmvc.singleton.data.User;

/**
 * @author shivey.upadhyay
 *
 */
@Component
public class UserDaoImpl implements UserDao{

	@Autowired
	MvcAppContext context;
	
	private static final String USER_ENTRIES = "USER_ENTRIES";
	
	public User validate(Login login) {
		Object o = context.get(USER_ENTRIES);
		User user = null;
		if(o != null) {
			List<User> userList = (List<User>) o;
			for(User u : userList) {
				if (u.getUsername().equalsIgnoreCase(login.getUsername())
						&& u.getPassword().equals(login.getPassword())) {
					user = u;
					break;
				}
			}
		}
		return user;
	}

}
