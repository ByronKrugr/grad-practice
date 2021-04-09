package salary_slip;

import java.util.List;

public interface EmployeeServiceInterface {
  List<Employee> getAllEmployees();

  Employee getEmployeeById(String id);
}
