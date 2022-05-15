package com.eximfiles.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eximfiles.model.Products;
import com.eximfiles.service.ProductService;

//mark class as Controller
@RestController
public class ProductOrServiceController {
//autowire the ProductsService class
	@Autowired
	ProductService productService;

//creating a get mapping that retrieves all the /products Or Services detail from the database 
	@GetMapping("/productsOrServices")
	private List<Products> getAllProducts() {
		return productService.getAllProducts();
	}

//creating a get mapping that retrieves the detail of a specific product Or Service
	@GetMapping("/productOrService/{productOrServiceid}")
	private Products getProducts(@PathVariable("productOrServiceid") int productOrServiceid) {
		return productService.getProductsById(productOrServiceid);
	}
	
//creating a get mapping that retrieves the detail of a specific product or service
	@GetMapping("/productsOrServices/{productOrServiceType}")
	private List<Products> getProductsbyType(@PathVariable("productOrServiceType") String productOrServiceType) {
		return productService.getProductsByType(productOrServiceType);
	}

//creating a delete mapping that deletes a specified product or service
	@DeleteMapping("/productOrService/{productOrServiceid}")
	private void deleteContact(@PathVariable("productOrServiceid") int productOrServiceid) {
		productService.delete(productOrServiceid);
	}

//creating post mapping that post the product or service detail in the database
	@PostMapping("/productOrService")
	private int saveContact(@RequestBody Products products) {
		productService.saveOrUpdate(products);
		return products.getProductId();
	}

//creating put mapping that updates the product or service detail 
	@PutMapping("/productOrService")
	private Products update(@RequestBody Products products) {
		productService.saveOrUpdate(products);
		return products;
	}
}
