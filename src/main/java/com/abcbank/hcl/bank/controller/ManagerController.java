package com.abcbank.hcl.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.abcbank.hcl.bank.dto.CustomerRegistrationRequest;
import com.abcbank.hcl.bank.model.Customer;
import com.abcbank.hcl.bank.service.CustomerService;
import com.abcbank.hcl.bank.service.ManagerService;

public class ManagerController {

			@Autowired
			CustomerService customerService;
			
			@Autowired
			ManagerService managerService;
			
	//creatating a coustmer
	//charan
		public String registerCoustmer(CustomerRegistrationRequest customerRegistrationRequest) {
				
					//validation goes here
					// user exist throw error from service layer 
					if(managerService.registerCustomer(customerRegistrationRequest)) 
						return "user created sucessully";
					else
						return "error while creating user";
					
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
