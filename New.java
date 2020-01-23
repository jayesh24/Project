package com.cts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Main {

	public static void main(String[] args)throws ClassNotFoundException,SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jayant1","root", "welcome");
		Statement stmt=con.createStatement();
		person s1=new person(101,"Sonoo");  
		  person s2=new person(102,"Ravi");  
		  ArrayList<person> al=new ArrayList<person>();  
		  al.add(s1);  
		  al.add(s2);
	  Iterator itr=al.iterator();  
	  while(itr.hasNext()){  
	    person st=(person)itr.next();  
	    System.out.println(st.pid+" "+st.pname);
	   }
		    String insert="insert into person  values("+s1.pid+",'"+s1.pname+"')";
		    String insert1="insert into person  values("+s2.pid+",'"+s2.pname+"')";
		    Statement stmt1=con.prepareStatement(insert);
		    Statement stmt2=con.prepareStatement(insert1);
			stmt1.executeUpdate(insert);
			stmt1.executeUpdate(insert1);
			System.out.println("reterive values from database:");
			ResultSet set=stmt.executeQuery("select * from person");
			while(set.next())
			{
				System.out.println(set.getInt(1)+" "+set.getString(2));
			}
		  
}
}
class person 
 {
	 int pid;
	 String pname;
	 boolean flag;
	 	public person(int pid,String pname) 
	 	{
		 this.pid=pid;
		 this.pname=pname;
	 	}	
 }
