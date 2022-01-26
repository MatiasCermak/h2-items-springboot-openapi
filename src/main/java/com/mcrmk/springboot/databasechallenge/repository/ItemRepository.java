package com.mcrmk.springboot.databasechallenge.repository;

import com.mcrmk.springboot.databasechallenge.model.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ItemRepository extends CrudRepository<Item, Integer> {
}
