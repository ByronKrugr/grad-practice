package salary_slip;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Application {

  public static void main(String[] args) throws JsonProcessingException {
    SpringApplication.run(Application.class, args);
//    ObjectMapper objectMapper = new ObjectMapper();
//    EmployeeService employeeService = new EmployeeService();
//    //employeeService.addEmployee();
//    List<Employee> employees = employeeService.getAllEmployees();
//    for (Employee e : employees)
//      System.out.println(objectMapper.writeValueAsString(e));
  }
}
