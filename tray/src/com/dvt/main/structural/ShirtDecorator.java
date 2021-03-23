package structural;

public class ShirtDecorator implements Person {
    @Override
    public void wearItem() {
        System.out.println("I am now wearing a shirt");
    }
}
