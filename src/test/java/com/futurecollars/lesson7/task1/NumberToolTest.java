package com.futurecollars.lesson7.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class NumberToolTest {

  @ParameterizedTest
  @ValueSource(ints = {5, 50, -12})
  void shouldNumberIsEven(int input) {

    boolean isEven = NumberTool.isEven(input);

    Assertions.assertTrue(isEven);
  }

  @ParameterizedTest
  @CsvSource(value = {"432 : 9", "311 : 21", "123 : 32"}, delimiter = ':')
  void shouldSumNumbers(String input, String expected) {

    int valueActual = Integer.parseInt(input);
    int valueExpected = Integer.parseInt(expected);

    valueActual = NumberTool.sumNumbers(valueActual);
    Assertions.assertEquals(valueExpected, valueActual);
  }
}
