package com.abcbank.hcl.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abcbank.hcl.bank.dto.CustomerRegistrationRequest;
import com.abcbank.hcl.bank.model.Customer;
import com.abcbank.hcl.bank.repository.CustomerRepository;

@Service
public class ManagerServiceImpl implements ManagerService{
	




	@Autowired
	CustomerRepository customerRepository;
	
	
	//method to create user and save user to repo
	//charan
	public boolean registerCustomer(CustomerRegistrationRequest customerRegistrationRequest) {
			
		
			
				//create a new user
				Customer currentCustomer = new Customer();
				
				currentCustomer.setCustomerName(customerRegistrationRequest.getCoustmerName());
				currentCustomer.setAccountAadhar(customerRegistrationRequest.getAccountAadhar());
				currentCustomer.setCustomerPassword(customerRegistrationRequest.getCustomerPassword());
				currentCustomer.setAccountBranch(customerRegistrationRequest.getAccountBranch());
				currentCustomer.setCustomerCity(customerRegistrationRequest.getCoustmerCity());
				
				//zero for new customer
				currentCustomer.setAccountBalance(0);
				currentCustomer.setCustomerEmail(customerRegistrationRequest.getCoustmerEmail());
				currentCustomer.setCustomerPhNum(currentCustomer.getCustomerPhNum());
				currentCustomer.setAccountType(customerRegistrationRequest.getAccountType());
				
				
				
				
				customerRepository.save(currentCustomer);
				
				return true;
		//end of method registrationCoustmer
	}


	@Override
	public Customer getcustomerByName(String customerName) {
		// TODO Auto-generated method stub
		return customerRepository.findByCustomerName(customerName);
	}


	@Override
	public Customer getCustomerByAccountNumber(Long accountNumber) {
		// TODO Auto-generated method stub
		return customerRepository.findByCustomerAccount(accountNumber);
	}
	
	
	public boolean doesCustomerExist(String customerName) {
		Customer validCustomer = customerRepository.findByCustomerName(customerName);
		if(customerName.equalsIgnoreCase(validCustomer.getCustomerName())) {
			return true;
		}else {
			return false;
		}
	}
	

}
