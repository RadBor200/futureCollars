package com.futurecollars.lesson7.task1;

public class NumberTool {

  public static boolean isEven(int num) {
    return num % 2 == 0;
  }

  public static int sumNumbers(int num) {
    int result = 0;

    if (num < 0) {
      num = -num;
    }
    while (num > 0) {

      result += num % 10;
      num /= 10;
    }
    return result;
  }
}
