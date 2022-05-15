package com.eximfiles.repository;

import org.springframework.data.repository.CrudRepository;

import com.eximfiles.model.Products;

public interface ProductRepository extends CrudRepository<Products, Integer> {
}
