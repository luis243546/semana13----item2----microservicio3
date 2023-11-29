package com.personal.personal.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.personal.personal.entity.Item2;
import com.personal.personal.entity.Personal;

@Service
public class Item2ServiceImpl implements Item2Service{

     @Autowired
    private RestTemplate clienteRest;


    @Override
    public List<Item2> finAll() {
        List<Personal> personales = Arrays
                .asList(clienteRest.getForObject("http://localhost:8005/lista", Personal[].class));
        return personales.stream().map(p -> new Item2(p)).collect(Collectors.toList());
    }

    @Override
    public Item2 findById(Long id) {
        Personal personal = clienteRest.getForObject("http://localhost:8005/lista/{id}", Personal.class, id);

        if (personal != null) {
            return new Item2(personal);
        } else {
            return null;
        }
    }
    
}
