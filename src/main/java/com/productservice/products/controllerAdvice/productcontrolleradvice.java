package com.productservice.products.controllerAdvice;

import com.productservice.products.dtos.ProductResponceSelf;
import com.productservice.products.services.Productnotfoundexception;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class productcontrolleradvice {
    @ExceptionHandler(Productnotfoundexception.class)
    public ResponseEntity<ProductResponceSelf> handleinvalidproduct()
    {
        ProductResponceSelf productResponceSelf=new ProductResponceSelf(null,"product not found");
        return new ResponseEntity<>(productResponceSelf, HttpStatus.NOT_FOUND);


    }
    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<ProductResponceSelf> handlenotfoundproduct()
    {
        ProductResponceSelf productResponceSelf=new ProductResponceSelf(null,"sowething went wrong");
        return new ResponseEntity<>(productResponceSelf,HttpStatus.INTERNAL_SERVER_ERROR);


    }
}
