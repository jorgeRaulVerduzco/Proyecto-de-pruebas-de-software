/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package PagoPorTarjeta;

import DTO.PagoPorTarjetaDTO;
import INegocio.IPagoBO;
import java.sql.Date;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Serva
 */
public class FuncionalidadPagoPorTarjetaTest {
    
    public FuncionalidadPagoPorTarjetaTest() {
    }

    /**
     * Test of comprarProductoPorTarjeta method, of class FuncionalidadPagoPorTarjeta.
     */
    @Test
    public void testComprarProductoPorTarjeta() {
        IPagoBO mockPagoBO = mock(IPagoBO.class);
        FuncionalidadPagoPorTarjeta funcionalidad = new FuncionalidadPagoPorTarjeta(mockPagoBO);
        
         PagoPorTarjetaDTO pagoPorTarjetaDTO = new PagoPorTarjetaDTO();
         pagoPorTarjetaDTO.setTipoTarjeta("Visa");
         pagoPorTarjetaDTO.setNumeroTarjeta("123456789");
         pagoPorTarjetaDTO.setFechaExpiracion(new Date(2024,10,25));
         pagoPorTarjetaDTO.setCodigoSeguridad("5423");
         
         funcionalidad.comprarProductoPorTarjeta(pagoPorTarjetaDTO);
         
         verify(mockPagoBO).ComprarProductoPorTarjeta(pagoPorTarjetaDTO);
    }
    
}
