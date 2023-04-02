package com.example.lastprojectspringboot.controller;
import com.example.lastprojectspringboot.bussines.abstracts.ProductService;
import com.example.lastprojectspringboot.entities.Product;
import com.example.lastprojectspringboot.response.ProductResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductsController {
 private final ProductService productService;   /// Bunun üzerinden güncelleme yapılacak.
  @Autowired
    ProductsController(ProductService productService) {
      this.productService =productService;
    }

    @GetMapping("/getAll")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }
    @GetMapping("/{productId}")
    public ProductResponse getOneProduct(@PathVariable int productId){
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
    @GetMapping("category/{categoryId}")
    public List<Product> findAllCategoryId(@PathVariable int categoryId){
      return productService.findAllByCategoryId(categoryId);
    }
    @PostMapping("/save")
    public ProductResponse saveProduct(@RequestBody Product product) {

        return productService.saveProduct(product);
    }


}


