package com.ecommerce.init.Entities;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "User")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int userId;
    private String firstName;
    private String lastName;
    private String fullName;
    private String phoneNumber;
    private String address;
    private String emailId;

}
