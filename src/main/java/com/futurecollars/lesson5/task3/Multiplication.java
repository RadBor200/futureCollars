package com.futurecollars.lesson5.task3;

public class Multiplication implements Operation {

  @Override
  public int calculate(int... numbers) {
    int product = 1;
    for (int number : numbers) {
      product *= number;
    }
    return product;
  }

  @Override
  public char getSign() {
    return '*';
  }

}
