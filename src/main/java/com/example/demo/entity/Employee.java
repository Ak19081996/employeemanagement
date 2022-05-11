package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table
public class Employee {
	@Id
	
	private int empid;
	@Column
	private String name;
	@Column
	private int age;
	@Column
	private long salary;
	@Column
	private String dob;
	@Column
	private String mail;
	@Column
	private String manager;
	@Column
	private int projectid;
	@Column
	private String sex;
	@Column
	private String mobile;
		
	
	
	
	//1
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
	//2
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//3
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//4
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	//5
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	//6
	public String getMaritalStatus() {
		return mail;
	}
	public void setMaritalStatus(String mail) {
		this.mail = mail;
	}
	
	//7
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	
	//8
	public int getProjectid() {
		return projectid;
	}
	public void setProjectid(int projectid) {
		this.projectid = projectid;
	}
	
	//9
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
	
	
	
	
	
	
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "CreateEmpRequest [empid=" + empid + ", name=" + name + ", age=" + age + ", salary=" + salary + ", dob="
				+ dob + ", maritalStatus=" + mail + ", manager=" + manager + ", projectid=" + projectid
				+ ", sex=" + sex + ", mobile=" + mobile + "]";
	}
	

}
