package com.futurecollars.lesson10.task1;

import java.util.NoSuchElementException;

public class MainPhonebook {

  public static void main(String[] args) {
    Phonebook phonebook = new Phonebook();
    phonebook.findEntry("Jan Kowalski");
    System.out.println();

    try {
      phonebook.findEntry("Janina Kowalska");

    } catch (NoSuchElementException e) {
      System.out.println(e.getMessage());

    }
  }
}
