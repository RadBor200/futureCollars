package com.futurecollars.lesson5.task1;

public class TextChecker {

  public static boolean isEmpty(String text) {
    return text.isEmpty();
  }

  private static String removeWhiteSpaces(String text) {
    return text.replaceAll("\\s", "");
  }

  public static boolean isPalindrome(String text) {
    String modifiedText = removeWhiteSpaces(text).toLowerCase();
    int l = modifiedText.length();
    String convertedText = "";

    for(int k = l - 1; k >= 0; k--)
    {
      convertedText = convertedText + modifiedText.charAt(k);
    }

    return modifiedText.equals(convertedText);
  }

  public static int checkLengthOfText(String text) {
    return text.length();
  }
}
