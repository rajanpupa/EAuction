package com.mum.waa.project.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.mum.waa.project.domain.Category;


@Repository
public class InMemoryCategoryRepositoryImpl implements CategoryRepository{
	
	
	Map<String, Category> categories;
	
	
	public InMemoryCategoryRepositoryImpl()
	{
		
		categories = new HashMap<String,Category>();
		
		Category category1 = new Category();
		category1.setId("1");
		category1.setName("Appliances");
		
		Category category2 = new Category();
		category2.setId("2");
		category2.setName("Computers and Laptops");
		
		Category category3 = new Category();
		category3.setId("3");
		category3.setName("Arts, Craft and Sewing");
		
		Category category4 = new Category();
		category4.setId("4");
		category4.setName("Mobile and Accessories");
		
		
		
		categories.put(category1.getId(), category1);
		categories.put(category2.getId(), category2);
		categories.put(category3.getId(), category3);
		categories.put(category4.getId(), category4);
		
		
	}
	

	@Override
	public <S extends Category> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Category> Iterable<S> save(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category findOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Category> findAll() {
	
		return findAllCategories();
	}

	@Override
	public Iterable<Category> findAll(Iterable<String> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Category entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends Category> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Category findCategoryById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Category> findAllCategories() {
		// TODO Auto-generated method stub
        List<Category> categoryList = new ArrayList<Category>();
		
		for(String key: categories.keySet()){
			categoryList.add(categories.get(key));
		}
		
		return categoryList;
	}

	@Override
	public void saveCategory(Category category) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeCategory(Category category) {
		// TODO Auto-generated method stub
		
	}

}
