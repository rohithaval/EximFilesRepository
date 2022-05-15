package com.eximfiles.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eximfiles.model.Contacts;
import com.eximfiles.model.Products;
import com.eximfiles.repository.ContactsRepository;
import com.eximfiles.repository.ProductRepository;

//defining the business logic
@Service
public class ProductService {
	@Autowired
	ProductRepository productRepository;

//getting all Products record by using the method findaAll() of CrudRepository
	public List<Products> getAllProducts() {
		List<Products> productList = new ArrayList<Products>();
		productRepository.findAll().forEach(products1 -> productList.add(products1));
		return productList;
	}

//getting a specific record by using the method findById() of CrudRepository
	public Products getProductsById(int id) {
		return productRepository.findById(id).get();
	}

	//getting a specific record by using the method findById() of CrudRepository
	public List<Products> getProductsByType(String Type) {
		List<Products> productList = new ArrayList<Products>();
		productRepository.findAll().forEach(product -> productList.add(product));
		return productList.stream().filter(product->product.getProductType().equals(Type)).toList();
		}	
//saving a specific record by using the method save() of CrudRepository
	public void saveOrUpdate(Products products) {
		productRepository.save(products);
	}

//deleting a specific record by using the method deleteById() of CrudRepository
	public void delete(int productNumber) {
		productRepository.deleteById(productNumber);
	}

//updating a record
	public void update(Products products, int productNumber) {
		productRepository.save(products);
	}
}