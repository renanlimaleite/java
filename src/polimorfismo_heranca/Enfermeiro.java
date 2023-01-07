package polimorfismo_heranca;

public class Enfermeiro extends Pessoa {
  private int horaTrabalho;
  private String setor;
  private String numeroCadastro;


  public Enfermeiro(
    int horaTrabalho, 
    String setor, 
    String numeroCadastro, 
    String nome, int idade, String documento) 
    {
      super(nome, idade, documento);
      this.horaTrabalho = horaTrabalho;
      this.setor = setor;
      this.numeroCadastro = numeroCadastro;
    }
  
  @Override
  public void imprimirInfo() {
    super.imprimirInfo();
    System.out.println("Hora de Trabalho: " + this.horaTrabalho);
    System.out.println("Setor: " + this.setor);
    System.out.println("Nº de Cadastro: " + this.numeroCadastro);
  }
}
