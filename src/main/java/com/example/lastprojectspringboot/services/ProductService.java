package com.example.lastprojectspringboot.services;

import com.example.lastprojectspringboot.Repository.ProductsRepository;
import com.example.lastprojectspringboot.entities.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    ProductsRepository productsRepository;
    public ProductService(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }
    public List<Product> getAllUsers() {
        return productsRepository.findAll();
    }


}
