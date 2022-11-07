package com.futurecollars.lesson6.task2;

import java.io.IOException;

public class Main {

  public static void main(String[] args) {
    try {
      EverySecondLineWriter.writeEverySecondLine("src/main/resources/data.txt");
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

}
