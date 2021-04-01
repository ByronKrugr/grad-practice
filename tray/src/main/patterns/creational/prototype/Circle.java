package patterns.creational.prototype;

public class Circle extends Shape {
  private int radius;

  public Circle(int radius, String color) {
    this.radius = radius;
    this.color = color;
  }

  public Circle(Circle circle) {
    super(circle);
    this.radius = circle.radius;
  }

  @Override
  public Shape clone() {
    return new Circle(this);
  }
}
