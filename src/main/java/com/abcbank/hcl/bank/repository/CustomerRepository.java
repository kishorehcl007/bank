package com.abcbank.hcl.bank.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abcbank.hcl.bank.dto.CustomerRegistrationRequest;
import com.abcbank.hcl.bank.model.Customer;


@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

	public void registratingCoustmer(CustomerRegistrationRequest customerRegistrationRequest);

}
