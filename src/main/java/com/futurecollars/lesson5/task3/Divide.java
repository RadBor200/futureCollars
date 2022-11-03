package com.futurecollars.lesson5.task3;

public class Divide implements UpdatedCalculator {

  @Override
  public double calculate(double... values) {
    if (values.length > 0) {
      double division = values[0];
      for (int i = 1; i < values.length; i++) {
        division /= values[i];
      }
      return division;
    }
    return 0;
  }
}
