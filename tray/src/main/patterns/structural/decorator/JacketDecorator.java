package patterns.structural.decorator;

public class JacketDecorator extends BaseDecorator {

  public JacketDecorator(Person person) {
    super(person);
  }

  @Override
  public void wearItem() {
    super.wearItem();
    System.out.println("I am now wearing a jacket");
  }
}
