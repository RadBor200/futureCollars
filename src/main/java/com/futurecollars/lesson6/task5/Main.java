package com.futurecollars.lesson6.task5;

import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    try {
      TextInverter.reverseTextFromFile();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
