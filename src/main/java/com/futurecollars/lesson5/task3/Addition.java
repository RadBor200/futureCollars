package com.futurecollars.lesson5.task3;

public class Addition implements Operation {

  @Override
  public int calculate(int... numbers) {
    int sum = 0;
    for (int number : numbers) {
      sum += number;
    }
    return sum;
  }

  @Override
  public char getSign() {
    return '+';
  }

}
