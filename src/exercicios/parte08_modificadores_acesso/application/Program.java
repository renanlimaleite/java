package exercicios.parte08_modificadores_acesso.application;

import java.util.Locale;
import java.util.Scanner;

import exercicios.parte08_modificadores_acesso.entities.Bank;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter account number: ");
    String account = sc.nextLine();

    System.out.print("Enter account name: ");
    String name = sc.nextLine();

    System.out.print("Is there na initial deposit (y/n)? ");
    String yesOrNo = sc.nextLine();

    Bank bank;
    if (yesOrNo.equals("y")) {
      System.out.print("Enter initial deposit value: ");
      double initialDeposit = sc.nextDouble();
      bank = new Bank(account, name, initialDeposit);
    } else {
      bank = new Bank(account, name);
    }

    System.out.println("Account data: ");
    System.out
        .println(
            "Account " + bank.getAccountNumber() + " Holder: " + bank.getName() + ", Balance: $ " + bank.getAmount());

    System.out.print("Enter a deposit value: ");
    double deposit = sc.nextDouble();
    bank.addMoney(deposit);
    System.out.println("Updated data: ");
    System.out
        .println(
            "Account " + bank.getAccountNumber() + " Holder: " + bank.getName() + ", Balance: $ " + bank.getAmount());

    System.out.print("Enter a withdraw value: ");
    double withdraw = sc.nextDouble();
    bank.removeMoney(withdraw);
    System.out.println("Updated data: ");
    System.out
        .println(
            "Account " + bank.getAccountNumber() + " Holder: " + bank.getName() + ", Balance: $ " + bank.getAmount());

    sc.close();
  }
}
