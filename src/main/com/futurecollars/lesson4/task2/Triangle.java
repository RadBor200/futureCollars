package com.futurecollars.lesson4.task2;

public class Triangle extends Shape {
  private final double sideA;
  private final double sideB;
  private final double sideC;

  public Triangle(double sideA, double sideB, double sideC) {
    this.sideA = sideA;
    this.sideB = sideB;
    this.sideC = sideC;
  }

  @Override
  public double calculateArea() {
    double p = calculatePerimeter() / 2;
    return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
  }

  @Override
  public double calculatePerimeter() {
    return sideA + sideB + sideC;
  }
}
