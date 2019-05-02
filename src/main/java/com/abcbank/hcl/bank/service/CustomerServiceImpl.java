package com.abcbank.hcl.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abcbank.hcl.bank.dto.CustomerRegistrationRequest;
import com.abcbank.hcl.bank.model.Customer;
import com.abcbank.hcl.bank.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerRepository customerRepository;
	
	
	
	//method to create user and save user to repo
	//charan
	public void registratingCoustmer(CustomerRegistrationRequest customerRegistrationRequest) {
			
		
				//create a new user
				Customer currentCustomer = new Customer();
				
				currentCustomer.setCoustmerName(customerRegistrationRequest.getCoustmerName());
				currentCustomer.setAccountAadhar(customerRegistrationRequest.getAccountAadhar());
				currentCustomer.setCustomerPassword(customerRegistrationRequest.getCustomerPassword());
				currentCustomer.setAccountBranch(customerRegistrationRequest.getAccountBranch());
				currentCustomer.setCoustmerCity(customerRegistrationRequest.getCoustmerCity());
				
				//zero for new customer
				currentCustomer.setAccountBalance(0);
				currentCustomer.setCoustmerEmail(customerRegistrationRequest.getCoustmerEmail());
				currentCustomer.setCoustmerPhNum(currentCustomer.getCoustmerPhNum());
				currentCustomer.setAccountType(customerRegistrationRequest.getAccountType());
				
				
				
				
				customerRepository.save(currentCustomer);
		//end of method registrationCoustmer
	}
	
	
public class CustomerServiceImpl implements CustomerService {

}
