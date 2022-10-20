package com.futurecollars.lesson4.task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LowerCaseFormatterTest {

  @Test
  void shouldReturnLowerCase () {
    //given
    LowerCaseFormatter lowerCaseFormatter = new LowerCaseFormatter();
    String text = "This is lowercase text.";
    //when
    String result = lowerCaseFormatter.formatText(text);
    //then
    Assertions.assertEquals("this is lowercase text.", result);
  }
}
