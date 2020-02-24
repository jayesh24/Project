package com.jdbctemp.model;

public class Student {

	 int sid;
	   String name;
	   int age;
	   String address;
	   @Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", age=" + age + ",address=" + address + "]";
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	   public Student(int sid, String name, int age,String address) {
		super();
		this.sid = sid;
		this.name = name;
		this.age = age;
		this.address=address;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
}
