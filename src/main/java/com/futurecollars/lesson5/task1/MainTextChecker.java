package com.futurecollars.lesson5.task1;

import java.util.Scanner;

public class MainTextChecker {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Insert text: ");
    String text = scanner.nextLine();

    TextChecker textChecker = new TextChecker();
    if (textChecker.hasCharacters(text)) {
      System.out.println("Is palindrome: " + (textChecker.isPalindrome(text)));
      System.out.println("Length: " + text.length());
    } else {
      System.out.println("Text hasn't any character");
    }
  }
}
