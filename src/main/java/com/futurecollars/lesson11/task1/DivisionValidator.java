package com.futurecollars.lesson11.task1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DivisionValidator {

  public static List<Integer> getNumbersDivisibleByThree (int from, int to) {
    return IntStream.range(from, to)
        .filter(number -> number % 3 == 0)
        .boxed()
        .collect(Collectors.toList());
  }
}