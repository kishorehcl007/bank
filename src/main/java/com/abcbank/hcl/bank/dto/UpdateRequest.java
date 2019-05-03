package com.abcbank.hcl.bank.dto;

import java.io.Serializable;

public class UpdateRequest  implements Serializable{

	private long AccountNumber;
	private String customerEmail;
	private Long phoneNumber;

	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public long getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		AccountNumber = accountNumber;
	}
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
