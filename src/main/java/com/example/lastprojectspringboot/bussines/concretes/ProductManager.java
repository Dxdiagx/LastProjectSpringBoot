package com.example.lastprojectspringboot.bussines.concretes;
import com.example.lastprojectspringboot.Repository.ProductsRepository;
import com.example.lastprojectspringboot.bussines.abstracts.ProductService;
import com.example.lastprojectspringboot.entities.Product;
import com.example.lastprojectspringboot.response.ProductResponse;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductManager implements ProductService {
private  ProductsRepository productsRepository;

    public ProductManager(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    @Override
    public List<Product> getAllProducts() {
        return productsRepository.findAll();
    }

    @Override
    public ProductResponse getOneProduct(Long productId) {
        Product product = productsRepository.findByProductId(productId);
        if(product == null) {
            return null;
        }
        return new ProductResponse(product);
    }

    @Override
    public ProductResponse getOneProductName(String productName) {
        Product product = productsRepository.findByProductName(productName);
        if(product == null) {
            return null;
        }
        return new ProductResponse(product);
    }

    @Override
    public ProductResponse getOneProductForPrice(Float productPrice) {
        Product product = productsRepository.findByPriceEquals(productPrice);
        if(product == null) {
            return null;
        }
        return new ProductResponse(product);
    }

    @Override
    public ProductResponse saveProduct(Product product) {
        Product savedProduct = productsRepository.save(product);
        if (savedProduct == null) {
            return null;
        }
        return new ProductResponse(savedProduct);
    }

}
