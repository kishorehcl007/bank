package com.abcbank.hcl.bank.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	
	
	
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   private Long CustomeId;
	private Long accountNumber;
	private String customerName; 
	private String customerPassword;
	private String accountBranch;
	private Long accountAadhar; 
	private String customerCity;
	private String customerEmail;
	private Long customerPhNum;
	private double accountBalance;
	private String accountType;
	public Long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerPassword() {
		return customerPassword;
	}
	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
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
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public Long getCustomerPhNum() {
		return customerPhNum;
	}
	public void setCustomerPhNum(Long customerPhNum) {
		this.customerPhNum = customerPhNum;
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
