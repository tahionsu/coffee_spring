package com.ntnv.gldva.coffee.controller;

import com.ntnv.gldva.coffee.CoffeeEntity;
import com.ntnv.gldva.coffee.CoffeeRepo;
import com.ntnv.gldva.coffee.Coffeeervice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/coffee")
public class CoffeeController {

    @Autowired
    private CoffeeService coffeeService;

    @PostMapping
    public ResponseEntity registration(@RequestBody CoffeeEntity cofee) {
        try {
            cofeeService.registration(cofee;
            return ResponseEntity.ok("Кофе успешно добавлен");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @GetMapping
    public ResponseEntity getOneUser(@RequestParam Integer id) {
        try {
            return ResponseEntity.ok(coffeeService.getOne(id));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteUser(@PathVariable Integer id) {
        try {
            return ResponseEntity.ok(coffeeService.delete(id));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }
}