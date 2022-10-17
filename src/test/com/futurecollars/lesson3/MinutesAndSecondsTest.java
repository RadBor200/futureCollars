package com.futurecollars.lesson3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinutesAndSecondsTest {

  @Test
  void shouldReturn120SecondsFor2Minutes() {
    //given
    int minutes = 2;
    //when
    int result = MinutesAndSeconds.convertMinutesToSeconds(minutes);
    //then
    Assertions.assertEquals(120, result);
  }

  @Test
  void shouldReturn360SecondsFor6Minutes() {
    //given
    int minutes = 6;
    //when
    int result = MinutesAndSeconds.convertMinutesToSeconds(minutes);
    //then
    Assertions.assertEquals(360, result);
  }

  @Test
  void shouldReturn0SecondFor0Minute() {
    //given
    int minutes = 0;
    //when
    int result = MinutesAndSeconds.convertMinutesToSeconds(minutes);
    //then
    Assertions.assertEquals(0, result);
  }

  @Test
  void shouldReturnEnterPositiveNumberForMinus8() {
    //given
    int minutes = -8;
    //when
    int result = MinutesAndSeconds.convertMinutesToSeconds(minutes);
    //then
    Assertions.assertEquals(0, result);
  }
}

