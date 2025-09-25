package com.mathis.calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;


class CalculatorTest {
    private Calculator calc;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }

    @AfterEach
    void tearDown() {
        calc = null;
    }

    @Test
    void testAdd() {
        assertEquals(5, calc.add(2, 3));
        assertEquals(0, calc.add(-2, 2));
    }

    @Test
    void testDivide() {
        assertEquals(2, calc.divide(6, 3));
        assertEquals(0, calc.divide(0, 5));
    }
}