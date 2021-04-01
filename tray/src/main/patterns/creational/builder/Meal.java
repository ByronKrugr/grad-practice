package patterns.creational.builder;

public class Meal {
  private final String gender;
  private final String burgerType;
  private final String drinkType;
  private final String sideOrder;
  private final String toyType;

  public Meal(Builder builder) {
    this.gender = builder.gender;
    this.burgerType = builder.burgerType;
    this.drinkType = builder.drinkType;
    this.sideOrder = builder.sideOrder;
    this.toyType = builder.toyType;
  }

  public String toString() {
    return "Your meal is as follows: "
            + "\nGender: " + gender
            + "\nBurger: " + burgerType
            + "\nDrink: " + drinkType
            + "\nSide: " + sideOrder
            + "\nToy: " + toyType;
  }

  public static class Builder {
    private final String gender;
    private final String burgerType;
    private String drinkType = "Not specified";
    private String sideOrder = "Not specified";
    private String toyType = "Not specified";

    public Builder(String gender, String burgerType) {
      this.gender = gender;
      this.burgerType = burgerType;
    }

    public Builder drinkType(String drinkType) {
      this.drinkType = drinkType;
      return this;
    }

    public Builder sideOrder(String sideOrder) {
      this.sideOrder = sideOrder;
      return this;
    }

    public Builder toyType(String toyType) {
      this.toyType = toyType;
      return this;
    }

    public Meal build() {
      return new Meal(this);
    }
  }
}
