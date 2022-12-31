package exercicios.parte06_sobrecarga.entities;

public class Product {
  public String name;
  public double price;
  public int quantity;

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
