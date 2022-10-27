package com.ntnv.gldva.coffee.service;

import com.ntnv.gldva.coffee.repository.CoffeeRepo;
import com.ntnv.gldva.coffee.model.Coffee;
import com.ntnv.gldva.coffee.exception.CoffeeNotFoundException;
import com.ntnv.gldva.coffee.entity.CoffeeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoffeeService {

    @Autowired
    private CoffeeRepo coffeeRepo;

    public CoffeeEntity registration(CoffeeEntity coffee) {
        return coffeeRepo.save(coffee);
    }

    public Coffee getOne(Integer id) throws CoffeeNotFoundException {
        CoffeeEntity coffee = coffeeRepo.findById(id).get();
        if (coffee == null) {
            throw new CoffeeNotFoundException("Кофе не найден");
        }
        return Coffee.toModel(coffee);
    }

    public Iterable<CoffeeEntity> getAll() {
        return coffeeRepo.findAll();
    }

    public Integer delete(Integer id) {
        coffeeRepo.deleteById(id);
        return id;
    }
}

