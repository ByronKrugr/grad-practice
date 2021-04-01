package patterns.structural.decorator;

public class Application {


  public static void main(String[] args) {
    boolean requiresShirt = true;
    boolean isCold = true;
    boolean isRaining = true;

    Person wrapper = new Teenager();

    if (requiresShirt) {
      wrapper = new ShirtDecorator(wrapper);
    }
    if (isCold) {
      wrapper = new JacketDecorator(wrapper);
    }
    if (isRaining) {
      wrapper = new RaincoatDecorator(wrapper);
    }

    wrapper.wearItem();
  }
}
