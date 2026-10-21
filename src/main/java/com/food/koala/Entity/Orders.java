package com.food.koala.Entity;

import com.food.koala.Enum.OrderStatus;
import jakarta.persistence.*;

import java.math.BigDecimal;

@Table(name="Orders")
@Entity
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    @Column(name ="status",nullable = false)
    private OrderStatus status;
    @Column(name="orderValue",nullable = false)
    private BigDecimal orderValue;
    private String partner;
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customers customer;

}
