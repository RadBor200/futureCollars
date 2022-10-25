package com.futurecollars.lesson6.task3;

import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    try {
      System.out.println(CharacterCounter.countCharactersInFile());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
