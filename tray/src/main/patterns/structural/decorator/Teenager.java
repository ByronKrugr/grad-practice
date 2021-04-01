package patterns.structural.decorator;

public class Teenager implements Person {
  @Override
  public void wearItem() {
    System.out.println("I am a teenager");
    System.out.println("I am now wearing shorts");
  }
}
