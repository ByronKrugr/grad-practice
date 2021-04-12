package salary_slip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
public class Controller {

  @Autowired
  private EmployeeRepository repository;

  @GetMapping("/employees")
  public ResponseEntity<List<Employee>> getAllEmployees() {
    repository.save(new Employee("2","taylor",12000));
    List<Employee> employees = repository.findAll();
    return new ResponseEntity<>(employees, HttpStatus.OK);
  }

  @GetMapping("/employee/{id}")
  public ResponseEntity<Employee> getEmployeeById(@PathVariable(value = "id") String id) {
    Employee employee = repository.findByEmployeeId(id);
    return new ResponseEntity<>(employee, HttpStatus.OK);
  }
}
