package com.pcndotcom.products.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.pcn.products.vo.Products;


public interface ProductsService {
	
	public List<Products> getAllProducts();
	public Products getProductDetails();

}
