package com.ecommerce.init.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ItemController {
    
    @GetMapping(value="/getItem")
    public String getItem(@RequestParam int id){
        return "";
    }

    @GetMapping(value = "/test")
    public String testing(){
        return "Working Fine";
    }
    
    
}
