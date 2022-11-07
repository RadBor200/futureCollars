package com.futurecollars.lesson10.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PersonalIdValidator {

  public static boolean validateId(String personalId) {

    Pattern pattern = Pattern.compile("\\d{11}");
    Matcher matcher = pattern.matcher(personalId);

    return matcher.matches();
  }
}
