package com.futurecollars.lesson10.task1;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Phonebook {
  class Entry {

    private String nameAndSurname;
    private String address;
    private Optional<String> phoneNumber;

    public Entry(String nameAndSurname, Optional<String> phoneNumber, String address) {
      this.nameAndSurname = nameAndSurname;
      this.address = address;
      this.phoneNumber = phoneNumber;
    }

    public String getNameAndSurname() {
      return nameAndSurname;
    }

    @Override
    public String toString() {
      return "Name And Surname: " + nameAndSurname + ", address: " + address +
          ", phoneNumber: " + phoneNumber.orElse("");
    }
  }

  private List<Entry> phonebookList = new ArrayList<>();

  public Phonebook() {
    File phonebook = new File("Phonebook.csv");

    try (Scanner scanner = new Scanner(phonebook)) {
      scanner.useDelimiter(",|\\r\\n");
      while (scanner.hasNext()) {
        String nameAndSurname = scanner.next();
        String phoneNumber = scanner.next();
        String address = scanner.next();

        phonebookList.add(new Entry(nameAndSurname, Optional.ofNullable(phoneNumber), address));
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }

  public void findEntry(String nameAndSurname) {
    boolean isPresent = false;
    for (Entry entry : phonebookList) {
      if (entry.getNameAndSurname().equals(nameAndSurname)) {
        isPresent = true;
        System.out.println(entry.toString());
      }
    }
    if (!isPresent) {
      throw new NoSuchElementException("Name not found in phonebook");

    }
  }
}
