package com.futurecollars.lesson5.task1;

public class MainTextChecker {

  public static void main(String[] args) {

    String text = "no lemon, no melon";

    if (!TextChecker.isEmpty(text)) {
      System.out.println("Is it a palindrome? " + TextChecker.isPalindrome(text));
      System.out.println("Text length: " + TextChecker.checkLengthOfText(text));
    }
  }
}
