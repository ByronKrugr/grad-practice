package salary_slip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class Controller {

  @Autowired
  private EmployeeRepository repository;

  @GetMapping(value = "/employees")
  public ResponseEntity<List<Employee>> getAllEmployees() {
    List<Employee> employees = repository.findAll();
    return new ResponseEntity<>(employees, HttpStatus.OK);
  }

  @GetMapping("/employee/{employeeId}")
  public ResponseEntity<Employee> getEmployeeById(@PathVariable(value = "employeeId") String employeeId) {
    Employee employee = repository.findByEmployeeId(employeeId);
    return new ResponseEntity<>(employee, HttpStatus.OK);
  }

  @PostMapping("/employee/add")
  public void addEmployee(@RequestBody Employee employee) {
    repository.save(employee);
    System.out.println("well done");
  }

  @DeleteMapping("/employee/{employeeId}/delete")
  public void deleteEmployee(@PathVariable("employeeId") String employeeId) {
    repository.deleteById(employeeId);
  }

  @PutMapping("/employee/update")
  public void updateEmployee(@RequestBody Employee employee) {
    repository.save(employee);
  }
}
