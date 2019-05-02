package com.abcbank.hcl.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.abcbank.hcl.bank.dto.CoustmerRegistrationRequest;
import com.abcbank.hcl.bank.service.CustmerServiceImpl;

public class ManagerController {

	
			@Autowired
			CustmerServiceImpl custmerService;
			
	//creatating a coustmer
	//charan
		public void registerCoustmer(CoustmerRegistrationRequest coustmerRegistrationRequest) {
				
					//validation goes here
					// user exist throw error from service layer 
					if(coustmerService.registratingCoustmer(coustmerRegistrationRequest)) {
						
						return ResponseEntity<T>("User Created Sucessfully",Https.ok);
					}
			
					//end of method register Customer
		}
		
		
		
		//creating method to seach by account name
		//charan
		public void searchCoustmerByAccountName(String customerName) {
			
			
			//end of method searchCustomerByAccountName
		}
		
		
		

		//creating method to seach by account name
		//charan
		public void searchCustomerByAccountNumber(Long AccountNumber) {
			
			
			
			//end of method SerachCustomerByAccountNumner
		}
		
}
