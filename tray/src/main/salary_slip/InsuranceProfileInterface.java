package salary_slip;

public interface InsuranceProfileInterface {
    void calculateInsuranceContribution(double annualGrossSalary);
    double getInsuranceRate();
    double getMonthlyInsuranceContribution();
}
