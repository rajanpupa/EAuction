package com.mum.waa.project.service;

import com.mum.waa.project.domain.Auction;
import com.mum.waa.project.domain.Category;

public interface CategoryService {
	
	public Iterable<Category> getAllCategory();
	
	public Category getCategoryById(Integer categoryId);
	
	public void saveCategory(Category category);
	
	public void deleteCategory(Category category);
	


}
