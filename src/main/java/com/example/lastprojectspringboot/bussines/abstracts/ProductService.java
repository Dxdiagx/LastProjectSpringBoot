package com.example.lastprojectspringboot.bussines.abstracts;
import com.example.lastprojectspringboot.entities.Product;
import com.example.lastprojectspringboot.response.ProductResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public interface ProductService {

    public List<Product> getAllProducts();
    public ProductResponse getOneProduct(@PathVariable Long productId);
    public ProductResponse getOneProductName(@PathVariable String productName);
    public ProductResponse getOneProductForPrice(@PathVariable Float productPrice);
    public ProductResponse saveProduct(@RequestBody Product product);

}
