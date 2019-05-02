package com.abcbank.hcl.bank.model;

import java.time.LocalDate;

import javax.persistence.Entity;

@Entity
public class Transaction {

		private Long transcationId;
		private LocalDate transcationDate;
		private double transcationAmount;
		private String transcationDesc;
		
		
		
}
