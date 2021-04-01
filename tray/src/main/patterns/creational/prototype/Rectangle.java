package patterns.creational.prototype;

public class Rectangle extends Shape {
  private int width;
  private int length;

  public Rectangle(int width, int length, String color) {
    this.width = width;
    this.length = length;
    this.color = color;
  }

  public Rectangle(Rectangle rectangle) {
    super(rectangle);
    this.width = rectangle.width;
    this.length = rectangle.length;
  }

  @Override
  public Shape clone() {
    return new Rectangle(this);
  }
}
