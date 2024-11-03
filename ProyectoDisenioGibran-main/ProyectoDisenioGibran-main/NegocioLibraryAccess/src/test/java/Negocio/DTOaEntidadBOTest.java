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
import Negocio.DTOaEntidadBO;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
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
     * Test of convertirReseñaDTO method, of class DTOaEntidadBO.
     */
    @Test
    public void testConvertirReseñaDTO() {
        // Arrenge
        ProductoDTO productoDTO = new ProductoDTO(123, "Título del Producto", "Autor del Producto", "Tipo", "Editorial", 29.99, "Categoría", 5);
        UsuarioDTO usuarioDTO = new UsuarioDTO("nombreUsuario", "contraseña");
        usuarioDTO.setProductos(new ArrayList<>());
        ReseñaDTO reseñaDTO = new ReseñaDTO();
        reseñaDTO.setReseña("Esta es una reseña de prueba.");
        reseñaDTO.setRating(5);
        reseñaDTO.setProducto(productoDTO);
        reseñaDTO.setUsuario(usuarioDTO);

        DTOaEntidadBO instance = new DTOaEntidadBO();

        // Act
        Reseña expResult = new Reseña();
        expResult.setReseña(reseñaDTO.getReseña());
        expResult.setRating(reseñaDTO.getRating());
        expResult.setProducto(instance.ConvertirProductoDTO(reseñaDTO.getProducto()));
        expResult.setUsuario(instance.ConvertirUsuarioDTO(reseñaDTO.getUsuario()));
        Reseña result = instance.convertirReseñaDTO(reseñaDTO);

        // Assert
        assertEquals(expResult.getReseña(), result.getReseña());
        assertEquals(expResult.getRating(), result.getRating());
        assertEquals(expResult.getProducto(), result.getProducto());
        assertEquals(expResult.getUsuario(), result.getUsuario());
    }

    /**
     * Test of convertirRentaDTO method, of class DTOaEntidadBO.
     */
    @Test
    public void testConvertirRentaDTO() {
//arrenge
        Date fechaExpiracion = new Date(System.currentTimeMillis());
        RentaDTO rentaDTO = new RentaDTO();
        rentaDTO.setCantidad(5);
        rentaDTO.setCostoRenta(150.0);
        rentaDTO.setFechaRenta(fechaExpiracion);
        rentaDTO.setFechaDevolucion(fechaExpiracion);
        UsuarioDTO usuarioDTO = new UsuarioDTO();
        usuarioDTO.setNombreUsuario("Usuario1");
        usuarioDTO.setContraseña("contraseña");
        rentaDTO.setUsuarioDTO(Arrays.asList(usuarioDTO));
        ProductoDTO productoDTO = new ProductoDTO();
        productoDTO.setIsbn(123456);
        productoDTO.setTitulo("Libro Ejemplo");
        productoDTO.setAutor("Autor Ejemplo");
        rentaDTO.setProductoDTO(Arrays.asList(productoDTO));

        RentaPorOxxoDTO rentaPorOxxoDTO = new RentaPorOxxoDTO("123456789");
        rentaDTO.setRentaPorOxxoDTO(Arrays.asList(rentaPorOxxoDTO));

        RentaPorTarjetaDTO rentaPorTarjetaDTO = new RentaPorTarjetaDTO();
        rentaPorTarjetaDTO.setTipoTarjeta("Visa");
        rentaPorTarjetaDTO.setNumeroTarjeta("1234-5678-9012-3456");
        rentaPorTarjetaDTO.setFechaExpiracion(fechaExpiracion);
        rentaPorTarjetaDTO.setCodigoSeguridad("123");
        rentaDTO.setRentaPorTarjetaDTO(Arrays.asList(rentaPorTarjetaDTO));

//act
        DTOaEntidadBO instance = new DTOaEntidadBO();
        Renta result = instance.convertirRentaDTO(rentaDTO);

//assert
        assertNotNull(result);
        assertEquals(rentaDTO.getCantidad(), result.getCantidad());
        assertEquals(rentaDTO.getCostoRenta(), result.getCostoRenta());
    }

    /**
     * Test of convertitRentaOxxoDTO method, of class DTOaEntidadBO.
     */
    @Test
    public void testConvertitRentaOxxoDTO() {
        System.out.println("convertitRentaOxxoDTO");

//Arrenge
        String codigoBarrasOxxo = "123456789";
        RentaPorOxxoDTO rentaPorOxxoDTO = new RentaPorOxxoDTO(codigoBarrasOxxo);
//act
        DTOaEntidadBO instance = new DTOaEntidadBO();

        RentaPorOxxo result = instance.convertitRentaOxxoDTO(rentaPorOxxoDTO);
        RentaPorOxxo expResult = new RentaPorOxxo();
        expResult.setCodigoBarrasOxxo(codigoBarrasOxxo);

        // assert
        assertEquals(expResult.getCodigoBarrasOxxo(), result.getCodigoBarrasOxxo(), "Los códigos de barras deberían ser iguales.");
    }

    /**
     * Test of convertitRentaPorTarjetaDTO method, of class DTOaEntidadBO.
     */
    @Test
    public void testConvertitRentaPorTarjetaDTO() {
        System.out.println("convertitRentaPorTarjetaDTO");
//ARRENGE
        String tipoTarjeta = "Visa";
        String numeroTarjeta = "4111111111111111";
        Date fechaExpiracion = new Date(System.currentTimeMillis());
        String codigoSeguridad = "123";
        RentaPorTarjetaDTO rentaPorTarjetaDTO = new RentaPorTarjetaDTO(tipoTarjeta, numeroTarjeta, fechaExpiracion, codigoSeguridad);
        DTOaEntidadBO instance = new DTOaEntidadBO();

        // ACT
        RentaPorTarjeta result = instance.convertitRentaPorTarjetaDTO(rentaPorTarjetaDTO);
        RentaPorTarjeta expResult = new RentaPorTarjeta(tipoTarjeta, numeroTarjeta, fechaExpiracion, codigoSeguridad);

        // Assert
        assertEquals(expResult.getTipoTarjeta(), result.getTipoTarjeta(), "El tipo de tarjeta debería ser igual.");
        assertEquals(expResult.getNumeroTarjeta(), result.getNumeroTarjeta(), "El número de tarjeta debería ser igual.");
        assertEquals(expResult.getFechaExpiracion(), result.getFechaExpiracion(), "La fecha de expiración debería ser igual.");
        assertEquals(expResult.getCodigoSeguridad(), result.getCodigoSeguridad(), "El código de seguridad debería ser igual.");
    }

}
