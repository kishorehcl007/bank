package com.abcbank.hcl.bank.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transaction {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)		
		private Long transcationId;
		private LocalDate transcationDate;
		private double transcationAmount;
		private String transcationDesc;
		public Long getTranscationId() {
			return transcationId;
		}
		public void setTranscationId(Long transcationId) {
			this.transcationId = transcationId;
		}
		public LocalDate getTranscationDate() {
			return transcationDate;
		}
		public void setTranscationDate(LocalDate transcationDate) {
			this.transcationDate = transcationDate;
		}
		public double getTranscationAmount() {
			return transcationAmount;
		}
		public void setTranscationAmount(double transcationAmount) {
			this.transcationAmount = transcationAmount;
		}
		public String getTranscationDesc() {
			return transcationDesc;
		}
		public void setTranscationDesc(String transcationDesc) {
			this.transcationDesc = transcationDesc;
		}
		
		
		
}
