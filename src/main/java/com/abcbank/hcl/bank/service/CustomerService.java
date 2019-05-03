package com.abcbank.hcl.bank.service;

import java.util.List;

import com.abcbank.hcl.bank.dto.CustomerRegistrationRequest;
import com.abcbank.hcl.bank.dto.TransReqDTO;
import com.abcbank.hcl.bank.model.Customer;



public interface CustomerService {
	
	public Customer updateCustomerDetails(CustomerRegistrationRequest cust);	

	public  Customer getcustomerByName(String customerName);
	 public Customer getCustomerByAccountNumber(Long accountNumber);

		public List<TransReqDTO> getTranscationDetails(Long accountNumber);

}
