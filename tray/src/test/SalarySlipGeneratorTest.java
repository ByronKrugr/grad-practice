import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import salary_slip.Employee;
import salary_slip.SalarySlipGenerator;
import salary_slip.SalarySlipInterface;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(MockitoExtension.class)
class SalarySlipGeneratorTest {
  @Mock
  private Employee employee;
  private SalarySlipGenerator salarySlipGenerator;

  @BeforeEach
  public void setup() {
    salarySlipGenerator = new SalarySlipGenerator();
  }

  @Test
  void createSalarySlipGenerator() throws Exception {
    assertNotNull(salarySlipGenerator);
  }

  @Test
  void salarySlipCreated() throws Exception {
    SalarySlipInterface salarySlip = salarySlipGenerator.generateSalarySlip(employee);
    assertNotNull(salarySlip);
  }
}
