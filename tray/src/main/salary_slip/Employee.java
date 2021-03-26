package salary_slip;

public class Employee {
    private String id;
    private String name;
    private double annualGrossSalary;
    private TaxProfileInterface taxProfile = new TaxProfile();
    private InsuranceProfileInterface insuranceProfile = new InsuranceProfile();

    public Employee() {
    }

    public Employee(String id, String name, double annualGrossSalary) {
        this.id = id;
        this.name = name;
        this.annualGrossSalary = annualGrossSalary;

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

    public TaxProfileInterface getTaxProfile() {
        return taxProfile;
    }

    public InsuranceProfileInterface getInsuranceProfile() {
        return insuranceProfile;
    }
}
