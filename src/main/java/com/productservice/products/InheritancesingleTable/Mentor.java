package com.productservice.products.InheritancesingleTable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@DiscriminatorValue("2")
@Entity
public class Mentor extends User {
    private String company;
    private float avgrating;

}
