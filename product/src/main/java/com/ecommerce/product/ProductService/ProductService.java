package com.ecommerce.product.ProductService;

import org.springframework.stereotype.Service;

import com.ecommerce.product.Model.Product;
import com.ecommerce.product.ProductDto.ProductDto;
import com.ecommerce.product.ProductRepository.ProductRepository;


@Service
public class ProductService {
    

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product createProduct(String name,String description){
        Product product = new Product();
        product.setName(name);
        product.setDescription(description);
        productRepository.save(product);
        return product; 
    }
    public Product getProductByID(Long id){
        return productRepository.findById(id).get();

    }
}
