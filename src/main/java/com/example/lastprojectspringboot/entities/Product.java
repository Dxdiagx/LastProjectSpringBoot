package com.example.lastprojectspringboot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="product")
public class Product {
    @Id
    Long productId;
    String productName;

    public Long getProductId() {
        return productId;
    }

    public void setProduct_Id(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
