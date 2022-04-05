package com.example.demo.business.abstracs;

import java.util.List;

import com.example.demo.core.utilities.results.DataResult;
import com.example.demo.entities.concretes.Category;

public interface CategoryService {

	DataResult<List<Category>> getAll();

}
