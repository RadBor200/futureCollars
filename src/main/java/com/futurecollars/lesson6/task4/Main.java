package com.futurecollars.lesson6.task4;

import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    try {
      System.out.println(WordFinder.searchWord("Witaj"));
      System.out.println(WordFinder.searchWord("Wyjątki"));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
