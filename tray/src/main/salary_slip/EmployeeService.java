package salary_slip;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;


import java.util.ArrayList;
import java.util.List;

import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.springframework.stereotype.Component;

import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

@Component
public class EmployeeService implements EmployeeServiceInterface{
  private MongoClient mongoClient;
  private MongoDatabase mongoDatabase;
  private MongoCollection<Employee> mongoCollection;

  public EmployeeService() {
    initializeConnection();
  }

  private void initializeConnection() {
    mongoClient = new MongoClient(new MongoClientURI("mongodb+srv://teeray:7473tt@cluster0.x4jns.mongodb.net/test"));
    CodecRegistry codecRegistry = fromRegistries(MongoClient.getDefaultCodecRegistry(),
                                                fromProviders(PojoCodecProvider.builder().build()));
    mongoDatabase = mongoClient.getDatabase("salarySlipKata").withCodecRegistry(codecRegistry);
    mongoCollection = mongoDatabase.getCollection("employees", Employee.class);
  }

  public void addEmployee() {
    mongoCollection.insertOne(new Employee("2", "Taylor", 10000.0));
  }

  @Override
  public Employee getEmployeeById(String id) {
    mongoCollection.
    return null;
  }

  @Override
  public List<Employee> getAllEmployees() {
    Employee employee = new Employee("2", "taylor", 10000);
    List<Employee> list = new ArrayList<>();
    list.add(employee);

    return list;


  }
//  public List<Employee> getAllEmployees() {
//    List<Employee> employeeList = new ArrayList<>();
//    Iterable<Employee> employeeIterable = mongoCollection.find();
//
//    for (Employee e : employeeIterable) {
//      employeeList.add(e);
//    }
//    return employeeList;
//  }
}
