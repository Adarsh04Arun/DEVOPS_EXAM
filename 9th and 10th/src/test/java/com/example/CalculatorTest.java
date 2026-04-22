package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void testMultiplication() {
        assertEquals(6, calculator.multiply(2, 3));
    }
    @Test
    void testSubtraction() {
        assertEquals(1, calculator.subtract(2,3));
    }
    @Test
    public void testDivide() {
        int result = cal.divide(10, 2);
        assertEquals(5, result);
    }
    @Test
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> {
            cal.divide(10, 0);
        });
}
}
