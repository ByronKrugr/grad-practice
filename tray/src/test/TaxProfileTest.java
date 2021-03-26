import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import salary_slip.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TaxProfileTest {
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
    public void taxProfileCreated() throws Exception {
        assertNotNull(taxProfile);
    }

    @Test
    public void calculateTaxFreeAllowance() throws Exception {
        taxProfile.calculateTaxAmountDue(12000.0);
        assertTaxFreeAllowance(916.67);
    }

    @Test
    public void calculateTaxableIncome() throws Exception {
        taxProfile.calculateTaxAmountDue(12000.0);
        assertTaxableIncome(83.33);
    }

    @Test
    public void calculateTaxPayableWhenNotApplicable() throws Exception {
        taxProfile.calculateTaxAmountDue(11000.0);
        assertTaxPayable(0.0);
    }

    @Test
    public void calculateTaxPayableWhenApplicable() throws Exception {
        taxProfile.calculateTaxAmountDue(12000.0);
        assertTaxPayable(16.67);
    }

}
