package upcastingDowncasting.application;


import upcastingDowncasting.entities.Account;
import upcastingDowncasting.entities.BusinessAccount;
import upcastingDowncasting.entities.SavingsAccount;

public class Program {
  public static void main(String[] args) {
    Account acc = new Account(1001, "Alex", 0.0);
    BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

    // UPCASTING!
    // -> DE BUSSINESS ACOUNT (SUBCLASS) PARA ACCOUNT (CLASS PAI)
    Account acc1 = bacc;
    Account acc2 = new BusinessAccount(1003, "bob", 0.0, 200.0);
    Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);

    acc1.getBalance();
    acc2.getBalance();
    acc3.getBalance();

    // DOWNCATIN
    // DA SUPER CLASSE PARA SUBCLASSE
    BusinessAccount acc4 = (BusinessAccount) acc2;
    acc4.loan(100);


    
    if (acc3 instanceof BusinessAccount) {
      BusinessAccount acc5 = (BusinessAccount) acc3;
      acc5.loan(200.00);
      System.out.println("Loan");
    }

    if (acc3 instanceof SavingsAccount) {
      SavingsAccount acc5 = (SavingsAccount) acc3;
      acc5.updateBalance();
      System.out.println("Update");
    }
  }
}
