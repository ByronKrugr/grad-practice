package patterns.structural.composite.example2;

public class Developer implements Employee {
  private String name;

  public Developer(String name) {
    this.name = name;
  }

  @Override
  public String getEmployeeDetails() {
    return this.getClass().getSimpleName() + " - Name: " + name + "\n";
  }
}
