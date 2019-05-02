package com.abcbank.hcl.bank.model;

import javax.persistence.Entity;

@Entity
public class Customer {
	
	private Long accountNumber;
	private String coustmerName;
	private String accountBranch;
	private Long accountAadhar;
	private String coustmerCity;
	private String coustmerEmail;
	private Long coustmerPhNum;
	private double accountBalance;
	private String accountType;

}
