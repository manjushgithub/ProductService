package com.productservice.products.Controller;

import com.productservice.products.Repository.ProductRepository;
import com.productservice.products.dtos.ProductRequestDTOFS;
import com.productservice.products.dtos.ProductResponceSelf;
import com.productservice.products.model.Product;
import com.productservice.products.services.IProductservice;
import com.productservice.products.services.Productnotfoundexception;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ProductController {
   @Autowired
   IProductservice Productservice;
  // Fakestoreapi productService;
   @Autowired
   ProductRepository productRepository;
    //1::get all products
    @GetMapping("/products")
    List<Product> getallproducts()
    {


        return Productservice.getallproducts().stream().filter(
                Product->Product.getName().startsWith("A")).
                collect(Collectors.toList());

    }
    @GetMapping("/product/searchname")
    public Product getproductByName(@RequestParam("name") String name )
    {
        return productRepository.findByname(name);
    }

   // get single product
    @GetMapping("/products/{id}")
    ResponseEntity<ProductResponceSelf> getsingleproduct(@PathVariable("id") long id)
    {
        Product product;
        try {
         product=Productservice.getsingleproduct(id);
        }
        catch(Productnotfoundexception e)//here we are all carching exceptiion in this object only be proper exception handling
        {
            return new ResponseEntity<>(new ProductResponceSelf(null,"product doesn't exist" ), HttpStatus.NOT_FOUND);
        }
        catch(ArithmeticException e)//here we are all carching exceptiion in this object only be proper exception handling
        {
            return new ResponseEntity<>(new ProductResponceSelf(null,"someything went wrong" ),HttpStatus.INTERNAL_SERVER_ERROR);

        }
        return new ResponseEntity<>(new ProductResponceSelf(product,"Success"), HttpStatus.OK);
    }

    //main
//    @GetMapping("/product/exception/{id}")
//    ResponseEntity<ProductResponceSelf> getsingleproduct(@PathVariable("id") long id) throws Productnotfoundexception {
//
//        Product product=Productservice.getsingleproduct(id);
//
//        return new ResponseEntity<>(new ProductResponceSelf(product,"Success"), HttpStatus.OK);
//    }

//    @ExceptionHandler(Productnotfoundexception.class)
//    public ResponseEntity<ProductResponceSelf> handleinvalidproduct()
//    {
//        ProductResponceSelf productResponceSelf=new ProductResponceSelf(null,"product not found");
//        return new ResponseEntity<>(productResponceSelf,HttpStatus.NOT_FOUND);
//
//
//    }
//    @ExceptionHandler(ArithmeticException.class)
//    public ResponseEntity<ProductResponceSelf> handlenotfoundproduct()
//    {
//        ProductResponceSelf productResponceSelf=new ProductResponceSelf(null,"sowething went wrong");
//        return new ResponseEntity<>(productResponceSelf,HttpStatus.INTERNAL_SERVER_ERROR);
//
//
//    }



//    @GetMapping("/categories")
//    List<product> getallcategories(@PathVariable("id") long id)
//    {
//
//return null;
//    }

    //addproduct
    @PostMapping("/products")
    public Product addproduct(@RequestBody ProductRequestDTOFS requestDTO)
    {
        return new Product();
    }

    //update a product
    @PatchMapping("/products/{id}")
    public Product updateproduct(@PathVariable("id") long id,@RequestBody ProductRequestDTOFS requestDto)
    {

        return new Product();
    }







}
