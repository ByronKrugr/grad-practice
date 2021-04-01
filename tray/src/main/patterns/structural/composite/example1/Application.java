package patterns.structural.composite.example1;

public class Application {
  public static void main(String[] args) {
    Composite drinks = new Composite();
    drinks.add(new Product(10.0, "coke"));
    drinks.add(new Product(15.0, "fanta"));

    Composite biscuits = new Composite();
    biscuits.add(new Product(5.0, "chocolateBiscuit"));
    biscuits.add(new Product(4.50, "creamBiscuit"));

    Composite entireParcel = new Composite();
    entireParcel.add(new Product(50.0, "coffee"));
    entireParcel.add(drinks);
    entireParcel.add(biscuits);

    System.out.println(entireParcel.getCost());
  }
}
