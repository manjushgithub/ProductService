package com.productservice.products.services;

import com.productservice.products.model.Product;


import java.util.List;

public interface IProductservice {

     Product getsingleproduct(long id) throws Productnotfoundexception;

     List<Product> getallproducts();
}
