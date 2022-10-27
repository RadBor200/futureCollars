package com.futurecollars.lesson10.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class URLValidator {
  public static boolean validateURL (String url) {
    Pattern pattern = Pattern.compile("^(https?://)?(www\\.)?([\\w]+\\.)+[\\w]{2,3}$");
    Matcher matcher = pattern.matcher(url);
    return matcher.matches();
  }
}
