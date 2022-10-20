package com.futurecollars.lesson2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DaysOfWeekTest {

  @Test
  void shouldReturnMondayWhenDayOfWeekIs1() {
    String result = DaysOfWeek.printDayOfWeek(1);
    Assertions.assertEquals("Monday", result);
  }

  @Test
  void shouldReturnWeekendWhenDayOfWeekIs7() {
    String result = DaysOfWeek.printDayOfWeek(7);
    Assertions.assertEquals("Weekend", result);
  }

  @Test
  void shouldReturnNoDayWhenDayOfWeekIs8() {
    String result = DaysOfWeek.printDayOfWeek(8);
    Assertions.assertEquals("There is no such a day!", result);
  }

  @Test
  void shouldReturnNoDayWhenDayOfWeekIsMinus7() {
    String result = DaysOfWeek.printDayOfWeek(-7);
    Assertions.assertEquals("There is no such a day!", result);
  }
}
