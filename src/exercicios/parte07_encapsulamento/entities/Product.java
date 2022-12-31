package exercicios.parte07_encapsulamento.entities;

public class Product {
  private String name;
  private double price;
  private int quantity;

  // 1º construtor (default)
  public Product() {
  }

  // 2º construtor
  public Product(String name, double price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  // 3º construtor -> sobrecarga
  public Product(String name, double price) {
    this.name = name;
    this.price = price;
  }

  public double totalValueInStock() {
    return price * quantity;
  }

  public void addProducts(int quantity) {
    this.quantity += quantity;
  }

  public void removeProducts(int quantity) {
    this.quantity -= quantity;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String toString() {
    return name
        + ", $ "
        + String.format("%.2f", price)
        + ", "
        + quantity
        + " unitis, Total: $ "
        + String.format("%.2f", totalValueInStock());
  }
}
