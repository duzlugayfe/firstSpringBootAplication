package com.example.demo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.business.abstracs.CategoryService;
import com.example.demo.core.utilities.results.DataResult;
import com.example.demo.core.utilities.results.SuccessDataResult;
import com.example.demo.dataAccess.abstracs.CategoryDao;
import com.example.demo.entities.concretes.Category;

@Service
public class CategoryManager implements CategoryService {

	private CategoryDao categoryDao;

	@Autowired
	public CategoryManager(CategoryDao categoryDao) {
		super();
		this.categoryDao = categoryDao;
	}

	@Override
	public DataResult<List<Category>> getAll() {
		return new SuccessDataResult<List<Category>>(this.categoryDao.findAll(), "Data Listelendi");
	}

}
