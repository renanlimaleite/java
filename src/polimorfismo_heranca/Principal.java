package polimorfismo_heranca;

public class Principal {
  public static void main(String[] args) {
    System.out.println("Informações do paciente: ");
    /**
     * POLIMORFISMO -> 
     * DIZ QUE UM OBJETO PODE ASSUMIR DIVERSAS FORMAS
     * JÁ QUE PACIENTE É UMA PESSOA (HERDA DE PESSOA)
     * ENTÃO O TIPO PACIENTE PODE SER UMA PESSOA!
     */

     /**
     * TIPO PESSOA ASSUMINDO PACIENTE (POLIMORFISMO)
     */
    Pessoa paciente = new Paciente("1234", "Sulamerica", "Jose", 25, "1234567");
    paciente.imprimirInfo();


    System.out.println("-------------");


    System.out.println("Informações do Enfermeiro: ");
    
    /**
     * TIPO PESSOA ASSUMINDO ENFERMEIRO (POLIMORFISMO)
     */
    Pessoa enfermeiro = new Enfermeiro(40, "Geral", "1234", "Maria", 40, "7456123");
    enfermeiro.imprimirInfo();
  }
}
