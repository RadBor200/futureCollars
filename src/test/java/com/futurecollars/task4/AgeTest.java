package com.futurecollars.task4;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AgeTest {

  @Test
  void shouldReturnBelow18WhenAgeIs10() {
    String verification = Age.verifyAge(10);
    Assertions.assertEquals("Your age is below 18.", verification);
  }

  @Test
  void shouldReturnAbove18WhenAgeIs22() {
    String verification = Age.verifyAge(25);
    Assertions.assertEquals("Your age is 18 or above 18.", verification);
  }
}
