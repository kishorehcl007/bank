package com.abcbank.hcl.bank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abcbank.hcl.bank.model.Transaction;

@Repository
public interface TranscationRepository extends JpaRepository<Transaction,Long>{


	List<Transaction> findByAccountNumber(Long accountNumber);
	
	
}
	
