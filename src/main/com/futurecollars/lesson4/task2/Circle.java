package com.futurecollars.lesson4.task2;


public class Circle extends Shape {
  private final double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public double calculateArea() {
    return Math.PI * Math.pow(radius, 2);
  }

  @Override
  public double calculatePerimeter() {
    return 2 * Math.PI * radius;
  }
}
