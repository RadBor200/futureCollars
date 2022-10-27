package com.futurecollars.lesson9.task4;

public class Main {
  public static void main(String[] args) {
    Pair<Integer, String> pair1 = new Pair<>(1, "Kot");
    Pair<Integer, String> pair2 = new Pair<>(2, "Pies");

    System.out.println(pair1.getKey());
    System.out.println(pair1.getValue());
    System.out.println(pair2.getKey());
    System.out.println(pair2.getValue());
  }
}
