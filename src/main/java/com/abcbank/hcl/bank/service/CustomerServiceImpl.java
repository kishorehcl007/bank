package com.abcbank.hcl.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abcbank.hcl.bank.repository.CustomerRepository;

@Service
public class CustomerServiceImpl {

	@Autowired
	CustomerRepository customerRepository;
	
	
	
	//method to create user and save user to repo
	//charan
	public void registratingCoustmer(CustomerRegistratonRequest customerRegistrationRequest) {
			
		
				//create a new user
				Customer currentCustomer = new Customer();
				currentCustomer.setAccountNumber(customerRegistrationRequest.getAccountNumber());
				currentCustomer.setCoustmerName(customerRegistrationRequest.getCustomerName());
				currentCustomer.setBranch
				currentCustomer.set phoe
				
				
				customerRepository.save(customerRegistrationRequest);
		//end of method registrationCoustmer
	}
	
	
public class CustomerServiceImpl implements CustomerService {

}
