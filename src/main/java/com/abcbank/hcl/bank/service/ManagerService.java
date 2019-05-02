package com.abcbank.hcl.bank.service;

import com.abcbank.hcl.bank.dto.CustomerRegistrationRequest;
import com.abcbank.hcl.bank.model.Customer;



public interface ManagerService {

	Customer getcustomerByName(String customerName);

	Customer getCustomerByAccountNumber(Long accountNumber);

	boolean registerCustomer(CustomerRegistrationRequest coustmerRegistrationRequest);
	
	
	
}
