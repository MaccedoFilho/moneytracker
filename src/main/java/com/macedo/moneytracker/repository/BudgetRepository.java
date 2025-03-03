package com.macedo.moneytracker.repository;

import com.macedo.moneytracker.model.Budget;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetRepository extends JpaRepository<Budget, Long> {
}