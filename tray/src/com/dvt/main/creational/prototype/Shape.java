package creational.prototype;

public abstract class Shape {
    protected String color;

    public Shape() {
    }

    public Shape(Shape source) {
        this.color = source.color;
    }

    public abstract Shape clone();
}
