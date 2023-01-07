package polimorfismo_heranca;

public class Paciente extends Pessoa {
  private String matricula;
  private String planoDeSaude;


  public Paciente(String matricula, String planoDeSaude, String nome, int idade, String documento) {
    super(nome, idade, documento);
    this.matricula = matricula;
    this.planoDeSaude = planoDeSaude;
  }
  
  @Override
  public void imprimirInfo() {
    super.imprimirInfo();
    System.out.println("Matricula: " + this.matricula);
    System.out.println("Plano: " + this.planoDeSaude);
  }
}
