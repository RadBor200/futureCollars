package com.futurecollars.lesson10.task5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PasswordValidatorTest {

  @Test
  void shouldVerifyPasswordIsValid() {
    //given
    String password = "1Ayetdjfi3";
    //when
    boolean isValid = PasswordValidator.isValid(password);
    //then
    Assertions.assertTrue(isValid);
  }

  @Test
  void shouldVerifyPasswordIsNotValid() {
    //given
    String password = "kasdfjahfja";
    //when
    boolean isValid = PasswordValidator.isValid(password);
    //then
    Assertions.assertFalse(isValid);
  }

  @Test
  void shouldVerifyPasswordWithYearIsNotValid() {
    //given
    String password = "A102021";
    //when
    boolean isValid = PasswordValidator.isValid(password);
    //then
    Assertions.assertFalse(isValid);
  }

  @Test
  void shouldVerifyEmptyPasswordIsNotValid() {
    //given
    String password = "";
    //when
    boolean isValid = PasswordValidator.isValid(password);
    //then
    Assertions.assertFalse(isValid);
  }
}
