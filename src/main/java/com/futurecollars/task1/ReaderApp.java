package com.futurecollars.task1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReaderApp {
  public void showTextInConsoleFromFile(){
    {
      try {
        String textFromFile = Files.readString(Path.of("src/main/resources/data.txt"));
        System.out.println(textFromFile);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
