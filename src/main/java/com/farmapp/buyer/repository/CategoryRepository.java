package com.farmapp.buyer.repository;

import com.farmapp.buyer.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
