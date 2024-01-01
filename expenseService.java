package com.Expence.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Expence.model.Expense;
import com.Expence.repo.ExpenseRepo;

@Service
public class expenseService implements serviceInterface{

	@Autowired
	ExpenseRepo expenserepo;
	
	@Override
	public List<Expense> findAll() {
		return expenserepo.findAll();
	}

	@Override
	public void saveExpense(Expense expense) {
		expense.setCreatedAt(System.currentTimeMillis());
		expenserepo.save(expense);
		
	}

	@Override
	public Expense findById(Long id) {
		if(expenserepo.findById(id).isPresent()) {
			return expenserepo.findById(id).get();
	}
	return null;
	}

	@Override
	public void Delete(Long id) {
		Expense expense = findById(id);
		expenserepo.delete(expense);
		
	}

}
