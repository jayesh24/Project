package com.vp.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vp.dao.UserDao;
import com.vp.model.User;

@Service
public class UserService {
   
	@Autowired
	UserDao userDao;
	
	public List<User> getAllUsers(){
		return userDao.getAllUsers();
	}
}

