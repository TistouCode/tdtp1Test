package com.mathis.calculator;

import java.util.HashSet;
import java.util.Set;

public class Calculator {
    public int add(int opG, int opD) {
        long result = (long) opG + (long) opD;
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            throw new ArithmeticException("Overflow lors de l'addition");
        }
        return (int) result;
    }

    public int divide(int opG, int opD) {
        if (opD == 0) {
            throw new ArithmeticException("Division par zéro");
        }
        return opG / opD;
    }

    public Set<Integer> ensembleChiffres(int pNombre) {
        Set<Integer> chiffres = new HashSet<>();
        int n = Math.abs(pNombre);
        if (n == 0) {
            chiffres.add(0);
        }
        while (n > 0) {
            chiffres.add(n % 10);
            n /= 10;
        }
        return chiffres;
    }

}
