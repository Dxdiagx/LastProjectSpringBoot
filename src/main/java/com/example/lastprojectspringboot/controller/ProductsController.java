package com.example.lastprojectspringboot.controller;
import com.example.lastprojectspringboot.Repository.ProductsRepository;
import com.example.lastprojectspringboot.entities.Product;
import com.example.lastprojectspringboot.response.ProductResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductsController {
 private ProductsRepository productsRepository;

    public ProductsController(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    @GetMapping
    public List<Product> getAllProducts(){
        return productsRepository.findAll();
    }
    @GetMapping("/{productId}")
    public ProductResponse getOneProduct(@PathVariable Long productId){
        Product product = productsRepository.findByProductId(productId);
        if(product == null) {
            return null;
        }
        return new ProductResponse(product);
    }
    }

