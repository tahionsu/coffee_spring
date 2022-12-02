package com.ntnv.gldva.coffee.json;

import lombok.Data;

import java.io.Serializable;

@Data
public class CustomJSON implements Serializable {
    private String scoreSCA;
    private String grind;

}
