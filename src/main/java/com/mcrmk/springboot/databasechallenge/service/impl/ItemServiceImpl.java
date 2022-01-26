package com.mcrmk.springboot.databasechallenge.service.impl;

import com.mcrmk.springboot.databasechallenge.exception.ItemNotFoundException;
import com.mcrmk.springboot.databasechallenge.model.Item;
import com.mcrmk.springboot.databasechallenge.repository.ItemRepository;
import com.mcrmk.springboot.databasechallenge.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    ItemRepository itemRepository;


    @Override
    public Item create(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public Item retrieve(Integer id) {
        return itemRepository.findById(id).orElseThrow(() -> new ItemNotFoundException(String.format("The item with ID: {} was not found when trying to retrieve it.", id)));
    }

    @Override
    public List<Item> list() {
        List<Item> itemList = new ArrayList<>();
        itemRepository.findAll().forEach(itemList::add);
        return itemList;
    }

    @Override
    public Item update(Item item, Integer id) {
        item.setId(id);
        return itemRepository.save(item);
    }

    @Override
    public Item delete(Item item, Integer id) {
        item.setId(id);
        itemRepository.delete(item);
        return item;
    }
}
