package exercicios.parte03.entities;

public class Student {
  public String name;
  public double notaA;
  public double notaB;
  public double notaC;

  public double pegarSomaNotas() {
    return notaA + notaB + notaC;
  }

  public String aprovar() {
    double result = pegarSomaNotas();
    double missign = 60 - result;

    if (result > 60.0) {
      return "PASS";
    } else {
      return "FAILED MISSING " + missign + " POINTS";
    }
  }
}
