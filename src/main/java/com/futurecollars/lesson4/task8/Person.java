package com.futurecollars.lesson4.task8;

import java.util.Objects;

public class Person {
  private final String name;
  private final String surname;
  private final long idNumber;

  public Person(String name, String surname, long idNumber) {
    this.name = name;
    this.surname = surname;
    this.idNumber = idNumber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Person person = (Person) o;
    return idNumber == person.idNumber;
  }

  @Override
  public int hashCode() {
    return Objects.hash(idNumber);
  }

}
