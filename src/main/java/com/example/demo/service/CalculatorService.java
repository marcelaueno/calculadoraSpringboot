package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

  public Integer suma(Integer a, Integer b) {

    return a + b;
  }

  public Integer resta(Integer a, Integer b) {

    return a - b;
  }

  public Integer multiplica(Integer a, Integer b) {

    return a * b;
  }

  public Integer divide(Integer a, Integer b) {
    return a / b;
  }

}
