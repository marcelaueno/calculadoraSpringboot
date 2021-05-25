package com.example.demo.rest.controller;

import com.example.demo.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculadora")
public class CalculatorController {

  @Autowired
  CalculatorService calculatorService;

  @GetMapping("/suma")
  public Integer suma(@RequestParam Integer a, @RequestParam Integer b) {
    return calculatorService.suma(a, b);
  }

  @GetMapping("/resta")
  public Integer resta(@RequestParam Integer a, @RequestParam Integer b) {
    return calculatorService.resta(a, b);
  }

  @GetMapping("/multiplica")
  public Integer multiplica(@RequestParam Integer a, @RequestParam Integer b) {
    return calculatorService.multiplica(a, b);
  }

  @GetMapping("/divide")
  public Integer divide(@RequestParam Integer a, @RequestParam Integer b) {
    return calculatorService.divide(a, b);
  }

  @PostMapping(path="/suma")
  public Integer sumaCalculo(Integer a, Integer b) {
    return calculatorService.suma(a, b);
  }


  // Ejercicio
  // Crear el método "add", debe ser un método POST

  // Crear un método para dividir.
}
