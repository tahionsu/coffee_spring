package com.ntnv.gldva.coffee.entity;

import javax.persistence.*;

@Entity
@Table(name = "coffee")
public class CoffeeEntity {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;

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

    public String getDescription() {
        return description
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
