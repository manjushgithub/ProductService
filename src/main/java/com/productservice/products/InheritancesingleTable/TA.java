package com.productservice.products.InheritancesingleTable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@DiscriminatorValue("3")
@Entity
public class TA extends User {

    private int  noofsessions;
    private float avgratingTA;
}
