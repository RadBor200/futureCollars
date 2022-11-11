package com.futurecollars.lesson5.task3;

public class Subtraction implements Operation {

  @Override
  public int calculate(int... numbers) {
    int difference = numbers[0];
    for (int index = 1; index < numbers.length; index++) {
      difference -= numbers[index];
    }
    return difference;
  }

  @Override
  public char getSign() {
    return '-';
  }

}
