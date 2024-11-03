/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Negocio;

import DTO.PagoDTO;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author INEGI
 */
public class PagoProvicionalTest {

    private PagoDTO pagoDTO;

    public PagoProvicionalTest() {
    }

    @BeforeEach
    public void setUp() {
        pagoDTO = new PagoDTO();
        pagoDTO.setCostoTotal(100.0);
    }

    /**
     * Test of getPagoProvicional method, of class PagoProvicional.
     */
    @Test
    public void testGetPagoProvicional() {
        System.out.println("getPagoProvicional");
//Arrenge
        PagoDTO expResult = null;
        //Act
        PagoDTO result = PagoProvicional.getPagoProvicional();
        //assert
        assertEquals(expResult, result);

    }

   
}
