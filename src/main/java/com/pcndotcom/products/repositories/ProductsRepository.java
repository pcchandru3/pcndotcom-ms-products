package com.pcndotcom.products.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.pcn.products.vo.Products;


public interface ProductsRepository extends MongoRepository<Products, String>{

	
	Products findByproductId(String productId);

}
