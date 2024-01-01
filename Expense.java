package com.Expence.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="tbl_expenses")
public class Expense {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="description")
	private String expensename;
	
	@Column(name= "amount")
	private BigDecimal amount;
	
	@Column(name= "created_at")
	private Long createdAt;
	
	@Column(name= "note")
	private String Note;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getexpensename() {
		return expensename;
	}

	public void setexpensename(String expensename) {
		this.expensename = expensename;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Long getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Long createdAt) {
		this.createdAt = createdAt;
	}

	public String getNote() {
		return Note;
	}

	public void setNote(String note) {
		Note = note;
	}

	@Override
	public String toString() {
		return "Expense [id=" + id + ", expensename=" + expensename + ", amount=" + amount + ", createdAt=" + createdAt
				+ ", Note=" + Note + "]";
	}
	
	
}
