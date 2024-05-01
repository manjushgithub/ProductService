package com.productservice.products.Inheritance.mappedsuperclass;

import jakarta.persistence.Entity;

@Entity(name="mp.ta")
public class TA extends User{

    private int  noofsessions;
    private float avgratingTA;
}
