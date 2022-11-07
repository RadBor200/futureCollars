package com.futurecollars.lesson11.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {

    List<String> animals = new ArrayList<>(Arrays.asList("Cat", "Dog", "Monkey", "Elephant",
        "Giraffe", "Hippopotamus", "Donkey", "Fish"));

    List<String> namesToUpperCase = animals
        .stream()
        .map(String::toUpperCase)
        .map(Main::removeDuplicates)
        .collect(Collectors.toList());

    namesToUpperCase.forEach(System.out::println);
  }

  public static String removeDuplicates(String input) {
    StringBuilder stringBuilder = new StringBuilder();

    input
        .chars()
        .distinct()
        .forEach(c -> stringBuilder.append((char) c));
    return stringBuilder.toString();
  }
}
