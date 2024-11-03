/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Negocio;

import DTO.PagoDTO;
import DTO.PagoPorOxxoDTO;
import DTO.PagoPorTarjetaDTO;
import DTO.ProductoDTO;
import DTO.RentaDTO;
import DTO.RentaPorOxxoDTO;
import DTO.RentaPorTarjetaDTO;
import DTO.ReseñaDTO;
import DTO.TicketDTO;
import DTO.UsuarioDTO;
import Dominio.Pago;
import Dominio.PagoPorOxxo;
import Dominio.PagoPorTarjeta;
import Dominio.Producto;
import Dominio.Renta;
import Dominio.RentaPorOxxo;
import Dominio.RentaPorTarjeta;
import Dominio.Reseña;
import Dominio.Ticket;
import Dominio.Usuario;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author INEGI
 */
public class DTOaEntidadBOTest {

    public DTOaEntidadBOTest() {
    }

    /**
     * Test of ConvertirProductoDTO method, of class DTOaEntidadBO.
     */
    @Test
    public void testConvertirProductoDTO() {
      
    }

    /**
     * Test of ConvertirUsuarioDTO method, of class DTOaEntidadBO.
     */
    @Test
    public void testConvertirUsuarioDTO() {
        System.out.println("ConvertirUsuarioDTO");
    }

    /**
     * Test of ConvertirPagoDTO method, of class DTOaEntidadBO.
     */
    @Test
    public void testConvertirPagoDTO() {

    }

    /**
     * Test of ConnvertirPagoOxxoDTO method, of class DTOaEntidadBO.
     */
    @Test
    public void testConnvertirPagoOxxoDTO() {
     
    }

    /**
     * Test of convertirPagoPorTarjetaDTO method, of class DTOaEntidadBO.
     */
    @Test
    public void testConvertirPagoPorTarjetaDTO() {
        System.out.println("convertirPagoPorTarjetaDTO");
        PagoPorTarjetaDTO pagoPorTarjetaDTO = null;
        DTOaEntidadBO instance = new DTOaEntidadBO();
        PagoPorTarjeta expResult = null;
        PagoPorTarjeta result = instance.convertirPagoPorTarjetaDTO(pagoPorTarjetaDTO);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertirTicketDTO method, of class DTOaEntidadBO.
     */
    @Test
    public void testConvertirTicketDTO() {
        System.out.println("convertirTicketDTO");
        TicketDTO ticketDTO = null;
        DTOaEntidadBO instance = new DTOaEntidadBO();
        Ticket expResult = null;
        Ticket result = instance.convertirTicketDTO(ticketDTO);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertirReseñaDTO method, of class DTOaEntidadBO.
     */
    @Test
    public void testConvertirReseñaDTO() {
        System.out.println("convertirRese\u00f1aDTO");
        ReseñaDTO reseñaDTO = null;
        DTOaEntidadBO instance = new DTOaEntidadBO();
        Reseña expResult = null;
        Reseña result = instance.convertirReseñaDTO(reseñaDTO);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertirRentaDTO method, of class DTOaEntidadBO.
     */
    @Test
    public void testConvertirRentaDTO() {
        System.out.println("convertirRentaDTO");
        RentaDTO rentaDTO = null;
        DTOaEntidadBO instance = new DTOaEntidadBO();
        Renta expResult = null;
        Renta result = instance.convertirRentaDTO(rentaDTO);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertitRentaOxxoDTO method, of class DTOaEntidadBO.
     */
    @Test
    public void testConvertitRentaOxxoDTO() {
        System.out.println("convertitRentaOxxoDTO");
        RentaPorOxxoDTO rentaPorOxxoDTO = null;
        DTOaEntidadBO instance = new DTOaEntidadBO();
        RentaPorOxxo expResult = null;
        RentaPorOxxo result = instance.convertitRentaOxxoDTO(rentaPorOxxoDTO);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertitRentaPorTarjetaDTO method, of class DTOaEntidadBO.
     */
    @Test
    public void testConvertitRentaPorTarjetaDTO() {
        System.out.println("convertitRentaPorTarjetaDTO");
        RentaPorTarjetaDTO rentaPorTarjetaDTO = null;
        DTOaEntidadBO instance = new DTOaEntidadBO();
        RentaPorTarjeta expResult = null;
        RentaPorTarjeta result = instance.convertitRentaPorTarjetaDTO(rentaPorTarjetaDTO);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
