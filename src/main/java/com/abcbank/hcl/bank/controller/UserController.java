package com.abcbank.hcl.bank.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abcbank.hcl.bank.dto.TransReqDTO;
import com.abcbank.hcl.bank.dto.UpdateRequest;
import com.abcbank.hcl.bank.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class UserController {

	
	@Autowired
	CustomerService customerService1;
	
	@GetMapping("/transacationDetails")
	public List<TransReqDTO> getTranscationDetails(@PathVariable Long accountNumber){
		
       List<TransReqDTO> transListResult=customerService1.getTranscationDetails(accountNumber);		
	   return transListResult;
		
	}	

	@PutMapping("/updateCustomer")
	public ResponseEntity<String> updateCustomerDetails(@RequestBody UpdateRequest updateRequest) {
		String message=customerService1.updateCustomerDetails(updateRequest);
		return new ResponseEntity<String>(message, HttpStatus.OK);

	}
	
	
}
