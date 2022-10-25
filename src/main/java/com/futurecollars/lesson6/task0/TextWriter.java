package com.futurecollars.lesson6.task0;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TextWriter {

  public void writeTextToFile(String text) {

    try {
      Files.writeString(Path.of("src/main/resources/data.txt"), text);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

