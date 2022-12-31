package exercicios.parte04_estatics_02.application;

import java.util.Locale;
import java.util.Scanner;

import exercicios.parte04_estatics_02.utils.CurrencyConverter;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("What is the dollar price? ");
    double dollar = sc.nextDouble();

    System.out.print("How many dollars will be bought? ");
    double quantity = sc.nextDouble();

    double result = CurrencyConverter.amount(dollar, quantity);

    System.out.printf("Amount to be paid in reais = %.2f%n", result);

    sc.close();
  }
}
