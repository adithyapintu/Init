package com.ecommerce.init.Controller;

import com.ecommerce.init.DTO.ItemDTO;
import com.ecommerce.init.DTO.SingleItemDTO;
import com.ecommerce.init.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@RestController
public class ItemController {

    @Autowired
    ItemService service;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(value="/getItem")
    public SingleItemDTO getItem(@RequestParam int id){
        return service.getItem(id);
    }

    @GetMapping(value = "/test")
    public String testing(){
        return "Working Fine";
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(value = "/getAllItems")
    public List<ItemDTO> getAllItems(){
        return service.getAllItems();
    }
    
}
