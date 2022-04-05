package com.example.demo.dataAccess.abstracs;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.concretes.Category;

public interface CategoryDao extends JpaRepository<Category, Integer> {

}
