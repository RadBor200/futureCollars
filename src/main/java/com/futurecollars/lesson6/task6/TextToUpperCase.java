package com.futurecollars.lesson6.task6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TextToUpperCase {
  public static void convertTextToUpperCase() {
    try {
      String textFromFile = Files.readString(Paths.get("src/main/resources/data.txt"));
      Files.writeString(Paths.get("src/main/resources/output.txt"), textFromFile.toUpperCase());
    } catch (IOException exception) {
      exception.printStackTrace();
    }
  }
}
