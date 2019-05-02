package com.abcbank.hcl.bank.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	
	
	
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long accountNumber;
	private String customerName; 
	private String customerPassword;
	private String accountBranch;
	private Long accountAadhar; 
	private String coustmerCity;
	private String coustmerEmail;
	private Long coustmerPhNum;
	private double accountBalance;
	private String accountType;
	
	
	public Long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getCoustmerName() {
		return customerName;
	}
	public void setCoustmerName(String coustmerName) {
		this.customerName = coustmerName;
	}
	public String getPassword() {
		return customerPassword;
	}
	public void setCustomerPassword(String password) {
		this.customerPassword = password;
	}
	public String getAccountBranch() {
		return accountBranch;
	}
	public void setAccountBranch(String accountBranch) {
		this.accountBranch = accountBranch;
	}
	public Long getAccountAadhar() {
		return accountAadhar;
	}
	public void setAccountAadhar(Long accountAadhar) {
		this.accountAadhar = accountAadhar;
	}
	public String getCoustmerCity() {
		return coustmerCity;
	}
	public void setCoustmerCity(String coustmerCity) {
		this.coustmerCity = coustmerCity;
	}
	public String getCoustmerEmail() {
		return coustmerEmail;
	}
	public void setCoustmerEmail(String coustmerEmail) {
		this.coustmerEmail = coustmerEmail;
	}
	public Long getCoustmerPhNum() {
		return coustmerPhNum;
	}
	public void setCoustmerPhNum(Long coustmerPhNum) {
		this.coustmerPhNum = coustmerPhNum;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

}
