package com.futurecollars.lesson6.task8;

public class IdNumberValidator {

  public static void validateIdNumber (String personalIdNumber) {
    if (!(personalIdNumber.matches("[0-9]+"))) {
      throw new WrongTypeOfDataException("Id number should be composed of all numbers.");
    }
    if (personalIdNumber.length() != 11) {
      throw new IllegalLengthException("Id number should be 11 digits long.");
    }
  }
}

