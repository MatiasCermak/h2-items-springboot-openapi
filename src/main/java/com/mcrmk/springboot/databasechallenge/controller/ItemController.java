package com.mcrmk.springboot.databasechallenge.controller;

import com.mcrmk.springboot.databasechallenge.model.Item;
import com.mcrmk.springboot.databasechallenge.service.ItemService;
import com.mcrmk.springboot.databasechallenge.service.impl.ItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/items")
public class ItemController {
    @Autowired
    ItemService itemService;


    @PostMapping("")
    Item createItem(@RequestBody Item item){
        return itemService.create(item);
    }

    @GetMapping("{id}")
    Item retrieveItem(@PathVariable Integer id){
        return itemService.retrieve(id);
    }

    @GetMapping("")
    List<Item> getItem(){
        return itemService.list();
    }

    @PutMapping("{id}")
    Item updateItem(@RequestBody Item item, @PathVariable Integer id){
        return  itemService.update(item, id);
    }

    @DeleteMapping("{id}")
    Item deleteItem(@RequestBody Item item, @PathVariable Integer id){
        return  itemService.delete(item, id);
    }
}
