package com.vp.dao;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.vp.model.User;
@Transactional
@Repository
public class UserDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
//   List<User> list = null;
//   public List<User> getAllUsers(){
//	   list = new ArrayList<User>();
//	   list.add(new User(1, "A", 33));
//	   list.add(new User(2, "B", 31));
//	   list.add(new User(3, "C", 23));
//	   
//	   return list;
//   }
	
   public List<User> getAllUsers() {
  	
  	 Criteria criteria = sessionFactory.getCurrentSession().createCriteria(User.class);
  	 return criteria.list();
   } 
   public void saveOrUpdate(User user) {
 		System.out.println("DATA::: "+user);
 		sessionFactory.getCurrentSession().saveOrUpdate(user);
 		System.out.println("User save upadet Done !!!");
 	}
}
