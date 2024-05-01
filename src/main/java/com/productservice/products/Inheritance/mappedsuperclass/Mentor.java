package com.productservice.products.Inheritance.mappedsuperclass;

import jakarta.persistence.Entity;

@Entity(name="mp.mentor")
public class Mentor extends User{
    private String company;
    private float avgrating;

}
