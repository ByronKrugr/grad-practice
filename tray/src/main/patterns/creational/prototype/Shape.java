package patterns.creational.prototype;

public abstract class Shape {
  protected String color;

  protected Shape() {
  }

  protected Shape(Shape source) {
    this.color = source.color;
  }

  public abstract Shape clone();
}
