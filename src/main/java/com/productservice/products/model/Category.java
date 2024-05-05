package com.productservice.products.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Category extends BaseModel{

    private String Description;

    @OneToMany(mappedBy ="category")
    private List<Product> products;
//,fetch = FetchType.EAGER
}
