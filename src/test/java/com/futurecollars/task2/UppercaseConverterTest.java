package com.futurecollars.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

class UppercaseConverterTest {

  @ParameterizedTest
  @ValueSource(strings = {"car, motorcycle, boat"})
  void shouldBeUppercaseText(String text) {
    //when
    String uppercaseText = new UppercaseConverter().convertToUppercase(text);
    //then
    Assertions.assertEquals("CAR, MOTORCYCLE, BOAT", uppercaseText);
  }

  @ParameterizedTest
  @NullAndEmptySource
  void shouldBeBlank(String text) {
    //when
    String blank = new UppercaseConverter().convertToUppercase(text);
    //then
    Assertions.assertEquals("", blank);
  }

}
