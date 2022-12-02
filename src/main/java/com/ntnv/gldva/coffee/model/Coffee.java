package com.ntnv.gldva.coffee.model;

import com.ntnv.gldva.coffee.entity.CoffeeEntity;
import com.ntnv.gldva.coffee.json.CustomJSON;
import lombok.Data;

@Data
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

}

