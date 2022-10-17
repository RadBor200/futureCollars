package com.futurecollars.lesson2;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NumbersTest {

  @Test
  void shouldReturnTrueWhenNumberIs4() {
    //given
    int number = 4;
    //when
    boolean result = Numbers.checkNumberIsEven(number);
    //then
    Assertions.assertTrue(result);
  }

  @Test
  void shouldReturnNFalseWhenNumberIs11() {
    //given
    int number = 11;
    //when
    boolean result = Numbers.checkNumberIsEven(number);
    //then
    Assertions.assertFalse(result);
  }

  @Test
  void shouldReturnTrueWhenNumberIs0() {
    //given
    int number = 0;
    //when
    boolean result = Numbers.checkNumberIsEven(number);
    //then
    Assertions.assertTrue(result);
  }

  @Test
  void shouldReturnTrueWhenNumberIsMinus256() {
    //given
    int number = -256;
    //when
    boolean result = Numbers.checkNumberIsEven(number);
    //then
    Assertions.assertTrue(result);
  }
}
