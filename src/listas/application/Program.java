package listas.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();

    list.add("Maria");
    list.add("Alex");
    list.add("Bob");
    list.add("Anna");
    list.add("Lorena");
    list.add("Renan");
    list.add("Ronaldo");
    list.add("Fulano");
    list.add("Ciclano");

    // SOBRECARGA -> ADICIONOU NA POSIÇÃO DOIS
    list.add(2, "Marco");

    System.out.println("Size: " + list.size());

    for (String x : list) {
      System.out.println(x);
    }

    System.out.println("---------------");

    // Tentando remover "Anna"
    list.remove("Anna");

    // Remover "Alex"
    list.remove(1);

    // Remover predicato, no caso vai remover todos que tem letra M.
    list.removeIf(x -> x.charAt(0) == 'M');

    for (String x : list) {
      System.out.println(x);
    }

    System.out.println("---------------");

    System.out.println("Index of Bob: " + list.indexOf("Bob"));
    System.out.println("Index of Marco: " + list.indexOf("Marco"));

    System.out.println("---------------");

    /**
     * OPERAÇÃO LAMBDA PARA FILTRAR APENAS NA LISTA, STRING Q COMEÇAM COM "R"
     */
    List<String> result = list.stream().filter(x -> x.charAt(0) == 'R').collect(Collectors.toList());

    for (String x : result) {
      System.out.println(x);
    }

    System.out.println("---------------");
    String name = list.stream().filter(x -> x.charAt(0) == 'R').findFirst().orElse(null);
    System.out.println(name);
  }
}
