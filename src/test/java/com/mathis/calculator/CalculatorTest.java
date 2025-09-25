package com.mathis.calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;


class CalculatorTest {
    @Test
    void testAdd() {
        assertEquals(5, Calculator.add(2, 3));
        assertEquals(0, Calculator.add(-2, 2));
    }

    @Test
    void testDivide() {
        assertEquals(2, Calculator.divide(6, 3));
        assertEquals(0, Calculator.divide(0, 5));
    }
}