import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import salary_slip.InsuranceProfile;
import salary_slip.InsuranceProfileInterface;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class InsuranceProfileTest {
  InsuranceProfileInterface insuranceProfile;

  // UTILITIES
  private void assertInsuranceContribution(double expected) {
    assertEquals(expected, insuranceProfile.getMonthlyInsuranceContribution(), 0.00);
  }

  private void assertInsuranceRate(double expected) {
    assertEquals(expected, insuranceProfile.getInsuranceRate(), 0.0);
  }

  @BeforeEach
  public void setup() throws Exception {
    insuranceProfile = new InsuranceProfile();
  }

  @Test
  void testInsuranceProfileCreated() throws Exception {
    assertNotNull(insuranceProfile);
  }

  @Test
  void testInsuranceContributionWhenNotApplicable() throws Exception {
    insuranceProfile.calculateInsuranceContribution(8060.0);
    assertInsuranceContribution(0.0);
  }

  @Test
  void testInsuranceContributionWhenApplicable() throws Exception {
    insuranceProfile.calculateInsuranceContribution(9060.0);
    assertInsuranceContribution(10.00);
  }

  @Test
  void testInsuranceRateWhenNotApplicable() throws Exception {
    insuranceProfile.calculateInsuranceContribution(8060.0);
    assertInsuranceRate(0.0);
  }

  @Test
  void testInsuranceRateWhenApplicable() throws Exception {
    insuranceProfile.calculateInsuranceContribution(9060.0);

    assertInsuranceRate(0.12);
  }
}
