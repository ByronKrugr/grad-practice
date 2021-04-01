import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import salary_slip.TaxProfile;
import salary_slip.TaxProfileInterface;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class TaxProfileTest {
  private TaxProfileInterface taxProfile;

  // UTILITIES
  private void assertTaxPayable(double expected) {
    assertEquals(expected, taxProfile.getMonthlyTaxPayable(), 0.00);
  }

  private void assertTaxableIncome(double expected) {
    assertEquals(expected, taxProfile.getMonthlyTaxableIncome(), 0.00);
  }

  private void assertTaxFreeAllowance(double expected) {
    assertEquals(expected, taxProfile.getMonthlyTaxFreeAllowance(), 0.00);
  }

  @BeforeEach
  public void setup() throws Exception {
    taxProfile = new TaxProfile();

  }

  @Test
  void testTaxProfileCreated() throws Exception {
    assertNotNull(taxProfile);
  }

  @Test
  void testTaxFreeAllowanceWhenApplicable() throws Exception {
    taxProfile.calculateTaxAmountDue(12000.0);
    assertTaxFreeAllowance(916.67);
  }

  @Test
  void testTaxableIncomeWhenApplicable() throws Exception {
    taxProfile.calculateTaxAmountDue(12000.0);
    assertTaxableIncome(83.33);
  }

  @Test
  void testTaxPayableWhenNotApplicable() throws Exception {
    taxProfile.calculateTaxAmountDue(11000.0);
    assertTaxPayable(0.0);
  }

  @Test
  void testTaxPayableWhenApplicable() throws Exception {
    taxProfile.calculateTaxAmountDue(12000.0);
    assertTaxPayable(16.67);
  }

}
