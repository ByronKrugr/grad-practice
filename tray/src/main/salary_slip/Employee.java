package salary_slip;

import org.bson.codecs.pojo.annotations.BsonCreator;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.springframework.data.annotation.Id;

public class Employee {
  @Id
  private String employeeId;
  private String name;
  private double annualGrossSalary;
  private double monthlyGrossSalary;

  @BsonProperty
  private TaxProfileInterface taxProfile = new TaxProfile();
  @BsonProperty
  private InsuranceProfileInterface insuranceProfile = new InsuranceProfile();

  @BsonCreator
  public Employee(@BsonProperty("employeeId") String employeeId, @BsonProperty("name") String name, @BsonProperty("annualGrossSalary") double annualGrossSalary) {
    final int MONTHS = 12;
    this.employeeId = employeeId;
    this.name = name;
    this.annualGrossSalary = annualGrossSalary;
    monthlyGrossSalary = annualGrossSalary / MONTHS;

    taxProfile.calculateTaxAmountDue(this.annualGrossSalary);
    insuranceProfile.calculateInsuranceContribution(this.annualGrossSalary);
  }

  public String getEmployeeId() {
    return employeeId;
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
