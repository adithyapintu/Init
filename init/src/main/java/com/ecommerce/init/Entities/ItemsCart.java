package com.ecommerce.init.Entities;

import java.util.List;

import javax.persistence.*;

import lombok.Data;
@Data
@Entity
@Table(name = "itemCart")
public class ItemsCart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cartId;

    @OneToMany(targetEntity = Items.class,cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Items> itemList;
    private Long totalPrice;
    private int itemsCount;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = User.class)
    private User user;
}
