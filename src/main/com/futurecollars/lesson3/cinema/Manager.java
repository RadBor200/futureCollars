package main.com.futurecollars.lesson3.cinema;

public class Manager extends BaseEmployee {

  private final double DEFAULT_SALARY_MANAGER = 5000;
  private double bonus = 500;

  public Manager(String name, String surname, int yearOfHire) {
    super(name, surname, yearOfHire);
  }

  @Override
  public double calculateMonthlySalary() {
    return DEFAULT_SALARY_MANAGER + bonus;
  }

  @Override
  public double getBaseSalary() {
    return DEFAULT_SALARY_MANAGER;
  }

  public void setBonus(double bonus) {
    this.bonus = bonus;
  }

}
