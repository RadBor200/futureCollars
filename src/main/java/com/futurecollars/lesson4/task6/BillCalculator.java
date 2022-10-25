package com.futurecollars.lesson4.task6;

public class BillCalculator {

  public static double calculate(double billValue, double serviceCharge) {
    return billValue + serviceCharge;
  }

  public static double calculate(double billValue, double serviceCharge, double discount) {
    return billValue + serviceCharge - discount;
  }

  public static double calculate(double billValue, double serviceCharge, int packagingFee) {
    return billValue + serviceCharge + packagingFee;
  }
}
