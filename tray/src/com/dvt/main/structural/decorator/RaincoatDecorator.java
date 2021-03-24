package structural.decorator;

public class RaincoatDecorator extends BaseDecorator {

    public RaincoatDecorator(Person wrappee) {
        super(wrappee);
    }

    @Override
    public void wearItem() {
        super.wearItem();
        System.out.println("I am now wearing a raincoat");
    }
}
