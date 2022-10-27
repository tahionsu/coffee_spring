package com.ntnv.gldva.coffee.controller;

import com.ntnv.gldva.coffee.entity.CoffeeEntity;
import com.ntnv.gldva.coffee.service.CoffeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/coffee")
public class CoffeeController {

    @Autowired
    private CoffeeService coffeeService;

    @PostMapping
    public ResponseEntity registration(@RequestBody CoffeeEntity coffee) {
        try {
            coffeeService.registration(coffee);
            return ResponseEntity.ok("Кофе успешно добавлен");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @GetMapping
    public ResponseEntity getAllCoffees() {
        try {
            return ResponseEntity.ok(coffeeService.getAll());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @GetMapping("/")
    public ResponseEntity getOneCoffee(@RequestParam Integer id) {
        try {
            return ResponseEntity.ok(coffeeService.getOne(id));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteCoffee(@PathVariable Integer id) {
        try {
            return ResponseEntity.ok(coffeeService.delete(id));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }
}
