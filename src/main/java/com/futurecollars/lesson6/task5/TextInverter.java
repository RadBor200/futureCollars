package com.futurecollars.lesson6.task5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TextInverter {

  public static void reverseTextFromFile() throws IOException {
    String textFromFile = Files.readString(Path.of("src/main/resources/data.txt"));
    StringBuilder stringBuilder = new StringBuilder(textFromFile);
    System.out.println(stringBuilder.reverse());
  }
}
