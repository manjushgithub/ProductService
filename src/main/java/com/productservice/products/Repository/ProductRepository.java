package com.productservice.products.Repository;

import com.productservice.products.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository  extends JpaRepository<Product, Long> {

    //Product findByDescription(String Description);
    Product findByname(String name);
    Product findByPrice(Float price);
}
