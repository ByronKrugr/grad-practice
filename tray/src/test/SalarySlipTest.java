import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import salary_slip.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class SalarySlipTest {
    @Mock
    TaxProfileInterface taxProfile;
    @Mock
    InsuranceProfileInterface insuranceProfile;
    @Mock
    Employee employee;
    SalarySlipInterface salarySlip;

    @BeforeEach
    public void setup() throws Exception {
        salarySlip = new SalarySlip(employee);
    }

    @Test
    public void employeeNotNull() throws Exception {
        assertNotNull(employee);
    }

    @Test
    public void employeeDetailsArePrintedCorrectly() throws Exception {
        when(employee.getId()).thenReturn("1");
        when(employee.getName()).thenReturn("Taylor");
        when(employee.getAnnualGrossSalary()).thenReturn(12000.0);
        when(employee.getMonthlyGrossSalary()).thenReturn(1000.0);
        when(employee.getInsuranceProfile()).thenReturn(insuranceProfile);
        when(employee.getInsuranceProfile().getInsuranceRate()).thenReturn(0.12);
        when(employee.getInsuranceProfile().getMonthlyInsuranceContribution()).thenReturn(39.4);
        when(employee.getTaxProfile()).thenReturn(taxProfile);
        when(employee.getTaxProfile().getMonthlyTaxableIncome()).thenReturn(83.33);
        when(employee.getTaxProfile().getMonthlyTaxFreeAllowance()).thenReturn(916.67);
        when(employee.getTaxProfile().getMonthlyTaxPayable()).thenReturn(16.67);

        assertEquals("Employee details are as follows: " +
                "\nId: 1" +
                "\nName: Taylor" +
                "\nAnnual Gross Salary: R12000.0" +
                "\nGross Salary: R1000.0" +
                "\nInsurance Rate: 0.12" +
                "\nInsurance Contribution: R39.4" +
                "\nTaxable Income: R83.33" +
                "\nTax Free Allowance: R916.67" +
                "\nTax Payable: R16.67", salarySlip.getEmployeeDetails());
    }

}
