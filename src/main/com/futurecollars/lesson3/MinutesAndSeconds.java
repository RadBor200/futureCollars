package com.futurecollars.lesson3;

public class MinutesAndSeconds {

  public static int convertMinutesToSeconds(int minutes) {
    if (minutes > 0) {
      return minutes * 60;
    } else {
      return 0;
    }
  }
}

