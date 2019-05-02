package com.abcbank.hcl.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abcbank.hcl.bank.model.Customer;
import com.abcbank.hcl.bank.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {
 @Autowired
 CustomerRepository customerRepositroy;
 
	@Autowired
	CustomerRepository customerRepository;
 
	@Override
	public Customer updateCustomerDetails(CustomerRegistrationRequest customer) {
	
		Customer currentCust =null;
	    Long accNo=	customer.getAccountNumber();
		currentCust = customerRepositroy.findById(accNo).get();
		currentCust.setCoustmerEmail(customer.getCoustmerEmail());
		currentCust.setCoustmerPhNum(customer.getCoustmerPhNum());
		customerRepositroy.save(currentCust);
		return currentCust;	
	}

	
	
	
	
	


	
	  public Customer getcustomerByName(String customerName) {
		Customer responseCustomer = customerRepository.findByCustomerName(customerName);
		return responseCustomer;
	}

	  public Customer getCustomerByAccountNumber(Long accountNumber) {
		Customer responeCustomer = customerRepository.findByAccountNumber(accountNumber);
		return responeCustomer;
	}
	
}

