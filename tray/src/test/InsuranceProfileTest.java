import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import salary_slip.*;

public class InsuranceProfileTest {
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
    public void insuranceProfileCreated() throws Exception {
        assertNotNull(insuranceProfile);
    }

    @Test
    public void calculateInsuranceContributionWhenNotApplicable() throws Exception {
        insuranceProfile.calculateInsuranceContribution(8060.0);
        assertInsuranceContribution(0.0);
    }

    @Test
    public void calculateInsuranceContributionWhenApplicable() throws Exception {
        insuranceProfile.calculateInsuranceContribution(9060.0);
        assertInsuranceContribution(10.00);
    }

    @Test
    public void calculateInsuranceRateWhenNotApplicable() throws Exception {
        insuranceProfile.calculateInsuranceContribution(8060.0);
        assertInsuranceRate(0.0);
    }

    @Test
    public void calculateInsuranceRateWhenApplicable() throws Exception {
        insuranceProfile.calculateInsuranceContribution(9060.0);

        assertInsuranceRate(0.12);
    }
}
