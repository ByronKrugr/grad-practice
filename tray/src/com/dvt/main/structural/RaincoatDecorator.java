package structural;

public class RaincoatDecorator implements Person {
    @Override
    public void wearItem() {
        System.out.println("I am now wearing a raincoat");
    }
}
