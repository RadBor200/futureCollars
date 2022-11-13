package com.futurecollars.lesson6.task2;

import java.io.*;

public class EverySecondLinePrinter {

  public static void printEverySecondLine(String path) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
    String line;
    int numberLine = 0;
    while ((line = bufferedReader.readLine()) != null) {
      if (numberLine % 2 == 0) {
        System.out.println(line);
      }
      numberLine++;
    }
  }
}
