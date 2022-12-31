package exercicios.parte08_modificadores_acesso.entities;

public class Bank {
  private String name;
  private String accountNumber;
  private double amount;

  public Bank(String accountNumber, String name, double initialDeposit) {
    this.accountNumber = accountNumber;
    this.name = name;
    this.amount = initialDeposit;
  }

  public Bank(String accountNumber, String name) {
    this.accountNumber = accountNumber;
    this.name = name;
    this.amount = 0;
  }

  public String getAccountNumber() {
    return this.accountNumber;
  }

  public double addMoney(double money) {
    return this.amount += money;
  }

  public void removeMoney(double money) {
    this.amount -= (money + 5);
  }

  public double getAmount() {
    return this.amount;
  }

  public String getAccount() {
    return this.accountNumber;
  }

  public String getName() {
    return this.name;
  }

  public String setName(String name) {
    return this.name = name;
  }
}
