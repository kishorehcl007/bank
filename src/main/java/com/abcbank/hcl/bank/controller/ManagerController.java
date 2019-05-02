package com.abcbank.hcl.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.abcbank.hcl.bank.dto.CustomerRegistrationRequest;
import com.abcbank.hcl.bank.model.Customer;
import com.abcbank.hcl.bank.service.CustomerService;

public class ManagerController {

			@Autowired
			CustomerService customerService;
			
	//creatating a coustmer
	//charan
		public String registerCoustmer(CustomerRegistrationRequest customerRegistrationRequest) {
				
					//validation goes here
					// user exist throw error from service layer 
					if(customerService.registerCoustmer(customerRegistrationRequest)) {
						
						return "user created sucessully";
					}
			
					//end of method register Customer
		}
		
		
		
		//creating method to seach by account name
		//charan
		public Customer searchCustomerByAccountName(String customerName) {
			
					return customerService.getcustomerByName(customerName);
			//end of method searchCustomerByAccountName
		}
		
		
		

		//creating method to seach by account name
		//charan
		public Customer searchCustomerByAccountNumber(Long accountNumber) {
			
			
				return customerService.getCustomerByAccountNumber(accountNumber);
			//end of method SerachCustomerByAccountNumner
		}
		
}
