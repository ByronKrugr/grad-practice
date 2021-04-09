package salary_slip;

public class InsuranceProfile implements InsuranceProfileInterface {
  private static final double ANNUAL_INSURANCE_STARTING_LIMIT_LEVEL_1 = 8060.0;
  private static final double ANNUAL_INSURANCE_STARTING_LIMIT_LEVEL_2 = 43000.0;
  private static final double INSURANCE_RATE_LEVEL_1 = 0.12;
  private static final double INSURANCE_RATE_LEVEL_2 = 0.02;
  private static final int MONTHS = 12;
  private double annualInsuranceContribution;
  private double monthlyInsuranceContribution;
  private double annualGrossSalary;

  public InsuranceProfile(){}

  public void calculateInsuranceContribution(double annualGrossSalary) {
    this.annualGrossSalary = annualGrossSalary;

    if (annualGrossSalary > ANNUAL_INSURANCE_STARTING_LIMIT_LEVEL_2)
      calculateLevel2InsuranceContribution();
    else if ((annualGrossSalary > ANNUAL_INSURANCE_STARTING_LIMIT_LEVEL_1))
      calculateLevel1InsuranceContribution();

    if (annualInsuranceContribution > 0.0)
      convertInsuranceToMonthly();
  }

  private void convertInsuranceToMonthly() {
    monthlyInsuranceContribution = annualInsuranceContribution / MONTHS;
  }

  private void calculateLevel1InsuranceContribution() {
    annualInsuranceContribution += (annualGrossSalary - ANNUAL_INSURANCE_STARTING_LIMIT_LEVEL_1) * INSURANCE_RATE_LEVEL_1;
    monthlyInsuranceContribution += annualInsuranceContribution / MONTHS;
  }

  private void calculateLevel2InsuranceContribution() {
    annualInsuranceContribution += (annualGrossSalary - ANNUAL_INSURANCE_STARTING_LIMIT_LEVEL_2) * INSURANCE_RATE_LEVEL_2;
    annualInsuranceContribution += (ANNUAL_INSURANCE_STARTING_LIMIT_LEVEL_2 - ANNUAL_INSURANCE_STARTING_LIMIT_LEVEL_1) * INSURANCE_RATE_LEVEL_1;
  }

  private static double format(double preFormat) {
    return FormatDecimals.calculate(preFormat);
  }

  public double getMonthlyInsuranceContribution() {
    return format(monthlyInsuranceContribution);
  }

  public double getInsuranceRate() {
    if (annualGrossSalary > ANNUAL_INSURANCE_STARTING_LIMIT_LEVEL_2)
      return INSURANCE_RATE_LEVEL_2;
    else if (annualGrossSalary > ANNUAL_INSURANCE_STARTING_LIMIT_LEVEL_1)
      return INSURANCE_RATE_LEVEL_1;
    else return 0.0;
  }
}
