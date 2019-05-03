package com.abcbank.hcl.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abcbank.hcl.bank.dto.CustomerRegistrationRequest;
import com.abcbank.hcl.bank.exceptions.CustomerNotFoundException;
import com.abcbank.hcl.bank.model.Customer;
import com.abcbank.hcl.bank.repository.CustomerRepository;
import com.abcbank.hcl.bank.validate.CustomerValidation;

@Service
public class ManagerServiceImpl implements ManagerService{


	@Autowired
	CustomerValidation customerValidation;


	@Autowired
	CustomerRepository customerRepository;


	//method to create user and save user to repo
	// check wheather customer exist by his name
	//  if not 
	//  	create new customer 
	//  if 
	//  	throw customer already exist
	//  	
	//charan
	public boolean registerCustomer(CustomerRegistrationRequest customerRegistrationRequest) {

     if(!customerValidation.doesCustomerNameExistBy(customerRegistrationRequest.getCoustmerName())){

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
     }else{
	       return false;
     }
		//end of method registrationCoustmer
	}


	// Method
	// Searches for the customer by name
	// 	If found 
	// 		return the customer
	// 	else
	// 		throw exception
	@Override
	public Customer getcustomerByName(String customerName) {
		if(customerValidation.doesCustomerNameExistBy(customerName)){
			return customerRepository.findByCustomerName(customerName);
		}else{
			throw new CustomerNotFoundException(customerName);
		}
	}

	// Method
	// Searches for the customer by Account Number
	// 	If found 
	// 		return the customer
	// 	else
	// 		throw exception

	@Override
	public Customer getCustomerByAccountNumber(Long accountNumber) {
		if(customerValidation.doesAccountNumberExist(accountNumber)){
			return customerRepository.findByAccountNumber(accountNumber);
		}else{
			throw new CustomerNotFoundException(accountNumber.toString());
		}
	}

}
