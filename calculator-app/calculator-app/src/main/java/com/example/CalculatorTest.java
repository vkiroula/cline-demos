package com.example;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        Assertions.assertEquals(5, calc.add(2, 3));
    }

    @Test
    public void testSubtract() {
        Calculator calc = new Calculator();
        Assertions.assertEquals(1, calc.subtract(3, 2));
    }
    @Test
public void testMultiply() {
    Calculator calc = new Calculator();
    Assertions.assertEquals(6, calc.multiply(2, 3));
}
  @Test
    public void testDivideByZero() {
        Calculator calc = new Calculator();
        try {
            calc.divide(5, 0);
            throw new AssertionError("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            if (!"Division by zero is not allowed".equals(e.getMessage())) {
                throw new AssertionError("Expected message: Division by zero is not allowed but was: " + e.getMessage());
            }
        }
    }

}
