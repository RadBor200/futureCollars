package com.futurecollars.lesson5.task3;

public class Multiply implements UpdatedCalculator{

  @Override
  public double calculate(double ...values) {
    double multiplication = 1;
    for(double value: values) {
      multiplication *= value;
    }

    return multiplication;
  }
}
