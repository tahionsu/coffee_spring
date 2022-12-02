package com.ntnv.gldva.coffee.entity;

import com.ntnv.gldva.coffee.json.CustomJSON;
import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Data
@Entity
@Table(name = "coffee")
public class CoffeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @Type(type = "CustomJsonType")
    private CustomJSON description;

}
