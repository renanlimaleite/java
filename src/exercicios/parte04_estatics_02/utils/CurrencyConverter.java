package exercicios.parte04_estatics_02.utils;

public class CurrencyConverter {
  public static final double IOF = 1.06;

  public static double amount(double price, double quantity) {
    return price * quantity * IOF;
  }
}
