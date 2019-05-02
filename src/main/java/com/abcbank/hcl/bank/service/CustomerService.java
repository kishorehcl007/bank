package com.abcbank.hcl.bank.service;

import org.springframework.stereotype.Service;

import com.abcbank.hcl.bank.model.Customer;

@Service
public interface CustomerService {
	
	public Customer updateCustomerDetails(String cusEmail,Long cusPhonNum ,Long AccountName);

	

	


}
