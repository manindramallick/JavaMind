/**
 * 
 */
package com.springboot.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.data.Login;
import com.springboot.data.MvcAppContext;
import com.springboot.data.User;

/**
 * @author shivey.upadhyay
 *
 */
@Component
public class UserDaoImpl implements UserDao {

	@Autowired
	MvcAppContext appContext;

	@Override
	public void addUser(User user) {
		List<User> userList = null;

		if ((userList = (List<User>) appContext.get(USER_ENTRIES)) == null) {
			userList = new ArrayList<User>();
			appContext.put(USER_ENTRIES, userList);
		}
		userList.add(user);
	}

	@Override
	public User validate(Login login) {
		User user = null;
		List<User> userList = null;
		if ((userList = (List<User>) appContext.get(USER_ENTRIES)) != null) {
			for (User u : userList) {
				if (u.getUsername().equals(login.getUsername())
						&& u.getPassword().equalsIgnoreCase(login.getPassword())) {
					user = u;
					break;
				}
			}
		}
		return user;
	}

}
