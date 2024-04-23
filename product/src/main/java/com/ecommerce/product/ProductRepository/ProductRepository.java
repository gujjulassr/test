package com.ecommerce.product.ProductRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.product.Model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
   
}
