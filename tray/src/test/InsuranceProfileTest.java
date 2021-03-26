import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import salary_slip.*;

public class InsuranceProfileTest {
    Employee employee = null;
    SalarySlipInterface salarySlip = null;

    // UTILITIES
    private void assertInsuranceContribution(double expected) {
        assertEquals(expected, salarySlip.getEmployee().getInsuranceProfile().getMonthlyInsuranceContribution(), 0.00);
    }

    private void assertInsuranceRate(double expected) {
        assertEquals(expected, salarySlip.getEmployee().getInsuranceProfile().getInsuranceRate(), 0.0);
    }

    @BeforeEach
    public void setup() {
        employee = new Employee("11", "Taylor", 8060.0);
        salarySlip = new SalarySlipGenerator().generateSalarySlip(employee);
    }

    @Test
    public void insuranceProfileCreated() throws Exception {
        InsuranceProfileInterface insuranceProfile = new InsuranceProfile();
        assertNotNull(insuranceProfile);
    }

    @Test
    public void calculateInsuranceContributionWhenNotApplicable() throws Exception {
        assertInsuranceContribution(0.0);
    }

    @Test
    public void calculateInsuranceContributionWhenApplicable() throws Exception {
        employee = new Employee("11", "Taylor", 9060.0);
        salarySlip = new SalarySlipGenerator().generateSalarySlip(employee);
        assertInsuranceContribution(10.00);
    }

    @Test
    public void calculateInsuranceRateWhenNotApplicable() throws Exception {
        assertInsuranceRate(0.0);
    }

    @Test
    public void calculateInsuranceRateWhenApplicable() throws Exception {
        employee = new Employee("11", "Taylor", 9060.0);
        salarySlip = new SalarySlipGenerator().generateSalarySlip(employee);
        assertInsuranceRate(0.12);
    }
}
