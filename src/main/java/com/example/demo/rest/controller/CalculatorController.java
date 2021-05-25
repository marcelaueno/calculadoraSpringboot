package com.example.demo.rest.controller;

import com.example.demo.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

  @Autowired
  CalculatorService calculatorService;

  @GetMapping("/add")
  public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
    return calculatorService.add(a, b);
  }

  // Ejercicio
  // Crear el método "add", debe ser un método POST

  // Crear un método para dividir.
}
