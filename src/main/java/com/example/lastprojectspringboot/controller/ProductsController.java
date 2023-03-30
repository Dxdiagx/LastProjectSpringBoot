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

    @GetMapping("/getAll")
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
    @GetMapping("name/{productName}")
    public ProductResponse getOneProductName(@PathVariable String productName){
        Product product = productsRepository.findByProductName(productName);
        if(product == null) {
            return null;
        }
        return new ProductResponse(product);
    }
    @GetMapping("price/{productPrice}")
    public ProductResponse getOneProductForPrice(@PathVariable Float productPrice){
        Product product = productsRepository.findByPriceEquals(productPrice);
        if(product == null) {
            return null;
        }
        return new ProductResponse(product);
    }
    @PostMapping("/save")
    public ProductResponse postProduct(@RequestBody Product product) {
        Product savedProduct = productsRepository.save(product);
        if (savedProduct == null) {
            return null;
        }
        return new ProductResponse(savedProduct);
    }
}


