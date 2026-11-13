package com.lab;

/**
 * Tính toán cước phí vận chuyển hàng hoá theo trọng lượng và hình thức vận chuyển.
 */
public class ShippingCalculator {
  /**
   * Tính cước vận chuyển theo trọng lượng và loại hình vận chuyển.
   *
   * @param weight Trọng lượng đơn hàng tính theo kg
   * @param type   Hình thức vận chuyển ("STANDARD" hoặc "EXPRESS")
   * @return Tổng chi phí cước vận chuyển
   */
  public double calculate(double weight, String type) {
    if (weight <= 0) {
      throw new IllegalArgumentException("Weight must be positive");
    }
    if ("EXPRESS".equals(type)) {
      return weight * 5000 + 20000;
    }
    if ("STANDARD".equals(type)) {
      return weight * 3000;
    }
    throw new IllegalArgumentException("Unknown type: " + type);
  }
}
