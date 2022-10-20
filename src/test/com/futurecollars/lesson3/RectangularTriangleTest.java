package com.futurecollars.lesson3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RectangularTriangleTest {

  @Test
  void shouldReturnTrueWhenSidesAreThreeFourAndFive() {
    //given
    double sideA = 3;
    double sideB = 4;
    double sideC = 5;
    //when
    boolean result = RectangularTriangle.isTriangleRectangular(sideA,sideB,sideC);
    //then
    Assertions.assertTrue(result);
  }

  @Test
  void shouldReturnFalseWhenSidesAreThreedotThreeAndFourAndFive() {
    //given
    double sideA = 3.3;
    double sideB = 4;
    double sideC = 5;
    //when
    boolean result = RectangularTriangle.isTriangleRectangular(sideA,sideB,sideC);
    //then
    Assertions.assertFalse(result);
  }

  @Test
  void shouldReturnFalseWhenSidesAreMinusSevendotThreeAndFourAndFive() {
    //given
    double sideA = -7.3;
    double sideB = -4;
    double sideC = -5;
    //when
    boolean result = RectangularTriangle.isTriangleRectangular(sideA,sideB,sideC);
    //then
    Assertions.assertFalse(result);
  }

  @Test
  void shouldReturnFalseWhenSidesAreZero() {
    //given
    double sideA = 0;
    double sideB = 0;
    double sideC = 0;
    //when
    boolean result = RectangularTriangle.isTriangleRectangular(sideA,sideB,sideC);
    //then
    Assertions.assertFalse(result);
  }
}
