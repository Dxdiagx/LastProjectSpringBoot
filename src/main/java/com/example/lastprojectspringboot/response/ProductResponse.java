package com.example.lastprojectspringboot.response;
import com.example.lastprojectspringboot.entities.Product;
import lombok.Data;

@Data
public class ProductResponse {

        int id;
        String productName;
        String description;
         Float price;


        public ProductResponse(Product entity) {
            this.id = entity.getProductId();
            this.productName = entity.getProductName();
            this.description=entity.getDescription();
            this.price=entity.getPrice();
        }
    }

