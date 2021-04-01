package salary_slip;

public class Employee {
  private String id;
  private String name;
  private double annualGrossSalary;
  private double monthlyGrossSalary;

  private final TaxProfileInterface taxProfile = new TaxProfile();
  private final InsuranceProfileInterface insuranceProfile = new InsuranceProfile();

  public Employee() {
  }

  public Employee(String id, String name, double annualGrossSalary) {
    final int MONTHS = 12;
    this.id = id;
    this.name = name;
    this.annualGrossSalary = annualGrossSalary;
    this.monthlyGrossSalary = annualGrossSalary / MONTHS;

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
    return format(monthlyGrossSalary);
  }

  public TaxProfileInterface getTaxProfile() {
    return taxProfile;
  }

  public InsuranceProfileInterface getInsuranceProfile() {
    return insuranceProfile;
  }

  private static double format(double preFormat) {
    return FormatDecimals.calculate(preFormat);
  }
}
