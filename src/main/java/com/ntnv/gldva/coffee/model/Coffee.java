package com.ntnv.gldva.coffee.model;

import com.ntnv.gldva.coffee.entity.CoffeeEntity;
import com.ntnv.gldva.coffee.json.CustomJSON;

public class Coffee {
    private Integer id;
    private String name;
    private CustomJSON description;

    public static Coffee toModel(CoffeeEntity coffee) {
        Coffee model = new Coffee();
        model.setId(coffee.getId());
        model.setName(coffee.getName());
        model.setDescription(coffee.getDescription());
        return model;
    }

    public Coffee() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CustomJSON getDescription() {
        return description;
    }

    public void setDescription(CustomJSON description) {
        this.description = description;
    }
}

