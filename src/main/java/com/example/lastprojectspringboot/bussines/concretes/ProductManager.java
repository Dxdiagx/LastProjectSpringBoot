package com.example.lastprojectspringboot.bussines.concretes;
import com.example.lastprojectspringboot.Repository.ProductRepository;
import com.example.lastprojectspringboot.bussines.abstracts.ProductService;
import com.example.lastprojectspringboot.entities.Product;
import com.example.lastprojectspringboot.response.ProductResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductManager implements ProductService {
    @Autowired
    private ProductRepository productRepository;


    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public ProductResponse getOneProduct(int productId) {
        Product product = productRepository.findByProductId(productId);
        if(product == null) {
            return null;
        }
        return new ProductResponse(product);
    }

    @Override
    public ProductResponse getOneProductName(String productName) {
        Product product = productRepository.findByProductName(productName);
        if(product == null) {
            return null;
        }
        return new ProductResponse(product);
    }

    @Override
    public ProductResponse getOneProductForPrice(Float productPrice) {
        Product product = productRepository.findByPriceEquals(productPrice);
        if(product == null) {
            return null;
        }
        return new ProductResponse(product);
    }

    @Override
    public ProductResponse saveProduct(Product product) {
        Product savedProduct = productRepository.save(product);
        if (savedProduct == null) {
            return null;
        }
        return new ProductResponse(savedProduct);
    }
    @Override
    public List<Product> findAllByCategoryId(int categoryId){
        return productRepository.findProductByCategory_CategoryId(categoryId);
    }

}
