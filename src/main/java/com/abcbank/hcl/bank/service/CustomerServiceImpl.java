package com.abcbank.hcl.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abcbank.hcl.bank.model.Customer;
import com.abcbank.hcl.bank.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{


	
	@Autowired
	CustomerRepository customerRepository;
	
	
	
	
	  public Customer getcustomerByName(String customerName) {
		// TODO Auto-generated method stub
		Customer responseCustomer = customerRepository.findByCustomerName(customerName);
		return responseCustomer;
	}

	  public Customer getCustomerByAccountNumber(Long accountNumber) {
		// TODO Auto-generated method stub
		Customer responeCustomer = customerRepository.findByAccountNumber(accountNumber);
		return responeCustomer;
	}
	
}

