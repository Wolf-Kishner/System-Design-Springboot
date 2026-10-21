package com.food.koala.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="Customers")
public class Customers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="CUST_NAME",nullable = false,length = 255)
    private String name;
    @Column(name="CUST_ADDRESS",nullable = false)
    private String address;
}


