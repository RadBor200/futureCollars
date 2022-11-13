package com.futurecollars.lesson2.task4;

public class Age {

  public static String verifyAge(int age) {
    if (age < 18) {
      return "Your age is below 18.";
    } else {
      return "Your age is 18 or above 18.";
    }
  }
}
