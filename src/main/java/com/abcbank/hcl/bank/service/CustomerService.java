package com.abcbank.hcl.bank.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.abcbank.hcl.bank.dto.CustomerRegistrationRequest;
import com.abcbank.hcl.bank.model.Customer;

import com.abcbank.hcl.bank.repository.CustomerRepository;


public interface CustomerService {
	public Customer updateCustomerDetails(CustomerRegistrationRequest cust);	

	 Customer getcustomerByName(String customerName);
	 Customer getCustomerByAccountNumber(Long accountNumber);

		public List<TransReqDTO> getTranscationDetails(Long accountNumber);

}
