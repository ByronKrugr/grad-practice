package salary_slip;

public class SalarySlipGenerator {

  public SalarySlipInterface generateSalarySlip(Employee employee) {
    return new SalarySlip(employee);
  }
}
