package salary_slip;

public class SalarySlipGenerator {
    private SalarySlipInterface salarySlip;

    public SalarySlipGenerator(){
    }

    public SalarySlipInterface generateSalarySlip(Employee employee) {
        salarySlip = new SalarySlip(employee);
        return salarySlip;
    }
}
