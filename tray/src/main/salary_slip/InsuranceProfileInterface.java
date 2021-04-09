package salary_slip;

import org.bson.codecs.pojo.annotations.BsonDiscriminator;

@BsonDiscriminator
public interface InsuranceProfileInterface {
  void calculateInsuranceContribution(double annualGrossSalary);
  double getInsuranceRate();
  double getMonthlyInsuranceContribution();
}
