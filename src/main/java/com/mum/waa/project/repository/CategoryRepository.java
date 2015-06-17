package com.mum.waa.project.repository;

import org.springframework.data.repository.CrudRepository;

import com.mum.waa.project.domain.Auction;
import com.mum.waa.project.domain.Category;

public interface CategoryRepository  extends CrudRepository<Category, String>{
	
public Category findCategoryById(String id);
	
	public Iterable<Category> findAllCategories();
	
	public void saveCategory(Category category);
	
	public void removeCategory(Category category);

}
