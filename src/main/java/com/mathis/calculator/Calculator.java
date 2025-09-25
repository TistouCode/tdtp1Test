package com.mathis.calculator;

import java.util.HashSet;
import java.util.Set;

public class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public static int divide(int a, int b) {
        return a / b;
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
