package com.futurecollars.lesson5.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

  @Test
  void shouldSumNumbers() {
    //given
    Operation addition = new Addition();
    int[] numbers = {2, 3, 4, 5};
    //when
    int shouldBeSum = addition.calculate(numbers);
    //then
    Assertions.assertEquals(14, shouldBeSum);
  }

  @Test
  void shouldSubtractNumbers() {
    //given
    Operation subtraction = new Subtraction();
    int[] numbers = {12, 3, 4};
    //when
    int shouldBeDifference = subtraction.calculate(numbers);
    //then
    Assertions.assertEquals(5, shouldBeDifference);
  }

  @Test
  void shouldMultiplyNumbers() {
    //given
    Operation multiplication = new Multiplication();
    int[] numbers = {2, 3};
    //when
    int shouldBeProduct = multiplication.calculate(numbers);
    //then
    Assertions.assertEquals(6, shouldBeProduct);
  }

  @Test
  void shouldDivideNumbers() {
    //given
    Operation division = new Division();
    int[] numbers = {12, 3, 2};
    //when
    int shouldBeQuotient = division.calculate(numbers);
    //then
    Assertions.assertEquals(2, shouldBeQuotient);
  }

}
