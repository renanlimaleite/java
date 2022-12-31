package exercicios.parte03.application;

import java.util.Locale;
import java.util.Scanner;

import exercicios.parte03.entities.Student;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Student student = new Student();

    System.out.println("Name: ");
    student.name = sc.nextLine();

    System.out.println("Notas: ");

    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = sc.nextDouble();

    student.notaA = a;
    student.notaB = b;
    student.notaC = c;

    System.out.println("Final grade: " + student.pegarSomaNotas());

    System.out.println(student.aprovar());

    sc.close();
  }
}
