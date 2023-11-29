package com.personal.personal.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.personal.personal.entity.Item2;

@Service
public interface Item2Service {
    public List<Item2>finAll();

    public Item2 findById(Long id);
}
