package com.ntnv.gldva.coffee.entity;

import com.ntnv.gldva.coffee.json.CustomJSON;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table(name = "coffee")
public class CoffeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    /* Для hibernate 6 возможно использование аннотации  @JdbcTypeCode(SqlTypes.JSON)
       Однако у меня 5 версия, в такой ситуации нужно писать mapping */
    @Type(type="CustomJsonType")        

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

    /*
    Для ентити классов очень желательно переопределять hash и eqals методы, иначе могут повылазить неприятные баги.
    Но по ним есть нюансы - погугли, основное расскажу на лекциях.
    */
}
