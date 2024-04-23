package com.ecommerce.product.ProductController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.product.Model.Product;
import com.ecommerce.product.ProductDto.ProductDto;
import com.ecommerce.product.ProductService.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("")
    public  Product createProduct(@RequestBody ProductDto productDto){
        return productService.createProduct(productDto.getName(), productDto.getDescription());
    }

    @GetMapping("/{id}")
    public @ResponseBody  Product getProductByID( @PathVariable("id") Long id){
        return productService.getProductByID(id);

    }
    
}
