package salary_slip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class Controller {

  @Autowired
  private EmployeeServiceInterface employeeService;

  @GetMapping("/employees")
  public ResponseEntity<List<Employee>> getAllEmployees() {
    List<Employee> employees = employeeService.getAllEmployees();
    return new ResponseEntity<>(employees, HttpStatus.OK);
  }

  @GetMapping("/employee/{id}")
  public ResponseEntity<Employee> getEmployeeById(String id) {
    Employee employee = employeeService.getEmployeeById(id);
    return new ResponseEntity<>(employee, HttpStatus.OK);
  }
}
