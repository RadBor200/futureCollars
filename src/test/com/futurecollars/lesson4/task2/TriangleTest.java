package com.futurecollars.lesson4.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TriangleTest {

  @Test
  void shouldAreaEquals6WhenSidesAre3And4And5() {
    //given
    Triangle triangle = new Triangle(3,4,5);
    //when
    double result = triangle.calculateArea();
    //then
    Assertions.assertEquals(6, result);
  }

  @Test
  void shouldPerimeterEquals12WhenSidesAre3And4And5() {
    //given
    Triangle triangle = new Triangle(3,4,5);
    //when
    double result = triangle.calculatePerimeter();
    //then
    Assertions.assertEquals(12, result);
  }
}
