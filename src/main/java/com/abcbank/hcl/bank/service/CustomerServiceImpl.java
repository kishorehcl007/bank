package com.abcbank.hcl.bank.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abcbank.hcl.bank.dto.TransReqDTO;
import com.abcbank.hcl.bank.model.Customer;
import com.abcbank.hcl.bank.model.Transaction;
import com.abcbank.hcl.bank.repository.CustomerRepository;
import com.abcbank.hcl.bank.repository.TranscationRepository;

public class CustomerServiceImpl implements CustomerService {
 @Autowired
 CustomerRepository customerRepositroy;
 
 
	@Override
	public Customer updateCustomerDetails(CustomerRegistrationRequest customer) {
	
		Customer currentCust =null;
	    Long accNo=	customer.getAccountNumber();
		currentCust = customerRepositroy.findById(accNo).get();
		currentCust.setCoustmerEmail(customer.getCoustmerEmail());
		currentCust.setCoustmerPhNum(customer.getCoustmerPhNum());
		customerRepositroy.save(currentCust);
		return currentCust;	
	}

	
	
	

	@Autowired
	TranscationRepository transactionRepository;

	@Override
	public List<TransReqDTO> getTranscationDetails(Long accountNumber) {
		// TODO Auto-generated method stub
		
		List<TransReqDTO> list=new ArrayList<>();
		List<Transaction> TransListResult=transactionRepository.findByAccountNumber(accountNumber);
		
		for(Transaction trans:TransListResult)
		{
			TransReqDTO transReqDto=new TransReqDTO();
			transReqDto.setAccountNumber(trans.getAccountNumber());
			transReqDto.setTransactionType(trans.getTransactionType());
			transReqDto.setTranscationAmount(trans.getTranscationAmount());
			transReqDto.setTranscationDate(trans.getTranscationDate());
			transReqDto.setTranscationDesc(trans.getTranscationDesc());
			transReqDto.setTranscationId(trans.getTranscationId());			
			list.add(transReqDto);
		}
		return list;
	}


	


	
	  public Customer getcustomerByName(String customerName) {
		Customer responseCustomer = customerRepository.findByCustomerName(customerName);
		return responseCustomer;
	}

	  public Customer getCustomerByAccountNumber(Long accountNumber) {
		Customer responeCustomer = customerRepository.findByAccountNumber(accountNumber);
		return responeCustomer;
	}
	
}

