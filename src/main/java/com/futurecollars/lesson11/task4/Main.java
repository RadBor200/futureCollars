package com.futurecollars.lesson11.task4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    List<String> specializations = Arrays.asList(
        "Szpital:Chirurg:Radiolog:Chirurg Szczękowy:Pediatra",
        "Przychodnia:Pediatra",
        "Przychodnia:Internista:Laryngolog:Pediatra");

    List<String> uniqueSpecializations = specializations.stream()
        .map(spec -> spec.split(":"))
        .flatMap(Arrays::stream)
        .distinct()
        .collect(Collectors.toList());

    Predicate<String> prefix = s -> s.equals("Szpital") || s.equals("Przychodnia");
    uniqueSpecializations.removeIf(prefix);

    uniqueSpecializations.forEach(System.out::println);
  }
}
