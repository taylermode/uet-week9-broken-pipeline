package com.lab;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

/**
 * Kiểm thử tính toán cước vận chuyển.
 */
public class ShippingCalculatorTest {
  private final ShippingCalculator calc = new ShippingCalculator();

  @Test
  void testStandard() {
    assertEquals(15000.0, calc.calculate(5, "STANDARD"));
  }

  @Test
  void testExpress() {
    assertEquals(99999.0, calc.calculate(5, "EXPRESS"));
  }

  @Test
  void testInvalidWeight() {
    assertThrows(IllegalArgumentException.class, () -> calc.calculate(-1, "STANDARD"));
  }
}
