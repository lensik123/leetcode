package org.example;

import static org.example.Calculator.division;
import static org.example.Calculator.multiplication;
import static org.example.Calculator.subtraction;
import static org.example.Calculator.sum;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

  @Test
  public void testSum() {
    Assert.assertEquals(5, sum(2, 3));
  }

  @Test
  public void testSubtraction() {
    Assert.assertEquals(3, subtraction(10, 7));
  }

  @Test
  public void testMultiplication() {
    Assert.assertEquals(6, multiplication(2, 3));
  }

  @Test
  public void testDivision() {
    Assert.assertEquals(2, division(6, 3));
  }

  @Test
  public void testDivisionThrowsArithmeticException() {
    Assert.assertThrows(ArithmeticException.class, () -> division(6, 0));
  }

}