package com.abcbank.hcl.bank.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abcbank.hcl.bank.dto.LoginReqDTO;
import com.abcbank.hcl.bank.service.LoginServiceImpl;

@RestController
@RequestMapping("/login")
public class LoginController {
	@Autowired
	LoginServiceImpl loginService;
	
	@PostMapping("/userlogin")
	public ResponseEntity<String> validateLogin(@RequestBody LoginReqDTO loginDto){
		String message = loginService.validateLogin(loginDto);
		return new ResponseEntity<String>(message, HttpStatus.OK);
	}

}
