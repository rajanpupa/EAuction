package com.mum.waa.project.bkprepository.pkg;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mum.waa.project.domain.Category;
import com.mum.waa.project.repository.CategoryRepository;

//@Repository
public interface JpaCatagoryRepository extends CategoryRepository{

	@Query("select a from Category a where id= :id")
	public Category findOne(String id);
	
	@Query("select a from Category a")
	public Iterable<Category> findAll();
	
	public Category save(Category category);
	
	public void removeCategory(Category category);
}
