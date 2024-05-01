package com.productservice.products.Controller;

import com.productservice.products.Repository.CategoryRespository;
import com.productservice.products.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {


    @Autowired
    CategoryRespository categoryRespository;
    @GetMapping("/category")
    public Category getCategory()
    {

        return null;
    }

}
