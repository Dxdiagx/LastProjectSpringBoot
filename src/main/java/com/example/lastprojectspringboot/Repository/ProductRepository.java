package com.example.lastprojectspringboot.Repository;
import com.example.lastprojectspringboot.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    Product findByProductName(String productName);
    Product findByProductId(int productId);
    Product findByPriceEquals(Float price);
    Product save(Product product);
    List<Product> findProductByCategory_CategoryId(int categoryId);
}
