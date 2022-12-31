package exercicios.parte02.entities;

public class Employee {
  public String name;
  public double grossSalary;
  public double tax;

  public double netSalary() {
    return this.grossSalary - this.tax;
  }

  public void increaseSalary(double percentage) {
    double aumento = grossSalary * (percentage / 100);
    this.grossSalary += aumento;
  }
}
