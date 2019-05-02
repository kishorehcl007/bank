package com.abcbank.hcl.bank.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.abcbank.hcl.bank.dto.TransReqDTO;
import com.abcbank.hcl.bank.model.Customer;

@Service
public interface CustomerService {

	
	 Customer getcustomerByName(String customerName);

	 Customer getCustomerByAccountNumber(Long accountNumber);

		public List<TransReqDTO> getTranscationDetails(Long accountNumber);

}
