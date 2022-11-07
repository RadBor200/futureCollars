package com.futurecollars.lesson7.task4;

public class TextCounter {

  public static int getLengthOfText(String text) {
    if (text == null) {
      return 0;
    }
    return text.length();
  }
}
