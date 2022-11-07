package com.futurecollars.lesson7.task5;

import java.time.Month;

public class SeasonDisplay {
  public static String displaySeason(Month month) {
    if (month == null) {
      return "";
    }
    String season = "";
    switch (month) {
      case MARCH:
      case APRIL:
      case MAY:
        season = Season.SPRING.toString();
        break;
      case JUNE:
      case JULY:
      case AUGUST:
        season = Season.SUMMER.toString();
        break;
      case SEPTEMBER:
      case OCTOBER:
      case NOVEMBER:
        season = Season.AUTUMN.toString();
        break;
      case DECEMBER:
      case JANUARY:
      case FEBRUARY:
        season = Season.WINTER.toString();
        break;
    }
    return season;
  }
}
