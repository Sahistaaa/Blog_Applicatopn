package com.codewithdurgesh.blog.services;

import java.util.List;

import com.codewithdurgesh.blog.payloads.CategoryDto;

public interface CategoryService {
	
	
	//create
	 CategoryDto createCategory(CategoryDto categoryDto);

	
	//upadte
	 
	 CategoryDto updateCategory(CategoryDto categoryDto,Integer categoryId);
	
	//delete
	 void deleteCategory(Integer categoryId);
	 
	 //get
	 CategoryDto getCategory(Integer categoryId);
	 
	 //get All
	 
	List<CategoryDto> getCategories();
	
}