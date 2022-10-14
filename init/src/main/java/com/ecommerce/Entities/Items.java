package com.ecommerce.Entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@AllArgsConstructor
@Table(name = "items")
@Data
public class Items {

    private String itemName;
    private int itemPrice;
    private float rating;
    private List<String> reviews;
    private Long itemSold;
    
}
