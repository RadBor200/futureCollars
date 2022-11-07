package com.futurecollars.lesson7.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class NumberToolTest {

  @ParameterizedTest
  @ValueSource(ints = {4, 12, 32, -52, 96, 0})
  void shouldVerifyNumberIsEven(int input) {
    //given, when
    boolean isEven = NumberTool.isEven(input);
    //then
    Assertions.assertTrue(isEven);
  }

  @ParameterizedTest
  @CsvSource(value = {"211 : 4", "13 : 4", "72 : 9", "-825 : 15"}, delimiter = ':')
  void shouldVerifySumOfDigits(String input, String expected) {

    //given
    int actualValue = Integer.parseInt(input);
    int expectedValue = Integer.parseInt(expected);

    //when
    actualValue = NumberTool.calculateSumOfDigits(actualValue);

    //then
    Assertions.assertEquals(expectedValue, actualValue);
  }
}
