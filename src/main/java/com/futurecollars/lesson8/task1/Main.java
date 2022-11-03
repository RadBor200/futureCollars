package com.futurecollars.lesson8.task1;

import java.util.List;

public class Main {
  public static void main(String[] args) {

    List<String> names = List.of("Anna", "Katarzyna", "Tymon", "Tadeusz", "Anna", "Karolina", "Dorota", "Piotr");

    ListPrinter.printWithoutDuplicates(names);
    ListPrinter.printReversed(names);
    ListPrinter.printWithReplacedElements("Anna", "Joanna", names);
  }
}
