package com.futurecollars.lesson2.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {


  @Test
  void shouldReturn5WhenAdd2To3() {
    int result = Calculator.add(2, 3);
    Assertions.assertEquals(5, result);
  }

  @Test
  void shouldReturn0WhenAddMinus8to8() {
    int result = Calculator.add(-8, 8);
    Assertions.assertEquals(0, result);
  }

  @Test
  void shouldReturnMinIntegerWhenAdd1toMaxInteger() {
    int result = Calculator.add(1, Integer.MAX_VALUE);
    Assertions.assertEquals(Integer.MIN_VALUE, result);
  }

  @Test
  void shouldReturn10WhenSubtract5From15() {
    int result = Calculator.subtract(15, 5);
    Assertions.assertEquals(10, result);
  }

  @Test
  void shouldReturnMinus14WhenSubtract7FromMinus7() {
    int result = Calculator.subtract(-7, 7);
    Assertions.assertEquals(-14, result);
  }

  @Test
  void shouldReturn0WhenSubtractMinus8From8() {
    int result = Calculator.subtract(8, -8);
    Assertions.assertEquals(16, result);
  }

  @Test
  void shouldReturn8WhenMultiply4and2() {
    int result = Calculator.multiply(4, 2);
    Assertions.assertEquals(8, result);
  }

  @Test
  void shouldReturn0WhenMultiply0and2() {
    int result = Calculator.multiply(0, 2);
    Assertions.assertEquals(0, result);
  }

  @Test
  void shouldReturnMinus10WhenMultiply2andMinus5() {
    int result = Calculator.multiply(2, -5);
    Assertions.assertEquals(-10, result);
  }


  @Test
  void shouldReturn3Dot14WhenDivide6Dot28by2() {
    double result = Calculator.divide(6.28, 2);
    Assertions.assertEquals(3.14, result);
  }

  @Test
  void shouldReturn5WhenDivide10by2() {
    double result = Calculator.divide(10, 2);
    Assertions.assertEquals(5, result);
  }

  @Test
  void shouldReturnMinus20WhenDivide100byMinus5() {
    double result = Calculator.divide(100, -5);
    Assertions.assertEquals(-20, result);
  }
}
