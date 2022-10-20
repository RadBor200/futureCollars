package com.futurecollars.lesson4.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SquareTest {

  @Test
  void shouldReturn16WhenSideIs4() {
    //given
    Square square = new Square(4);
    //when
    double result = square.calculateArea();
    //then
    Assertions.assertEquals(16, result);
  }

  @Test
  void shouldReturn24WhenSideIs6() {
    //given
    Square square = new Square(6);
    //when
    double result = square.calculatePerimeter();
    //then
    Assertions.assertEquals(24, result);
  }
}
