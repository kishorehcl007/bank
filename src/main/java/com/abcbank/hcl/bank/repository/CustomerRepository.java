package com.abcbank.hcl.bank.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abcbank.hcl.bank.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {


	Customer findByCustomerName(Long cusAccNam);

	Customer findByCustomerName(String customerName);

	Customer findByCustomerAccount(Long accountNumber);

	Customer findByAccountNumber(Long accountNumber);

}
