package com.futurecollars.lesson4.task3;

import org.apache.commons.math3.util.Precision;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CircleTest {

  @Test
  void shouldReturn78Dot54WhenRadiusIs5() {
    //given
    Circle circle = new Circle(5);
    //when
    double result = Precision.round(circle.calculateArea(), 2);
    //then
    Assertions.assertEquals(78.54, result);
  }

  @Test
  void shouldReturn31Dot42WhenRadiusIs5() {
    //given
    Circle circle = new Circle(5);
    //when
    double result = Precision.round(circle.calculatePerimeter(), 2);
    //then
    Assertions.assertEquals(31.42, result);
  }
}
