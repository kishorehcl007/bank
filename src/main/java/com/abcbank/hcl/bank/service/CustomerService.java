package com.abcbank.hcl.bank.service;

import java.util.List;

import org.springframework.stereotype.Service;

<<<<<<< HEAD
import com.abcbank.hcl.bank.dto.TransReqDTO;
=======
import com.abcbank.hcl.bank.dto.CustomerRegistrationRequest;
>>>>>>> f3fb3c990b976949c188c39378d7547fcf6833d5
import com.abcbank.hcl.bank.model.Customer;

import com.abcbank.hcl.bank.repository.CustomerRepository;


@Service
public interface CustomerService {
	
	public Customer updateCustomerDetails(CustomerRegistrationRequest cust);	

	 Customer getcustomerByName(String customerName);
	 Customer getCustomerByAccountNumber(Long accountNumber);

		public List<TransReqDTO> getTranscationDetails(Long accountNumber);

}
