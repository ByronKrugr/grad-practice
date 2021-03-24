package structural;

public class JacketDecorator implements Person{
    @Override
    public void wearItem() {
        System.out.println("I am now wearing a jacket");
    }
}
