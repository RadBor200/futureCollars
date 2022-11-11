package com.futurecollars.lesson11.task5;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<String> words = new ArrayList<>(List.of("Cat,Dog,Monkey,Elephant,Giraffe,Hippopotamus,Donkey,Fish"));
    WordDisplayer.displayWords(words);
  }

}
