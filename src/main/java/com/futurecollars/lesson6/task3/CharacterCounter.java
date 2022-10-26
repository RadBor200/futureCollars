package com.futurecollars.lesson6.task3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CharacterCounter {
  public static long countCharactersInFile() throws IOException {
    String textFromFile = Files.readString(Path.of("src/main/resources/data.txt"));
    String textWithoutNextLineSign = textFromFile.replaceAll("\\n", "");
    return textWithoutNextLineSign.length();
  }
}
