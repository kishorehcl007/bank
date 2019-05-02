package com.abcbank.hcl.bank.controller;

public class UserController {
@GetMapping("/transacationDetails")
	public List<TransReqDTO> getTranscationDetails(@PathVariable Long accountNumber){
		
       List<TransReqDTO> transListResult=userService.getTranscationDetails(accountNumber);		
	   return transListResult;
		
	}
}
