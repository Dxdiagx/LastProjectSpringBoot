package com.example.lastprojectspringboot.entities;

import jakarta.persistence.*;


@Entity
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue
    @Column(name = "product_id")
    Long productId;
    @Column(name = "product_name")
    String productName;
    @Column(name = "product_description")
    String description;
    @Column(name = "product_price")
    Float price;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        if(price>0)
        this.price = price;
    }
}
