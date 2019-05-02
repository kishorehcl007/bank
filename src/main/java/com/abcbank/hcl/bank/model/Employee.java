package com.abcbank.hcl.bank.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Employee {
	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 private Long empId;
	 private String empName;
	 private String passWord;
	 private String location;
	 public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		location = location;
	}



}
