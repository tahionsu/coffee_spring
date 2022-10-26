package com.ntnv.gldva.coffee.repository;

import com.ntnv.gldva.coffee.entity.CoffeeEntity;
import org.springframework.data.repository.CrudRepository;

public interface CoffeeRepo extends CrudRepository<CoffeeEntity, Integer> {
    CoffeeEntity findByName(String name);
}
