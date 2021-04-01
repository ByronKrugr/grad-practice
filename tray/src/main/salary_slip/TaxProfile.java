package salary_slip;

public class TaxProfile implements TaxProfileInterface {
  private static final double ANNUAL_TAX_LIMIT_LEVEL_1 = 11000.0;
  private static final double ANNUAL_TAX_LIMIT_LEVEL_2 = 43000.0;
  private static final double ANNUAL_TAX_LIMIT_LEVEL_3 = 100000.0;
  private static final double ANNUAL_TAX_LIMIT_LEVEL_4 = 150000.0;
  private static final double TAX_RATE_LEVEL_1 = 0.2;
  private static final double TAX_RATE_LEVEL_2 = 0.4;
  private static final double TAX_RATE_LEVEL_3 = 0.45;
  private static final int MONTHS = 12;
  private double annualTaxableIncome;
  private double monthlyTaxableIncome;
  private double annualTaxPayable;
  private double monthlyTaxPayable;
  private double monthlyTaxFreeAllowance;
  private double annualTaxFreeAllowance = ANNUAL_TAX_LIMIT_LEVEL_1;
  private double annualGrossSalary;

  public void calculateTaxAmountDue(double annualGrossSalary) {
    this.annualGrossSalary = annualGrossSalary;

    if (annualGrossSalary > ANNUAL_TAX_LIMIT_LEVEL_4)
      calculateLevel4Tax();

    if (annualGrossSalary > ANNUAL_TAX_LIMIT_LEVEL_2) {
      calculateLevel2Tax();
      if (annualGrossSalary > ANNUAL_TAX_LIMIT_LEVEL_3)
        calculateLevel3Tax();
    } else if (annualGrossSalary > ANNUAL_TAX_LIMIT_LEVEL_1)
      calculateLevel1Tax();

    if (annualTaxableIncome > 0)
      convertAnnualTaxToMonthly(annualTaxableIncome, annualTaxPayable, annualTaxFreeAllowance);
  }

  public double getMonthlyTaxPayable() {
    return format(monthlyTaxPayable);
  }

  public double getMonthlyTaxableIncome() {
    return format(monthlyTaxableIncome);
  }

  public double getMonthlyTaxFreeAllowance() {
    if (monthlyTaxFreeAllowance <= 0)
      return 0;
    return format(monthlyTaxFreeAllowance);
  }

  private void calculateLevel1Tax() {
    annualTaxableIncome = annualGrossSalary - ANNUAL_TAX_LIMIT_LEVEL_1;
    annualTaxPayable = annualTaxableIncome * TAX_RATE_LEVEL_1;
  }

  private void calculateLevel2Tax() {
    annualTaxableIncome += (annualGrossSalary - ANNUAL_TAX_LIMIT_LEVEL_2) + (ANNUAL_TAX_LIMIT_LEVEL_2 - ANNUAL_TAX_LIMIT_LEVEL_1);
    annualTaxPayable += ((annualGrossSalary - ANNUAL_TAX_LIMIT_LEVEL_2) * TAX_RATE_LEVEL_2) +
            ((ANNUAL_TAX_LIMIT_LEVEL_2 - ANNUAL_TAX_LIMIT_LEVEL_1) * TAX_RATE_LEVEL_1);
  }

  private void calculateLevel3Tax() {
    double tempAnnualGrossSalary = annualGrossSalary;
    while (tempAnnualGrossSalary > ANNUAL_TAX_LIMIT_LEVEL_3) {
      decrementTaxAllowance();
      incrementTax();
      tempAnnualGrossSalary -= 2;
    }
  }

  private void calculateLevel4Tax() {
    annualTaxableIncome = annualGrossSalary - ANNUAL_TAX_LIMIT_LEVEL_4;
    annualTaxPayable = annualTaxableIncome * TAX_RATE_LEVEL_3;
  }

  private void decrementTaxAllowance() {
    if (annualTaxFreeAllowance > 0)
      annualTaxFreeAllowance -= 1;
  }

  private void incrementTax() {
    if (annualTaxableIncome < annualGrossSalary) {
      annualTaxableIncome += 1;
      annualTaxPayable += TAX_RATE_LEVEL_2;
    }
  }

  private void convertAnnualTaxToMonthly(double annualTaxableIncome,
                                         double annualTaxPayable,
                                         double annualTaxFreeAllowance) {
    monthlyTaxableIncome = annualTaxableIncome / MONTHS;
    monthlyTaxPayable = annualTaxPayable / MONTHS;
    monthlyTaxFreeAllowance = annualTaxFreeAllowance / MONTHS;
  }

  private static double format(double preFormat) {
    return FormatDecimals.calculate(preFormat);
  }
}
