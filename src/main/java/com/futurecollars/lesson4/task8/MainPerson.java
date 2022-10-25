package com.futurecollars.lesson4.task8;

public class MainPerson {

  public static void main(String[] args) {
    Person person1 = new Person("Jan","Kowalski",99010101000L);
    Person person2 = new Person("Janina","Kowalska",69010101000L);
    Person person3 = new Person("Mateusz","Kowalski",22010101000L);

    System.out.println(person1.equals(person2));
    System.out.println(person1.hashCode() == person2.hashCode());
    System.out.println(person2.hashCode() == person1.hashCode());

    System.out.println(person2.equals(person3));
    System.out.println(person2.hashCode() == person3.hashCode());
    System.out.println(person3.hashCode() == person2.hashCode());

    System.out.println(person1.equals(person3));
    System.out.println(person1.hashCode() == person3.hashCode());
    System.out.println(person3.hashCode() == person1.hashCode());
  }
}

