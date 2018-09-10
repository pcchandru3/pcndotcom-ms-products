package com.pcndotcom.products.controller;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pcn.products.vo.Products;
import com.pcndotcom.products.repositories.ProductsRepository;
import com.pcndotcom.products.service.ProductsService;

@RestController
public class ProductsController {
	
	@Autowired
	private ProductsService productsService;
	
	@RequestMapping("/products")
	public List<Products> getAllProducts() {
		return productsService.getAllProducts();
	}
	
	
	@Autowired
	private ProductsRepository productsRepository;
	
	@RequestMapping("/products/{productId}")
	public Optional<Products> getProductDetails(@PathVariable("productId") String productId) {
		return productsRepository.findById(productId);
	}
	
	@RequestMapping("/products/productbyid/{productId}")
	public Products getProductDetailsById(@PathVariable("productId") String productId) {
		return productsRepository.findByproductId(productId);
	}
	
	
	
	@RequestMapping("/products/getall")
	public List<Products> getAllProductDetails() {
		return productsRepository.findAll();
	}
	
	
	@RequestMapping(value = "/products", method = RequestMethod.POST)
	public Products createProduct(@RequestBody Products product) {
		productsRepository.save(product);
		return product;
		
	}
	
	@RequestMapping(value="/products/{id}", method=RequestMethod.PUT)
	public void updateProductsById(@PathVariable("id") String id, @RequestBody Products product) {
		product.setProductId(id);
		productsRepository.save(product);
		
	}
	
	

}
