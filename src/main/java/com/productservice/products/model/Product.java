package com.productservice.products.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Product extends BaseModel{

    private String Description;
    private String image;
    private int price;

    @ManyToOne
    private Category category;

}
