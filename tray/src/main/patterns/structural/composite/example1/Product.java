package patterns.structural.composite.example1;

public class Product implements Parcel {
  private double cost;
  private String name;

  public Product(double cost, String name) {
    this.cost = cost;
    this.name = name;
  }

  @Override
  public double getCost() {
    return cost;
  }
}
