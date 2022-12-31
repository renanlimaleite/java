package exercicios.parte01.application;

import java.util.Locale;
import java.util.Scanner;

import exercicios.parte01.entities.Rectangle;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Rectangle rectangle = new Rectangle();

    System.out.println("Enter rectangle width and height: ");
    rectangle.width = sc.nextDouble();
    rectangle.height = sc.nextDouble();

    System.out.println("AREA = " + String.format("%.2f", rectangle.area()));

    System.out.println("PERIMETER = " + String.format("%.2f", rectangle.perimetro()));

    System.out.println("DIAGONAL = " + String.format("%.2f", rectangle.diagonal()));

    sc.close();
  }
}
