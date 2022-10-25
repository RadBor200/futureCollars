package com.futurecollars.lesson6.task7;

public class SquareRoot {
  public static double calculateSquareRoot(double number) {
    if (number < 0) {
      throw new IllegalArgumentException();
    }
    return Math.sqrt(number);
  }
}
