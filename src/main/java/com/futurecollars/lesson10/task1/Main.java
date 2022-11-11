package com.futurecollars.lesson10.task1;

public class Main {

  public static void main(String[] args) {
    PhoneBook phoneBook = new PhoneBook();
    Contact contact = phoneBook.find("Jan Kowalski");
    System.out.println(contact.toString());
  }

}
