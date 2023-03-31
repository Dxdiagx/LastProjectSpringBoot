package com.example.lastprojectspringboot.response;
import com.example.lastprojectspringboot.entities.Product;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Data
public class ProductResponse {

        Long id;
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

