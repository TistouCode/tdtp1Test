package com.mathis.calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Set;


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


    @ParameterizedTest
    @CsvSource({
            "0, 1, 1",
            "1, 2, 3",
            "-2, 2, 0",
            "0, 0, 0",
            "-1, -2, -3"
    })
    void testAddParametre(int opG, int opD, int resultatAttendu) {
        assertEquals(resultatAttendu, Calculator.add(opG, opD));
    }


    @Test
    void testEnsembleChiffres() {
        Calculator calc = new Calculator();
        assertEquals(Set.of(6, 7, 9), calc.ensembleChiffres(7679));
        assertEquals(Set.of(1), calc.ensembleChiffres(-11));
        assertEquals(Set.of(0), calc.ensembleChiffres(0));
        assertEquals(Set.of(2, 3, 4), calc.ensembleChiffres(2342));
    }
}