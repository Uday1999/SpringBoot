package com.Expence.service;

import java.util.List;

import com.Expence.model.Expense;

public interface serviceInterface {
		
	List<Expense> findAll();
	
	public void saveExpense(Expense expense);
	
	Expense findById(Long id);
	
	public void Delete(Long id);
}
