package com.example.demo.dataAccess.abstracs;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entities.concretes.Product;
import com.example.demo.entities.dtos.ProductWithCategoryDto;

public interface ProductDao extends JpaRepository<Product, Integer> {
	Product getByProductName(String productName);

	Product getByProductNameAndCategory_CategoryId(String productName, int categoryId);

	List<Product> getByProductNameOrCategory_CategoryId(String productName, int categoryId);

	@Query("From Product where category.categoryId=:categoryId")
	List<Product> getByCategoryId(int categoryId);

	List<Product> getByProductNameContains(String productName);

	List<Product> getByProductNameStartsWith(String productName);

	@Query("From Product where productName=:productName and category.categoryId=:categoryId")
	List<Product> getByNameAndCategory(String productName, int categoryId);

	@Query("Select new com.example.demo.entities.dtos.ProductWithCategoryDto" + "(p.id, p.productName, c.categoryName)"
			+ " From Category c Inner Join c.products p ")
	List<ProductWithCategoryDto> getProductWithCategoryDetails();

}
