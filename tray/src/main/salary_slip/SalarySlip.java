package salary_slip;

public class SalarySlip implements SalarySlipInterface {
  private final Employee employee;

  public SalarySlip(Employee employee) {
    this.employee = employee;
  }

  @Override
  public Employee getEmployee() {
    return employee;
  }

  @Override
  public String getEmployeeDetails() {
    return "Employee details are as follows: " +
            "\nId: " + employee.getEmployeeId() +
            "\nName: " + employee.getName() +
            "\nAnnual Gross Salary: R" + employee.getAnnualGrossSalary() +
            "\nGross Salary: R" + employee.getMonthlyGrossSalary() +
            "\nInsurance Rate: " + employee.getInsuranceProfile().getInsuranceRate() +
            "\nInsurance Contribution: R" + employee.getInsuranceProfile().getMonthlyInsuranceContribution() +
            "\nTaxable Income: R" + employee.getTaxProfile().getMonthlyTaxableIncome() +
            "\nTax Free Allowance: R" + employee.getTaxProfile().getMonthlyTaxFreeAllowance() +
            "\nTax Payable: R" + employee.getTaxProfile().getMonthlyTaxPayable();
  }
}
