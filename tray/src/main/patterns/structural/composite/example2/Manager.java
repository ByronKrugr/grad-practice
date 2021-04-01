package patterns.structural.composite.example2;

public class Manager implements Employee {
  private String name;

  public Manager(String name) {
    this.name = name;
  }

  @Override
  public String getEmployeeDetails() {
    return this.getClass().getSimpleName() + " - Name: " + name + "\n";
  }
}
