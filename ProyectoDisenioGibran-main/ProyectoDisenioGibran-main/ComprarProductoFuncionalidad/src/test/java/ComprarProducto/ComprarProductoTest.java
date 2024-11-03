/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ComprarProducto;

import DTO.PagoDTO;
import DTO.PagoPorOxxoDTO;
import DTO.PagoPorTarjetaDTO;
import INegocio.IPagoBO;
import java.sql.Date;
import org.bson.types.ObjectId;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Serva
 */
public class ComprarProductoTest {

    public ComprarProductoTest() {
    }

    /**
     * Test of comprarProducto method, of class ComprarProducto.
     */
    @Test
    public void testComprarProducto() {
        IPagoBO pagoBOMock = mock(IPagoBO.class);
        ComprarProducto comprarProducto = new ComprarProducto(pagoBOMock);

        ObjectId id = new ObjectId();
        int cantidad = 5;
        double costoTotal = 199.99;
        Date fechaDePago = new Date(System.currentTimeMillis());
        PagoDTO pagoDTO = new PagoDTO(id, cantidad, costoTotal, fechaDePago);

        comprarProducto.comprarProducto(pagoDTO);

        verify(pagoBOMock).ComprarProducto(pagoDTO);
    }

    /**
     * Test of comprarProductoPorOxxo method, of class ComprarProducto.
     */
    @Test
    public void testComprarProductoPorOxxo() {
        IPagoBO pagoBOMock = mock(IPagoBO.class);
        ComprarProducto comprarProducto = new ComprarProducto(pagoBOMock);

        PagoPorOxxoDTO pagoPorOxxoDTO = new PagoPorOxxoDTO("123456789");

        comprarProducto.comprarProductoPorOxxo(pagoPorOxxoDTO);

        verify(pagoBOMock).ComprarProductoPorOxxo(pagoPorOxxoDTO);
    }

    /**
     * Test of comprarProductoPorTarjeta method, of class ComprarProducto.
     */
    @Test
    public void testComprarProductoPorTarjeta() {
        IPagoBO pagoBOMock = mock(IPagoBO.class);
        ComprarProducto comprarProducto = new ComprarProducto(pagoBOMock);

        String tipo = "Visa";
        String numero = "12345678";
        Date expiracion = new Date(2029 - 10 - 07);
        String codigo = "0104";
        PagoPorTarjetaDTO pagoPorTarjetaDTO = new PagoPorTarjetaDTO(tipo, numero,
                expiracion, codigo);
        
        comprarProducto.comprarProductoPorTarjeta(pagoPorTarjetaDTO);
        
        verify(pagoBOMock).ComprarProductoPorTarjeta(pagoPorTarjetaDTO);
    }

}
