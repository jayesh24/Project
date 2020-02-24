package com.vp.HibernT1;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Session session = new AnnotationConfiguration().configure("hibernate.cfg.xml")
				.buildSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
					
//		  Person p1 = new Person(); 
//		  //p1.setPid(101);
//		  p1.setPnane("Jayesh");
//		  p1.setAge(21);
//		  session.save(p1);		 
		
		String sql="from Person";
		Query query=session.createQuery(sql);
		List list=query.list();
		for(Object object:list)
		{
			System.out.println((Person)object);
		}
		transaction.commit();
		
		session.close();
		System.out.println("annot done ...");
    }
}