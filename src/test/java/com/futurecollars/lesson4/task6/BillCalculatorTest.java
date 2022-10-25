package com.futurecollars.lesson4.task6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BillCalculatorTest {

  @Test
  void shouldReturn25WhenArgsAre22and3() {
    //given
    double billValue = 22;
    double serviceCharge = 3;
    //when
    double result = BillCalculator.calculate(billValue, serviceCharge);
    //then
    Assertions.assertEquals(25, result);
  }


  @Test
  void shouldReturn22WhenArgsAre22dot5and3dot5and4() {
    //given
    double billValue = 22.5;
    double serviceCharge = 3.5;
    double discount = 4;
    //when
    double result = BillCalculator.calculate(billValue, serviceCharge, discount);
    //then
    Assertions.assertEquals(22, result);
  }

  @Test
  void shouldReturn30WhenArgsAre22dot5and3dot5and4() {
    //given
    double billValue = 22.5;
    double serviceCharge = 3.5;
    int packingFee = 4;
    //when
    double result = BillCalculator.calculate(billValue, serviceCharge, packingFee);
    //then
    Assertions.assertEquals(30, result);
  }
}