package com.futurecollars.lesson8.task4;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
  public static void main(String[] args) {
    Set<Person> persons = new TreeSet<>();
    persons.add(new Person("Jan", "Kowalski", 1972, 172, 73.8));
    persons.add(new Person("Janina", "Kowalska", 1975, 155, 55.2));
    persons.add(new Person("Adam", "Kowalski", 1991, 199, 95.2));
    persons.add(new Person("Anna", "Kowalska", 2005, 162, 51.1));
    persons.add(new Person("Aleksandra", "Kowalska", 1987, 168, 58.2));

    System.out.println("Sort from youngest to oldest):");
    for (Person person : persons) {
      System.out.println(person.toString());
    }

    Set<Person> persons2 = new TreeSet<>(Comparator.comparingInt(Person::getHeight));
    persons2.addAll(persons);

    System.out.println("\n\nSort by height ascending: ");
    for (Person person : persons2) {
      System.out.println(person.toString());
    }

    Set<Person> persons3 = new TreeSet<>((o1, o2) -> Double.compare(o2.getWeight(), o1.getWeight()));
    persons3.addAll(persons);
    System.out.println("\n\nSort by weight descending: ");
    for (Person person : persons3) {
      System.out.println(person.toString());
    }
  }
}
