package com.abcbank.hcl.bank.repository;
<<<<<<< HEAD

import java.util.List;

=======
>>>>>>> f3fb3c990b976949c188c39378d7547fcf6833d5
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abcbank.hcl.bank.model.Transaction;

@Repository
public interface TranscationRepository extends JpaRepository<Transaction,Long>{


<<<<<<< HEAD
	List<Transaction> findByAccountNumber(Long accountNumber);
}
=======
	
	
}
>>>>>>> f3fb3c990b976949c188c39378d7547fcf6833d5
