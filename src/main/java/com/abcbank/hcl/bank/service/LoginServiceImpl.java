package com.abcbank.hcl.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abcbank.hcl.bank.dto.LoginReqDTO;
import com.abcbank.hcl.bank.model.Customer;
import com.abcbank.hcl.bank.model.Employee;
import com.abcbank.hcl.bank.repository.CustomerRepository;
import com.abcbank.hcl.bank.repository.EmployeeRepository;

@Service
public class LoginServiceImpl implements LoginService{
	@Autowired
	CustomerRepository custRepo;
	
	@Autowired
	EmployeeRepository empRepo;

	@Override
	public String validateLogin(LoginReqDTO loginDTO) {
		String message = null;
		Customer cust= new Customer();
		Employee emp= new Employee();
		Long userID = loginDTO.getUserID();
		if (loginDTO.getUserType().equalsIgnoreCase("customer")) {
		cust = custRepo.findById(userID).get();
			if(cust.getAccountNumber()==loginDTO.getUserID()) {		
			message ="User validated successfully";
			}
		}
		if (loginDTO.getUserType().equalsIgnoreCase("admin")) {
			emp = empRepo.findById(userID).get();
			if(emp.getEmpId()==loginDTO.getUserID()) {		
				message ="User validated successfully";
			}
	
		}else {
			message ="Invalid User";
		}
		return message;
	}

}
