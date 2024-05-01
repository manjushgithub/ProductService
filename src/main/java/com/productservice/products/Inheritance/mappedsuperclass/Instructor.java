package com.productservice.products.Inheritance.mappedsuperclass;


import jakarta.persistence.Entity;

@Entity(name="mp.instrctor")
public class Instructor extends User{
    private String specialization;
}
