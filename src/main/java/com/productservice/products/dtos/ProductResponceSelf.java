package com.productservice.products.dtos;

import com.productservice.products.model.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ProductResponceSelf {
    private Product product;
    private String message;
}
