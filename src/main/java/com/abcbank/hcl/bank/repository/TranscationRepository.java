package com.abcbank.hcl.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abcbank.hcl.bank.model.Transaction;

@Repository
public interface TranscationRepository extends JpaRepository<Transaction,Long>{

}
