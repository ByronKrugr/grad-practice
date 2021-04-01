package patterns.creational.builder;

public class Client {

  public static void main(String[] args) {
    Meal fullMeal = new Meal.Builder("boy", "cheeseburger").drinkType("coke").sideOrder("chips").toyType("action man").build();
    System.out.println(fullMeal.toString());

    Meal halfMeal = new Meal.Builder("girl", "hamburger").drinkType("pepsi").build();
    System.out.println(halfMeal.toString());
  }
}
