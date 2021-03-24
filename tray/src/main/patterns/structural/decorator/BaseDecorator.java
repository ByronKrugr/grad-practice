package patterns.structural.decorator;

public class BaseDecorator implements Person{
    protected Person wrappee;

    public BaseDecorator(Person wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void wearItem() {
        wrappee.wearItem();
    }
}
