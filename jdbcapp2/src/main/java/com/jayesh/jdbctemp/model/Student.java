package com.jayesh.jdbctemp.model;

public class Student {

	 int eid;
	   String firstname;
	   String lastname;
	   int age;
	   int salary;
	   int departid;
	   
	   @Override
	public String toString() {
		return "Student [eid=" + eid + ", firstname=" + firstname + ", lastname="+ lastname +", age=" + age + ",salary ="+salary +",departid="+departid +"]";
	}

	public int geteid() {
		return eid;
	}

	public void seteid(int eid) {
		this.eid = eid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getDepartid() {
		return departid;
	}

	public void setDepartid(int departid) {
		this.departid = departid;
	}

	   public Student(int eid, String firstname,String lastname, int age,int salary,int departid) {
		super();
		this.eid = eid;
		this.firstname = firstname;
		this.age = age;
		this.lastname=lastname;
		this.salary=salary;
		this.departid=departid;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
}
