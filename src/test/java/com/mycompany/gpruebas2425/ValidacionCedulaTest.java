/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.gpruebas2425;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User
 */
public class ValidacionCedulaTest {

    public ValidacionCedulaTest() {
    }

    @Test
    public void cedulaValida() {
        assertEquals(true, ValidacionCedula.validar("1804373767"));
    }

    @Test
    public void cedulaNoValida() {
        assertEquals(false, ValidacionCedula.validar("1804373766"));
    }

    @Test
    public void longitudCorrecta() {
        assertEquals(true, ValidacionCedula.validar("1804373767"));
    }
    
        @Test
    public void longitudInCorrecta() {
        assertEquals(false, ValidacionCedula.validar("18043737697"));
    }

    @Test
    public void rangoCedulasValidas() {
        assertEquals(true, ValidacionCedula.validar("1804373767"));
    }
    
    @Test
    public void rangoCedulasNoValidas() {
        assertEquals(false, ValidacionCedula.validar("4444444444"));
    }
    
    @Test
    public void rangoCedulasNoValidasMenor() {
        assertEquals(false, ValidacionCedula.validar("0044444444"));
    }

    @Test
    public void digitoVerificadorCorrecto() {
        assertEquals(true, ValidacionCedula.validar("1804373767"));
    }

    @Test
    public void soloNumeros() {
        assertEquals(false, ValidacionCedula.validar("180A373767"));
    }

    @Test
    public void cedulaTerminadaEnCero() {
        assertEquals(true, ValidacionCedula.validar("1729224400"));
    }
    
    
    @Test
    public void cedulaTercerDigitoIncorrecto() {
        assertEquals(false, ValidacionCedula.validar("1789224400"));
    }
    
    
}
