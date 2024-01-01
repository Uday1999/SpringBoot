package com.Expence.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Expence.model.Expense;

@Repository
public interface ExpenseRepo extends JpaRepository<Expense, Long> {

}
