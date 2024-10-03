package com.mycompany.gpruebas2425;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    public CalculadoraTest() {
    }

    @Test
    public void testSuma() {
        double a = 10;
        double b = 20;
        assertEquals(30, Calculadora.suma(a, b));
    }

    @Test
    public void testResta() {
        assertEquals(20, Calculadora.resta(30, 10));
    }

    @Test
    public void testMultiplicacion() {
    }

    @Test
    public void testDivision() {
        assertEquals(5, Calculadora.division(10, 2));
    }

    @Test
    public void testDivisionCero() {
        assertThrows(ArithmeticException.class,
                ()->{Calculadora.division(10, 0);});
    }
}
