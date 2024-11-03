/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package HistorialUsuario;

import DTO.PagoDTO;
import INegocio.IPagoBO;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Serva
 */
public class HistorialUsuarioTest {

    public HistorialUsuarioTest() {
    }

    /**
     * Test of consultarHistorialComprasPorUsuarioMeses method, of class
     * HistorialUsuario.
     */
    @Test
    public void testConsultarHistorialComprasPorUsuarioMeses() {
        IPagoBO pagoBOMock = mock(IPagoBO.class);

        HistorialUsuario historialUsuario = new HistorialUsuario();
        historialUsuario.pagoBO = pagoBOMock; 

        List<Object> pagos = new ArrayList<>();
        pagos.add(new PagoDTO(null, 1, 100.00, new Date(System.currentTimeMillis())));

        when(pagoBOMock.consultarHistorialComprasPorUsuarioMeses("Usuario1", 2024, 3)).thenReturn(pagos);

        List<Object> resultado = historialUsuario.consultarHistorialComprasPorUsuarioMeses("Usuario1", 2024, 3);

        assertNotNull(resultado); 
        assertEquals(1, resultado.size()); 
        assertTrue(resultado.get(0) instanceof PagoDTO); 

        PagoDTO pago = (PagoDTO) resultado.get(0);
        assertEquals(100.00, pago.getCostoTotal());
    }

}
