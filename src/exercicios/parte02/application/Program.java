package exercicios.parte02.application;

import java.util.Locale;
import java.util.Scanner;

import exercicios.parte02.entities.Employee;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Employee employee = new Employee();

    System.out.println("Name: ");
    employee.name = sc.nextLine();

    System.out.println("Salário bruto: ");
    employee.grossSalary = sc.nextDouble();

    System.out.println("Taxa: ");
    employee.tax = sc.nextDouble();

    System.out.println("Employee: " + employee.name + ", $ " + employee.netSalary());

    System.out.println("Which percentage to increase salary? ");
    double percentage = sc.nextDouble();
    employee.increaseSalary(percentage);

    System.out.println("Updated data: " + employee.name + ", $ " + employee.netSalary());

    sc.close();
  }
}
