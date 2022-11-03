package com.futurecollars.lesson5.task3;

public class Subtract implements UpdatedCalculator {

  @Override
  public double calculate(double... values) {

    if (values.length > 0) {
      double subtraction = values[0];
      for (int i = 1; i < values.length; i++) {
        subtraction -= values[i];
      }
      return subtraction;

    }
    return 0;
  }
}
