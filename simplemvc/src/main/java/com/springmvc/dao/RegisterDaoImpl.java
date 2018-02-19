/**
 * 
 */
package com.springmvc.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springmvc.singleton.data.MvcAppContext;
import com.springmvc.singleton.data.User;

/**
 * @author shivey.upadhyay
 *
 */
@Component
public class RegisterDaoImpl implements RegistrationDao{
	
	@Autowired
	MvcAppContext context;
	
	private static final String USER_ENTRIES = "USER_ENTRIES";
	

	public void registerUser(User user) {
		Object o = context.get(USER_ENTRIES);
		List<User> userList = null;
		if(o == null) {
			userList = new ArrayList<User>();
			context.put(USER_ENTRIES, userList);
		} else {
			userList = (List<User>) o;
		}
		userList.add(user);
	}

}
