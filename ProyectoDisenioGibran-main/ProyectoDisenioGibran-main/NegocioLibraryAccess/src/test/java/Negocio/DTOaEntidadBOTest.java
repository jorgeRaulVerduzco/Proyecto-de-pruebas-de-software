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
import java.sql.Date;
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
        System.out.println("ConvertirProductoDTO");
//Arrenge
        ProductoDTO productoDTO = new ProductoDTO(123456, "Título de Prueba", "Autor de Prueba", "Tipo de Prueba",
                "Editorial de Prueba", 19.99, "Categoría de Prueba", 10);
        DTOaEntidadBO instance = new DTOaEntidadBO();
//act
        Producto expResult = new Producto(123456, "Título de Prueba", "Autor de Prueba", "Tipo de Prueba",
                "Editorial de Prueba", 19.99, "Categoría de Prueba", 10);
        Producto result = instance.ConvertirProductoDTO(productoDTO);

//asssert
        assertEquals(expResult.getIsbn(), result.getIsbn());
        assertEquals(expResult.getTitulo(), result.getTitulo());
        assertEquals(expResult.getAutor(), result.getAutor());
        assertEquals(expResult.getTipo(), result.getTipo());
        assertEquals(expResult.getEditorial(), result.getEditorial());
        assertEquals(expResult.getPrecio(), result.getPrecio(), 0.01);
        assertEquals(expResult.getCategoria(), result.getCategoria());
        assertEquals(expResult.getCantidad(), result.getCantidad());

    }

    /**
     * Test of ConvertirUsuarioDTO method, of class DTOaEntidadBO.
     */
    @Test
    public void testConvertirUsuarioDTO() {
        System.out.println("ConvertirUsuarioDTO");

//arrenge
        ProductoDTO productoDTO1 = new ProductoDTO(123, "Libro A", "Autor A", "Tipo A", "Editorial A", 19.99, "Categoria A", 5);
        ProductoDTO productoDTO2 = new ProductoDTO(456, "Libro B", "Autor B", "Tipo B", "Editorial B", 29.99, "Categoria B", 3);

        List<ProductoDTO> productosDTO = new ArrayList<>();
        productosDTO.add(productoDTO1);
        productosDTO.add(productoDTO2);

        UsuarioDTO usuarioDTO = new UsuarioDTO("usuario1", "contrasena123");
        usuarioDTO.setProductos(productosDTO);
//act
        DTOaEntidadBO instance = new DTOaEntidadBO();

        Usuario result = instance.ConvertirUsuarioDTO(usuarioDTO);

        Usuario expResult = new Usuario();
        expResult.setNombreUsuario("usuario1");
        expResult.setContraseña("contrasena123");

        List<Producto> productosEsperados = new ArrayList<>();
        for (ProductoDTO pDTO : productosDTO) {
            Producto producto = new Producto(pDTO.getIsbn(), pDTO.getTitulo(), pDTO.getAutor(), pDTO.getTipo(), pDTO.getEditorial(), pDTO.getPrecio(), pDTO.getCategoria(), pDTO.getCantidad());
            productosEsperados.add(producto);
        }
        expResult.setProductosVendidos(productosEsperados);

//assert
        assertEquals(expResult.getNombreUsuario(), result.getNombreUsuario());
        assertEquals(expResult.getContraseña(), result.getContraseña());
        assertEquals(expResult.getProductosVendidos().size(), result.getProductosVendidos().size());

        for (int i = 0; i < expResult.getProductosVendidos().size(); i++) {
            assertEquals(expResult.getProductosVendidos().get(i).getIsbn(), result.getProductosVendidos().get(i).getIsbn());
            assertEquals(expResult.getProductosVendidos().get(i).getTitulo(), result.getProductosVendidos().get(i).getTitulo());
        }
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
        System.out.println("ConnvertirPagoOxxoDTO");

//arrenge
        String codigoBarrasOxxo = "123456789012";
        PagoPorOxxoDTO pagoOxxoDTO = new PagoPorOxxoDTO(codigoBarrasOxxo);

        DTOaEntidadBO instance = new DTOaEntidadBO();

        // Act
        PagoPorOxxo expResult = new PagoPorOxxo();
        expResult.setCodigoBarrasOxxo(codigoBarrasOxxo);
        PagoPorOxxo result = instance.ConnvertirPagoOxxoDTO(pagoOxxoDTO);

//assert
        assertEquals(expResult.getCodigoBarrasOxxo(), result.getCodigoBarrasOxxo());

    }

    /**
     * Test of convertirPagoPorTarjetaDTO method, of class DTOaEntidadBO.
     */
    @Test
    public void testConvertirPagoPorTarjetaDTO() {
      System.out.println("convertirPagoPorTarjetaDTO");

    // arrenge
    String tipoTarjeta = "Visa";
    String numeroTarjeta = "4111111111111111";
    Date fechaExpiracion = new Date(System.currentTimeMillis()); 
    String codigoSeguridad = "123";
    PagoPorTarjetaDTO pagoPorTarjetaDTO = new PagoPorTarjetaDTO(tipoTarjeta, numeroTarjeta, fechaExpiracion, codigoSeguridad);
    DTOaEntidadBO instance = new DTOaEntidadBO();
    
    // Act
    PagoPorTarjeta expResult = new PagoPorTarjeta(tipoTarjeta, numeroTarjeta, fechaExpiracion, codigoSeguridad);
    PagoPorTarjeta result = instance.convertirPagoPorTarjetaDTO(pagoPorTarjetaDTO);
    
    //Assert
    assertEquals(expResult.getTipoTarjeta(), result.getTipoTarjeta());
    assertEquals(expResult.getNumeroTarjeta(), result.getNumeroTarjeta());
    assertEquals(expResult.getFechaExpiracion(), result.getFechaExpiracion());
    assertEquals(expResult.getCodigoSeguridad(), result.getCodigoSeguridad());
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
