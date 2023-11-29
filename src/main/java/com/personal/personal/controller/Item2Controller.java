package com.personal.personal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.personal.personal.entity.Item2;
import com.personal.personal.service.Item2Service;

@RestController
public class Item2Controller {

    @Autowired
    Item2Service itemService;

    @GetMapping("/lista")
    public List<Item2>findAll(){
        return itemService.finAll();
    }

    @GetMapping("/lista/{id}")
    public Item2 findById(@PathVariable Long id){
        return itemService.findById(id);
    }
}
