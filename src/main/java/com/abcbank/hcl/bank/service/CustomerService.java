package com.abcbank.hcl.bank.service;

import org.springframework.stereotype.Service;

import com.abcbank.hcl.bank.model.Customer;

@Service
public interface CustomerService {

	
	 Customer getcustomerByName(String customerName);

	 Customer getCustomerByAccountNumber(Long accountNumber);

}
