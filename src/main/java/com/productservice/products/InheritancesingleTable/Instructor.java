package com.productservice.products.InheritancesingleTable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@DiscriminatorValue("1")
@Entity
public class Instructor extends User {
    private String specialization;
}
