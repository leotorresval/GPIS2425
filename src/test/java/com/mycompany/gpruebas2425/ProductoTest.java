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
public class ProductoTest {
    
    public ProductoTest() {
    }

    @Test
    public void testSomeMethod() {
        Producto p = new Producto();
        p.setCodigo("001");
        p.setNombre("Nombre");
        p.setDescripcion("Desc");
        p.setCosto(1);
        p.setPrecio(10);
        p.setStock(10);
        assertEquals("001", p.getCodigo());
        assertEquals("Nombre", p.getNombre());
        assertEquals("Desc", p.getDescripcion());
        
    }
    
}
