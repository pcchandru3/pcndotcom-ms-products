package com.pcndotcom.products.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.pcn.products.vo.Products;

@Service
public class ProductsServiceImp implements ProductsService {
	
	public List<Products> getAllProducts() {
		List<Products> lsProducts = new ArrayList<Products>();
		
		Products p = new Products("001", "Computer", "100.00");
		lsProducts.add(p);
		
		p = new Products("00200", "Laptop", "200.00");
		lsProducts.add(p);
		p = new Products("003", "MacBook", "300.00");
		lsProducts.add(p);
		p = new Products("004", "iPad", "400.00");
		lsProducts.add(p);
		p = new Products("005", "Smartphone", "500.00");
		lsProducts.add(p);
		
		
		return lsProducts;
		
		
	}
	
	
	
	
	public Products getProductDetails() {
		Products product = new Products();
		
		
		return product;
	}
	

}
