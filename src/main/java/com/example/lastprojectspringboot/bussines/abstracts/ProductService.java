package com.example.lastprojectspringboot.bussines.abstracts;
import com.example.lastprojectspringboot.entities.Product;
import com.example.lastprojectspringboot.response.ProductResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public interface ProductService {

    List<Product> getAllProducts();
     ProductResponse getOneProduct(@PathVariable int productId);
     ProductResponse getOneProductName(@PathVariable String productName);
     ProductResponse getOneProductForPrice(@PathVariable Float productPrice);
     ProductResponse saveProduct(@RequestBody Product product);
    List<Product> findAllByCategoryId(int categoryId);
}
