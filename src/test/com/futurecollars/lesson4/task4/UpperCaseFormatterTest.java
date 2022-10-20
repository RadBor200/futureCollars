package com.futurecollars.lesson4.task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UpperCaseFormatterTest {

  @Test
  void shouldReturnUpperCase () {
    //given
    UpperCaseFormatter upperCaseFormatter = new UpperCaseFormatter();
    String text = "This is UPPERCASE text.";
    //when
    String result = upperCaseFormatter.formatText(text);
    //then
    Assertions.assertEquals("THIS IS UPPERCASE TEXT.", result);
  }
}
