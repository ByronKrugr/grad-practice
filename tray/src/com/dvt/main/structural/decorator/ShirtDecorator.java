package structural.decorator;

public class ShirtDecorator extends BaseDecorator {

    public ShirtDecorator(Person wrappee) {
        super(wrappee);
    }

    @Override
    public void wearItem() {
        super.wearItem();
        System.out.println("I am now wearing a shirt");
    }
}
