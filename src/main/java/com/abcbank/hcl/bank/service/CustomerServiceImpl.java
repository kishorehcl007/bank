package com.abcbank.hcl.bank.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.abcbank.hcl.bank.model.Customer;
import com.abcbank.hcl.bank.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {
 @Autowired
 CustomerRepository customerRepositroy;
 
 
	@Override
	public Customer updateCustomerDetails(String cusEmail,Long cusPhNum,Long cusAccNam) {
		
		Customer currentCust = new Customer();
		currentCust = customerRepositroy.findByCustomerName(cusAccNam);
		currentCust.setCoustmerEmail(cusEmail);
		currentCust.setCoustmerPhNum(cusPhNum);
		return currentCust;	
	}

}
