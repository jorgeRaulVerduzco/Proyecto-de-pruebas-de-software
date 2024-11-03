/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package RentarProducto;

import DTO.RentaDTO;
import DTO.RentaPorOxxoDTO;
import DTO.RentaPorTarjetaDTO;
import INegocio.IRentaBO;
import java.sql.Date;
import org.bson.types.ObjectId;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 *
 * @author Serva
 */
public class RentarProductoTest {

    public RentarProductoTest() {
    }

    /**
     * Test of rentarProducto method, of class RentarProducto.
     */
    @Test
    public void testRentarProducto() {
        IRentaBO mockRentaBO = mock(IRentaBO.class);
        RentarProducto rentarProducto = new RentarProducto(mockRentaBO);

        ObjectId id = new ObjectId();;
        Date fecha = new Date(System.currentTimeMillis());
        Date devolucion = new Date(2024, 12, 15);
        int cantidad = 2;
        double costo = 100.00;
        RentaDTO rentaDTO = new RentaDTO(id, fecha, devolucion, cantidad, costo);

        rentarProducto.rentarProducto(rentaDTO);

        verify(mockRentaBO).rentarProducto(rentaDTO);
    }

    /**
     * Test of rentarProductoPorOxxo method, of class RentarProducto.
     */
    @Test
    public void testRentarProductoPorOxxo() {
        IRentaBO mockRentaBO = mock(IRentaBO.class);
        RentarProducto rentarProducto = new RentarProducto(mockRentaBO);

        String codigo = "12545";
        RentaPorOxxoDTO rentaPorOxxoDTO = new RentaPorOxxoDTO(codigo);

        rentarProducto.rentarProductoPorOxxo(rentaPorOxxoDTO);

        verify(mockRentaBO).rentarProductoPorOxxo(rentaPorOxxoDTO);
    }

    /**
     * Test of rentarProductoPorTarjeta method, of class RentarProducto.
     */
    @Test
    public void testRentarProductoPorTarjeta() {
        IRentaBO mockRentaBO = mock(IRentaBO.class);
        RentarProducto rentarProducto = new RentarProducto(mockRentaBO);
        
        String tipo = "Visa";
        String numero = "123456789";
        Date devolucion = new Date(2029, 12, 15);
        String codigo = "8466";
        RentaPorTarjetaDTO rentaPorTarjetaDTO = new RentaPorTarjetaDTO(tipo, numero, devolucion, codigo);
        
        rentarProducto.rentarProductoPorTarjeta(rentaPorTarjetaDTO);
        
        verify(mockRentaBO).rentarProductoPorTarjeta(rentaPorTarjetaDTO);
        

    }

}
