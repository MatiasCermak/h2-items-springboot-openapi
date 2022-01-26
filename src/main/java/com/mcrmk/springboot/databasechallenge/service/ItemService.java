package com.mcrmk.springboot.databasechallenge.service;

import com.mcrmk.springboot.databasechallenge.model.Item;

import java.util.List;

public interface ItemService {
    Item create(Item item);
    Item retrieve(Integer id);
    List<Item> list();
    Item update(Item item, Integer id);
    Item delete(Item item, Integer id);

}
