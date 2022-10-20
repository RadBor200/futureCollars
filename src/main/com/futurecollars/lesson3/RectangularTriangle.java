package com.futurecollars.lesson3;


public class RectangularTriangle {

  public static boolean isTriangleRectangular(double sideA, double sideB, double sideC) {
    if (sideA > 0 && sideB > 0 && sideC > 0) {
      return Math.pow(sideA, 2) + Math.pow(sideB, 2) == Math.pow(sideC, 2);
    } else {
      return false;
    }
  }
}

