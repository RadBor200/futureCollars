package main.com.futurecollars.lesson3.cinema;

public abstract class BaseEmployee {

  private String name;
  private String surname;
  private double salary;
  private final int yearOfHire;

  public BaseEmployee(String name, String surname, int yearOfHire) {
    this.name = name;
    this.surname = surname;
    this.yearOfHire = yearOfHire;
    this.salary = calculateMonthlySalary();
  }

  public abstract double calculateMonthlySalary();

  public abstract double getBaseSalary();

  public int getYearsWorked(int currentYear) {
    return currentYear - yearOfHire;
  }

  public String toString() {
    return String.format(
        "Name: %s, Surname: %s, Year of hire: %s, Salary: %s",
        name, surname, yearOfHire, calculateMonthlySalary()
    );
  }
}
