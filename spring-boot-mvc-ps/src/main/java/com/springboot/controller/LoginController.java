/**
 * 
 */
package com.springboot.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.data.Login;
import com.springboot.data.User;
import com.springboot.service.UserService;

/**
 * @author shivey.upadhyay
 *
 */
@Controller
public class LoginController {

	@Autowired
	UserService userService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("login");
		mav.addObject(new Login());
		return mav;
	}

	@RequestMapping(value = "/processLogin", method = RequestMethod.POST)
	public ModelAndView processLogin(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("login") Login login) {
		ModelAndView mav = null;
		User user = userService.performLogin(login);
		if (null == user) {
			mav = new ModelAndView("login");
			mav.addObject("message", "Invalid Username or Password!\nPlease try again!");
		} else {
			mav = new ModelAndView("welcome");
			mav.addObject("firstname", user.getFirstname() + " " + user.getLastname());
		}
		return mav;
	}

}
