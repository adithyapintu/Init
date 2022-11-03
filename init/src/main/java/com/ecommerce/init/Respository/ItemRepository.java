package com.ecommerce.init.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.init.Entities.Items;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Items, Integer>{
    List<Items> findAll();

    Items findById(int id);
}
