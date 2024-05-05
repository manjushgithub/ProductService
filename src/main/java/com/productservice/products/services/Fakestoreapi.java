package com.productservice.products.services;

import com.productservice.products.dtos.ProductResponceDtoFS;
import com.productservice.products.model.Category;
import com.productservice.products.model.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class Fakestoreapi implements IProductservice {
    @Autowired
    RestTemplate restTemplate;

    @Override
    public Product getsingleproduct(long id) throws Productnotfoundexception {
        //RestTemplate restTemplate = new RestTemplate();
        if(id >20 && id<=40)
        {
            throw new Productnotfoundexception();
        }
        if(id >40)
        {
            throw new ArithmeticException();
        }
        ProductResponceDtoFS response;

            response = restTemplate.getForObject(
                    "https://fakestoreapi.com/products/" + id,
                    ProductResponceDtoFS.class);

            return getProductFromResponseDTO(response);
        }
        @Override
        public List<Product> getallproducts() {

            ProductResponceDtoFS[] products = restTemplate.getForObject("https://fakestoreapi.com/products", ProductResponceDtoFS[].class);
            List<Product> output = new ArrayList<>();
            for (ProductResponceDtoFS productResponceDtoFS : products) {
                output.add(getProductFromResponseDTO(productResponceDtoFS));
            }
            return output;
        }

        public Product getProductFromResponseDTO(ProductResponceDtoFS response){
            Product product = new Product();
            product.setId(response.getId());
            product.setName(response.getTitle());
            product.setDescr(response.getDescription());
            product.setPrice((int) response.getPrice());
            product.setCategory(new Category());
            product.getCategory().setName(response.getCategory());
            product.setImage(response.getImage());

            return product;
        }
    }





