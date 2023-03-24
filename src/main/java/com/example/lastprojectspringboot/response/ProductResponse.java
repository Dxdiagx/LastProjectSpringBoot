package com.example.lastprojectspringboot.response;
import com.example.lastprojectspringboot.entities.Product;
import lombok.Data;

@Data
public class ProductResponse {

        Long id;
        String productName;

        public ProductResponse(Product entity) {
            this.id = entity.getProductId();
            this.productName = entity.getProductName();
        }
    }

