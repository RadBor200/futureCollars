package com.futurecollars.lesson5.task4;

import java.math.BigDecimal;

public class Employee {
  private final String name;
  private final String surname;
  private int age;
  private BigDecimal baseSalary;
  private BigDecimal bonus;


  public Employee(String name, String surname) {
    this.name = name;
    this.surname = surname;
  }

  public Employee(String name, String surname, int age) {
    this(name, surname);
    this.age = age;
  }

  public Employee(String name, String surname, int age, BigDecimal baseSalary) {
    this(name, surname, age);
    this.baseSalary = baseSalary;
  }

  public Employee(String name, int age, BigDecimal baseSalary, BigDecimal bonus, String surname) {
    this(name, surname, age, baseSalary);
    this.bonus = bonus;
  }

  public String getEmployeeName() {
    return "Employee name : " + name + " " + surname;
  }

  public String getEmployeeNameAndAge() {
    return "Employee details : " + name + " " + surname + " is " + age;
  }

  public BigDecimal getSalary() {
    return baseSalary.add(bonus);
  }

  public BigDecimal getBaseSalary() {
    return baseSalary;
  }

  public BigDecimal getBonus() {
    return bonus;
  }
}
