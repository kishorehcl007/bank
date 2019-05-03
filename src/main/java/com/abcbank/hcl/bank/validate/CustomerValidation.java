package com.abcbank.hcl.bank.validate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abcbank.hcl.bank.model.Customer;
import com.abcbank.hcl.bank.repository.CustomerRepository;

@Service
public class CustomerValidation{


	@Autowired
	CustomerRepository customerRepository;

	//Method :
	//Input --> Customer Name
	//	Method takes given customer name and checks in the database 
	//Output --> True / False
	public boolean  doesCustomerNameExistBy(String customerName){
		Customer validateCustomer = new Customer();
		validateCustomer = customerRepository.findByCustomerName(customerName);
		if(validateCustomer != null){
			return true;
		}else{
			return false;
		}
	//end of method doesCustomerName Exist
	}


	//Method :
	//Input --> Customer Account Number
	//	Method takes given customer AccountNumber   and checks in the database 
	//Output --> True / False
	public boolean doesAccountNumberExist(Long accountNumber){
		Customer validateCustomer = new Customer();
		validateCustomer = customerRepository.findByAccountNumber(accountNumber);
		if(validateCustomer != null){
			return true;
		}else{
			return false;
		}
	//end of method doesAccountNumber Exist
	}
}
