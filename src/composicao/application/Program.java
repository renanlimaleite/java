package composicao.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import composicao.entities.Departament;
import composicao.entities.HourContrat;
import composicao.entities.WorkLevelEnum;
import composicao.entities.Worker;

public class Program {
  public static void main(String[] args) throws ParseException {
    
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    System.out.print("Enter departamen's name: ");
    String departamentName = sc.nextLine();

    System.out.print("Enter worker data: ");

    System.out.print("Name: ");
    String workerName = sc.nextLine();

    System.out.print("Level: ");
    String workerLevel = sc.nextLine();

    System.out.print("Base salary: ");
    double baseSalary = sc.nextDouble();

    Worker worker = new Worker(
      workerName, 
      WorkLevelEnum.valueOf(workerLevel), 
      baseSalary,
      new Departament(departamentName)
    );

    System.out.print("How many contracts to this worker? ");

    int n = sc.nextInt();

    for (int i = 1; i < n; i++) {
      System.out.println("Enter contract #" + i + " data:");
      System.out.print("Date: ");
      Date contractDate = sdf.parse(sc.next());
      System.out.print("Valor por hora: ");
      double valuePerHour = sc.nextDouble();
      System.out.print("Horas trabalhadas: ");
      int hours = sc.nextInt();
      HourContrat contract = new HourContrat(contractDate, valuePerHour, hours);
      worker.addContract(contract);
    }

    System.out.println();

    System.out.println("Enter mes e ano income: ");
    String monthAndYear = sc.next();

    int month = Integer.parseInt(monthAndYear.substring(0, 2)); 
    int year = Integer.parseInt(monthAndYear.substring(3)); 
    
    System.out.println("Name: " + worker.getName());
    System.out.println("Departament: " + worker.getDepartament().getName());
    System.out.println("Income for " + monthAndYear + ": " + worker.income(year, month));


    sc.close();
  }
}
