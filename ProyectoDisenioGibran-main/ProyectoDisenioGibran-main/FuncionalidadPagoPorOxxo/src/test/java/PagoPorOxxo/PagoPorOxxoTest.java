/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package PagoPorOxxo;

import DTO.PagoPorOxxoDTO;
import Negocio.PagoBO;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 *
 * @author Serva
 */
public class PagoPorOxxoTest {

    public PagoPorOxxoTest() {
    }

    /**
     * Test of comprarProductoPorOxxo method, of class PagoPorOxxo.
     */
    @Test
    public void testComprarProductoPorOxxo() {
        
        PagoBO pagoBOMock = mock(PagoBO.class);
        PagoPorOxxo pagoPorOxxo = new PagoPorOxxo(pagoBOMock);

        PagoPorOxxoDTO pagoDTO = new PagoPorOxxoDTO();

        pagoPorOxxo.comprarProductoPorOxxo(pagoDTO);

        verify(pagoBOMock).ComprarProductoPorOxxo(pagoDTO);
    }

}
