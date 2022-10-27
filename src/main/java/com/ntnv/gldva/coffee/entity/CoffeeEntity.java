package com.ntnv.gldva.coffee.entity;

import com.ntnv.gldva.coffee.json.CustomJSON;
import javax.persistence.*;

import com.ntnv.gldva.coffee.json.CustomJsonType;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "coffee")
public class CoffeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Type(CustomJsonType)
    private CustomJSON description;

    public CoffeeEntity() {
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CustomJSON getDescription() {
        return description;
    }

    public void setDescription(CustomJSON description) {
        this.description = description;
    }
}
