import com.dvt.main.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SalarySlipGeneratorTest {
    private SalarySlipInterface salarySlip = null;
    private Employee employee = null;
    private TaxProfileInterface taxProfile = null;

    //UTILITIES
    private void assertName(String expected) {
        assertEquals(expected, salarySlip.getEmployee().getName());
    }

    private void assertId(String expected) {
        assertEquals(expected, salarySlip.getEmployee().getId());
    }

    private void assertGrossSalary(double expected) {
        assertEquals(expected, salarySlip.getMonthlyGrossSalary(), 0.00);
    }

    @BeforeEach
    public void setup() {
        taxProfile = new TaxProfile();
        employee = new Employee("0001", "Taylor Ray", 10000.00, new TaxProfile(), new InsuranceProfile());
        salarySlip = new SalarySlipGenerator().generateSalarySlip(employee);
    }

    @Test
    public void mainExists() throws Exception {
        assertEquals("hello", Main.main(new String[]{"hello"}));
    }

    @Test
    public void createDummySalarySlip() throws Exception {
        SalarySlipInterface salarySlip = new SalarySlip();
        assertNotNull(salarySlip);
    }

    @Test
    public void createSalarySlipGenerator() throws Exception {
        SalarySlipGenerator salarySlipGenerator = new SalarySlipGenerator();
        assertNotNull(salarySlipGenerator);
    }

    @Test
    public void createDummyEmployee() throws Exception {
        Employee employee = new Employee();
        assertNotNull(employee);
    }

    @Test
    public void employeeDetailsAreSetWithSetup() throws Exception {
        assertId("0001");
        assertName("Taylor Ray");
        assertGrossSalary(833.33);
    }

    @Test
    public void createdSalarySlipGeneratorWithNoData() throws Exception {
        SalarySlipGenerator salarySlipGenerator = new SalarySlipGenerator();
        assertNotNull(salarySlipGenerator);
    }

    @Test
    public void createdSalarySlipWithSalarySlipGenerator() throws Exception {
        assertNotNull(salarySlip);
    }

    @Test
    public void createSalarySlipWithNoData() throws Exception {
        SalarySlipInterface salarySlip = new SalarySlip();
        assertNotNull(salarySlip);
    }

    @Test
    public void salarySlipReceivesEmployee() throws Exception {
        assertEquals(employee, salarySlip.getEmployee());
    }
}
