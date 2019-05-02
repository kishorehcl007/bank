package com.abcbank.hcl.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abcbank.hcl.bank.dto.CustomerRegistrationRequest;
import com.abcbank.hcl.bank.model.Customer;

import com.abcbank.hcl.bank.repository.CustomerRepository;


@Service
public interface CustomerService {
	
	public Customer updateCustomerDetails(CustomerRegistrationRequest cust);	

}
