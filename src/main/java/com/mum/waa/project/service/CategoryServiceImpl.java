package com.mum.waa.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mum.waa.project.domain.Category;
import com.mum.waa.project.repository.CategoryRepository;


@Service
public class CategoryServiceImpl implements CategoryService {
	
	
	@Autowired
	CategoryRepository categoryRepository;

	@Override
	public Iterable<Category> getAllCategory() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
	}

	@Override
	public Category getCategoryById(String categoryId) {
		// TODO Auto-generated method stub
		return categoryRepository.findCategoryById(categoryId);
	}

	@Override
	public void saveCategory(Category category) {
		categoryRepository.save(category);
		
	}

	@Override
	public void deleteCategory(Category category) {
	    categoryRepository.delete(category);
		
	}
	


}
