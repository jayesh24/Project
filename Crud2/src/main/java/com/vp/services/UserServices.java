package com.vp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vp.dao.UserDao;
import com.vp.model.User;
@Service
@Transactional
public class UserServices {
	 
	@Autowired
	UserDao userDao;
	
	public List<User> getAllUsers(){
		return userDao.getAllUsers();
	}	
	
	public void saveOrUpdate(User user) {
		userDao.saveOrUpdate(user);
	}
}