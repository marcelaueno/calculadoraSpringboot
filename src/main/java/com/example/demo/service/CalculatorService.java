package com.example.demo.service;

import com.example.demo.domain.Numeros;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalculatorService {


  public Integer suma(Integer a, Integer b) {

    return a + b;
  }

  public Integer suma(List<Numeros> numeros) {

    System.out.println(numeros);
    System.out.println("sumando: "+numeros.get(0).getSumando() + " "+ numeros.get(1).getSumando());
    //TODO
    return 0;
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
