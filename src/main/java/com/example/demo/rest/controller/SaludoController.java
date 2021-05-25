package com.example.demo.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludo")
public class SaludoController {

  @GetMapping(path = "/{nombre}/{apellido}")
  public String saludar(@PathVariable("nombre") String nombre,
      @PathVariable("apellido") String apellido) {

    return "Hola " + nombre + "" + apellido;

  }

}
