package com.futurecollars.lesson4.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RectangleTest {

  @Test
  void shouldAreaEquals9WhenSidesAre3() {
    //given
    Rectangle rectangle = new Rectangle(3, 3);
    //when
    double result = rectangle.calculateArea();
    //then
    Assertions.assertEquals(9, result);
  }

  @Test
  void shouldPerimeterEquals12WhenSidesAre3() {
    //given
    Rectangle rectangle = new Rectangle(3, 3);
    //when
    double result = rectangle.calculatePerimeter();
    //then
    Assertions.assertEquals(12, result);
  }
}
