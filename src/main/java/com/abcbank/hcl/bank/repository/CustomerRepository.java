package com.abcbank.hcl.bank.repository;
import org.springframework.stereotype.Repository;
import com.abcbank.hcl.bank.model.*;
@Repository
public class CustomerRepository extends JpaRepository<Customer,Long> {

}
