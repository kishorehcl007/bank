package com.abcbank.hcl.bank.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abcbank.hcl.bank.dto.LoginReqDTO;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	
	@GetMapping("/userlogin")
	public ResponseEntity<String> getMyPets(@RequestBody LoginReqDTO loginDto){
		String message = userService.myPets(userId);
		return new ResponseEntity<String>(message, HttpStatus.OK);
	}
	

}
