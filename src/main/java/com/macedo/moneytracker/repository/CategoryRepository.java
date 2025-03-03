package com.macedo.moneytracker.repository;

import com.macedo.moneytracker.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}