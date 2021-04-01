package patterns.structural.composite.example2;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class Composite implements Employee {
  private List<Employee> employeeList = new ArrayList<>();

  public void add(Employee... employees) {
    employeeList.addAll(asList(employees));
  }

  public void remove(Employee... employees) {
    employeeList.removeAll(asList(employees));
  }

  @Override
  public String getEmployeeDetails() {
    String details = "";
    for (Employee e : employeeList)
      details += e.getEmployeeDetails();
    return details;
  }
}
