package com.futurecollars.lesson6.task4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WordFinder {
  public static boolean searchWord(String word) throws IOException {
    String textFromFile = Files.readString(Path.of("src/main/resources/data.txt"));
    return textFromFile.contains(word);
  }
}
