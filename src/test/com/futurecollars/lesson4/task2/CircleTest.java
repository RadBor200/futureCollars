package com.futurecollars.lesson4.task2;

import org.apache.commons.math3.util.Precision;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CircleTest {

  @Test
  void shouldAreaEquals28Dot27WhenRadiusIs3() {
    //given
    Circle circle = new Circle(3);
    //when
    double result = circle.calculateArea();
    //then
    Assertions.assertEquals(28.27, Precision.round(result,2));
  }

  @Test
  void shouldPerimeterEquals18Dot85WhenRadiusIs3() {
    //given
    Circle circle = new Circle(3);
    //when
    double result = circle.calculatePerimeter();
    //then
    Assertions.assertEquals(18.85, Precision.round(result,2));
  }
}
