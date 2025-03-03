package com.macedo.moneytracker.service;

import com.macedo.moneytracker.exception.ResourceNotFoundException;
import com.macedo.moneytracker.model.Budget;
import com.macedo.moneytracker.repository.BudgetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BudgetService {

    private final BudgetRepository budgetRepository;

    public BudgetService(BudgetRepository budgetRepository) {
        this.budgetRepository = budgetRepository;
    }

    public Budget createBudget(Budget budget) {
        return budgetRepository.save(budget);
    }

    public List<Budget> getAllBudgets() {
        return budgetRepository.findAll();
    }

    public Budget getBudgetById(Long id) {
        return budgetRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Orçamento não encontrado com ID: " + id));
    }

    public Budget updateBudget(Long id, Budget updatedBudget) {
        Budget existingBudget = getBudgetById(id);
        existingBudget.setName(updatedBudget.getName());
        existingBudget.setAmount(updatedBudget.getAmount());
        existingBudget.setStartDate(updatedBudget.getStartDate());
        existingBudget.setEndDate(updatedBudget.getEndDate());
        return budgetRepository.save(existingBudget);
    }

    public void deleteBudget(Long id) {
        Budget budget = getBudgetById(id);
        budgetRepository.delete(budget);
    }
}
