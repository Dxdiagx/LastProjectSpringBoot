package com.example.lastprojectspringboot.Repository;

import com.example.lastprojectspringboot.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Product, Long> {

    Product findByProductName(String productName);
    Product findByProductId(Long productId);
    Product findByPriceEquals(Float price);
    Product save(Product product);
}
