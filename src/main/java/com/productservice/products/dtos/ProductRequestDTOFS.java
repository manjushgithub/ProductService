package com.productservice.products.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductRequestDTOFS {
    private long id;
    private String title;
    private float price;
    private String Description;
    private String Category;
    private String image;
}
