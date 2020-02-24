package com.vp.controller;

import java.util.List;

import org.apache.tomcat.util.log.UserDataHelper.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.vp.model.User;
import com.vp.services.UserServices;

@Controller
public class HomeController {
	@Autowired
	UserServices userService;

	@RequestMapping("/home")
	public String web1() {
		return "home";
	}

//	@RequestMapping("/listUsers")
//	String getUser(Model model) {
//		List<User> list = userService.getAllUsers();
//
//		model.addAttribute("list", list);
//		return "listUsers";
//	}
	 
	 @RequestMapping("/stdForm")
	 public String saveStudent(Model model) {
		 
		 model.addAttribute("user", new User());
		 return "stdForm";
	 }
	 @GetMapping("/listUsers")
	 public ModelAndView getUser() {
		 List<User> list = userService.getAllUsers();
		 System.out.println(list);
		 ModelAndView modelAndView = new ModelAndView("stdList","list",list);
		 return modelAndView;
	 }
	 @PostMapping("/saveUser")
	 public String saveUser(@ModelAttribute("user") User user) {
		 userService.saveOrUpdate(user);
		 return "redirect:/listUsers";
	 }
}
