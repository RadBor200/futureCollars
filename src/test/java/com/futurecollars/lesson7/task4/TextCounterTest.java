package com.futurecollars.lesson7.task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullSource;

import java.util.stream.Stream;

class TextCounterTest {

  @ParameterizedTest
  @MethodSource ("provideVariousTexts")
  void shouldReturnLengthOfText (String input, int expected) {
    int actualValue = TextCounter.getLengthOfText(input);
    Assertions.assertEquals(expected, actualValue);
  }

  private static Stream<Arguments> provideVariousTexts() {
    return Stream.of(
        Arguments.of("TOP GUN", "7"),
        Arguments.of("Mission Impossible", "18"),
        Arguments.of("", "0")
    );
  }

  @ParameterizedTest
  @NullSource
  void shouldReturnZeroForNull (String input){
    //given, when
    int actual = TextCounter.getLengthOfText(input);
    int expected = 0;
    //then
    Assertions.assertEquals(expected, actual);
  }
}
