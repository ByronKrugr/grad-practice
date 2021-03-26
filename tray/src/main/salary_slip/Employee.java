package salary_slip;

public class Employee {
    private String id;
    private String name;
    private double annualGrossSalary;
    private double monthlyGrossSalary;
    private TaxProfileInterface taxProfile = new TaxProfile();
    private InsuranceProfileInterface insuranceProfile = new InsuranceProfile();

    public Employee() {
    }

    public Employee(String id, String name, double annualGrossSalary) {
        this.id = id;
        this.name = name;
        this.annualGrossSalary = annualGrossSalary;
        this.monthlyGrossSalary = format(annualGrossSalary / 12.0);

        this.taxProfile.calculateTaxAmountDue(this.annualGrossSalary);
        this.insuranceProfile.calculateInsuranceContribution(this.annualGrossSalary);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getAnnualGrossSalary() {
        return annualGrossSalary;
    }

    public double getMonthlyGrossSalary() {
        return monthlyGrossSalary;
    }

    public TaxProfileInterface getTaxProfile() {
        return taxProfile;
    }

    public InsuranceProfileInterface getInsuranceProfile() {
        return insuranceProfile;
    }

    private double format(double preFormat) {
        return FormatDecimals.calculate(preFormat);
    }
}
