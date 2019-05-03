package com.abcbank.hcl.bank.service;

import java.util.List;

import com.abcbank.hcl.bank.dto.TransReqDTO;
import com.abcbank.hcl.bank.dto.UpdateRequest;
import com.abcbank.hcl.bank.model.Customer;



public interface CustomerService {

	public  Customer getcustomerByName(String customerName);
	 public Customer getCustomerByAccountNumber(Long accountNumber);

		public List<TransReqDTO> getTranscationDetails(Long accountNumber);

		String updateCustomerDetails(UpdateRequest updateRequet);

}
