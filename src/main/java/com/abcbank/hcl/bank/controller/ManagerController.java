package com.abcbank.hcl.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.abcbank.hcl.bank.dto.CustomerRegistrationRequest;
import com.abcbank.hcl.bank.model.Customer;
import com.abcbank.hcl.bank.service.CustomerService;
import com.abcbank.hcl.bank.service.ManagerService;


@RestController
@RequestMapping("/ManagerApi")
public class ManagerController {

	@Autowired
	CustomerService customerService;

	@Autowired
	ManagerService managerService;

	//Create a  coustmer
	//Method : Register Customer
	//	This method will create an user with the given input
	//	If the user already exist
	//		It will return with string User Exist
	//	If any data is missing 
	//		Throws an exception
	//	Else
	//		Create an new User
	//charan
	@PostMapping("/RegisterUser")
	public ResponseEntity<String>  registerCustomer(@RequestBody CustomerRegistrationRequest customerRegistrationRequest) {
		if(managerService.registerCustomer(customerRegistrationRequest)){
			return new ResponseEntity<String>("User Created Sucessfully",HttpStatus.CREATED); 
		}else{
			return new ResponseEntity<String>("Error Creating User",HttpStatus.BAD_REQUEST);
		}
		//end of method register Customer
	}


	//creating method to seach by account name
	//Method : search a customer By customer Name
	//	1. valid the input(check for datatype);
	//	If the user exist display the customer details
	//	else
	//		return with customer not found with given name
	//charan
	@GetMapping("/searchCoustmerByName/{customerName}")
	public ResponseEntity<Customer> searchCustomerByAccountName(@RequestParam String customerName) {

		return new ResponseEntity<Customer>(customerService.getcustomerByName(customerName),HttpStatus.FOUND);
		//end of method searchCustomerByAccountName
	}

	//Method : search a customer By customer Account Number
	//	1. valid the input(check for datatype);
	//	If the user exist display the customer details
	//	else
	//		return with customer not found given account number
	//charan
	@GetMapping("/searchCoustmerByAccountNum/{accountNumber}")
	public ResponseEntity<Customer> searchCustomerByAccountNumber(@RequestParam Long accountNumber) {

		return new ResponseEntity<Customer>(customerService.getCustomerByAccountNumber(accountNumber),HttpStatus.FOUND);
		//end of method SerachCustomerByAccountNumner
	}

}
