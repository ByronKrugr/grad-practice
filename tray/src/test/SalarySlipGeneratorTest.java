import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import salary_slip.*;

@ExtendWith(MockitoExtension.class)
public class SalarySlipGeneratorTest {
    @Mock
    private Employee employee;
    private SalarySlipGenerator salarySlipGenerator;

    @BeforeEach
    public void setup() {
        salarySlipGenerator = new SalarySlipGenerator();
    }

    @Test
    public void createSalarySlipGenerator() throws Exception {
        assertNotNull(salarySlipGenerator);
    }

    @Test
    public void salarySlipCreated() throws Exception {
        SalarySlipInterface salarySlip = salarySlipGenerator.generateSalarySlip(employee);
        assertNotNull(salarySlip);
    }
}
