package com.futurecollars.lesson6.task2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LineDisplay {
  public static void display() throws IOException {

    long counter = Files.lines(Path.of("src/main/resources/data.txt")).count();

    int n = 0;
    while (n < counter) {
      String line = Files.readAllLines(Paths.get("src/main/resources/data.txt")).get(n);
      System.out.println(line);
      n = n + 2;
    }
  }
}
