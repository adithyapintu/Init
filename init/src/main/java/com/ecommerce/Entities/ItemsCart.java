package com.ecommerce.Entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "itemCart")
public class ItemsCart {
    
    private int userId;
    private List<Items> itemList;
    private Long totalPrice;
    private int itemsCount;

    @OneToOne
    @JoinColumn(name = "id", referencedColumnName = "id")
    private User user;
}
