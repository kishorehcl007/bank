package com.abcbank.hcl.bank.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.abcbank.hcl.bank.dto.LoginReqDTO;
import com.abcbank.hcl.bank.model.Customer;
import com.abcbank.hcl.bank.repository.CustomerRepository;

public class LoginServiceImpl implements LoginService{
	@Autowired
	CustomerRepository custRepo;

	@Override
	public String validateLogin(LoginReqDTO loginDTO) {
		Customer cust= new Customer();
		Long custID = loginDTO.getUserID();
		cust = custRepo.findById(loginDTO);
		// TODO Auto-generated method stub
		return null;
	}

}
