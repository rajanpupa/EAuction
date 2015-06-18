package com.mum.waa.project.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mum.waa.project.domain.Category;

@Repository
public interface CategoryRepository  extends CrudRepository<Category, String>{
	
//	public Category findOne(String id);
//	
//	public Iterable<Category> findAll();
//	
//	public Category save(Category category);
//	
//	public void removeCategory(Category category);

}
