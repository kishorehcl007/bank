package com.abcbank.hcl.bank.dto;


import java.io.Serializable;

public class CustomerRegistrationRequest implements Serializable {
	
	
	//This is auto generated
	private Long accountNumber;
	private String customerName;
	private String customerPassword;
	private String accountBranch;
	private Long accountAadhar;
	private String coustmerCity;
	private String coustmerEmail;
	private Long coustmerPhNum;
	//set the inital limit to == 0
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
	public String getPassWord() {
		return customerPassword;
	}
	public void setPassWord(String passWord) {
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
