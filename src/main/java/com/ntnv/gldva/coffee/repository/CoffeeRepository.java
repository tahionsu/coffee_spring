package com.ntnv.gldva.coffee.repository;

import com.ntnv.gldva.coffee.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface CoffeeRepo extends CrudRepository<CoffeeEntity, Integer> {
    UserEntity findByUsername(String username);
}
