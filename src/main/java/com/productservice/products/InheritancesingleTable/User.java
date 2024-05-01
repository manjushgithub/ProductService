package com.productservice.products.InheritancesingleTable;

import jakarta.persistence.*;

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
        name="user_type",
        discriminatorType = DiscriminatorType.INTEGER)
@DiscriminatorValue("0")
@Entity(name="st_user")

public class User {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long id;
    private String email;
    private String name;
    private String password;
}
