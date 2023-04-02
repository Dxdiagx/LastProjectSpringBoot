package com.example.lastprojectspringboot.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name="product")
@Data
public class Product {

    @Id
    @GeneratedValue
    @Column(name = "product_id")
    int productId;
    @Column(name = "product_name")
    String productName;
    @Column(name = "product_description")
    String description;
    @Column(name = "product_price")
    Float price;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    @JsonIgnore
    private Category category;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
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
        if(price != null && price >= 0)
            this.price = price;
    }
}
