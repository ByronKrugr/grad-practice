package creational.prototype;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        ArrayList<Shape> shapesList = new ArrayList<>();

        Circle circle = new Circle(10, "red");
        shapesList.add(circle);

        Rectangle rectangle = new Rectangle(10,5,"blue");
        shapesList.add(rectangle);

        ArrayList<Shape> cloneList = new ArrayList<>(shapesList);
        System.out.println("Before cloning array size is: " + cloneList.size());

        for (Shape s : shapesList)
            cloneList.add(s.clone());

        System.out.println("After cloning array size is: " + cloneList.size());
    }
}
