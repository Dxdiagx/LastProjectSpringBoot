package com.example.lastprojectspringboot.controller;
import com.example.lastprojectspringboot.Repository.ProductsRepository;
import com.example.lastprojectspringboot.bussines.abstracts.ProductService;
import com.example.lastprojectspringboot.entities.Product;
import com.example.lastprojectspringboot.response.ProductResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductsController {
 private ProductService productService;   /// Bunun üzerinden güncelleme yapılacak.
  ProductsController(ProductService productService) {
      this.productService =productService;
    }

    @GetMapping("/getAll")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }
    @GetMapping("/{productId}")
    public ProductResponse getOneProduct(@PathVariable Long productId){
   return productService.getOneProduct(productId);
    }
    @GetMapping("name/{productName}")
    public ProductResponse getOneProductName(@PathVariable String productName){
      return productService.getOneProductName(productName);
    }
    @GetMapping("price/{productPrice}")
    public ProductResponse getOneProductForPrice(@PathVariable Float productPrice){
       return productService.getOneProductForPrice(productPrice);
    }
    @PostMapping("/save")
    public ProductResponse postProduct(@RequestBody Product product) {

        return productService.postProduct(product);
    }
}


