package salary_slip;

import java.math.BigDecimal;
import java.math.RoundingMode;

public final class FormatDecimals {
  private static final int DECIMAL_PLACES = 2;

  private FormatDecimals() {
  }
  public static double calculate(double d) {
    return BigDecimal.valueOf(d).setScale(DECIMAL_PLACES, RoundingMode.HALF_UP).doubleValue();
  }
}
