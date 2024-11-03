/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Dominio;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Serva
 */
public class PagoTest {

    public PagoTest() {
    }

    /**
     * Test of getFechaDePago method, of class Pago.
     */
    @Test
    public void testGetFechaDePago() {
        //Arrage
        Pago pago = new Pago();
        Date fecha = Date.valueOf("2023-10-26");
        //Act
        pago.setFechaDePago(fecha);
        //Assert
        assertEquals(fecha, pago.getFechaDePago(), "La fecha de pago deberia ser '2023-10-26'");
    }

    /**
     * Test of setFechaDePago method, of class Pago.
     */
    @Test
    public void testSetFechaDePago() {
        //Arrage
        Pago pago = new Pago();
        Date fecha = Date.valueOf("2023-10-26");
        //Act
        pago.setFechaDePago(fecha);
        //Assert
        assertEquals(fecha, pago.getFechaDePago(), "La fecha de pago deberia haberse establecido correctamente");
    }

    /**
     * Test of getIdPago method, of class Pago.
     */
    @Test
    public void testGetIdPago() {
        //Arrage
        ObjectId id = new ObjectId();
        //Act
        Pago pago = new Pago(id);
        //Assert
        assertEquals(id, pago.getIdPago(), "El ID de pago deberia ser el mismo que el proporcionado en el constructor");
    }

    /**
     * Test of setIdPago method, of class Pago.
     */
    @Test
    public void testSetIdPago() {
        //Arrage
        Pago pago = new Pago();
        ObjectId id = new ObjectId();
        //Act
        pago.setIdPago(id);
        //Assert
        assertEquals(id, pago.getIdPago(), "El ID de pago debería haberse establecido correctamente");
    }

    /**
     * Test of getUsuario method, of class Pago.
     */
    @Test
    public void testGetUsuario() {
        //Arrage
        Pago pago = new Pago();
        List<Usuario> usuarios = new ArrayList<>();
        //Act
        pago.setUsuario(usuarios);
        //Assert
        assertEquals(usuarios, pago.getUsuario(), "La lista de usuarios deberia coincidir con la proporcionada");
    }

    /**
     * Test of setUsuario method, of class Pago.
     */
    @Test
    public void testSetUsuario() {
        //Arrage
        Pago pago = new Pago();
        List<Usuario> usuarios = new ArrayList<>();
        //Act
        pago.setUsuario(usuarios);
        //Assert
        assertEquals(usuarios, pago.getUsuario(), "La lista de usuarios debería haberse establecido correctamente");
    }

    /**
     * Test of getProducto method, of class Pago.
     */
    @Test
    public void testGetProducto() {
        //Arrage
        Pago pago = new Pago();
        List<Producto> productos = new ArrayList<>();
        //Act
        pago.setProducto(productos);
        //Assert
        assertEquals(productos, pago.getProducto(), "La lista de productos debería coincidir con la proporcionada");
    }

    /**
     * Test of setProducto method, of class Pago.
     */
    @Test
    public void testSetProducto() {
        //Arrage
        Pago pago = new Pago();
        List<Producto> productos = new ArrayList<>();
        //Act
        pago.setProducto(productos);
        //Assert
        assertEquals(productos, pago.getProducto(), "La lista de productos debería haberse establecido correctamente");
    }

    /**
     * Test of getCantidad method, of class Pago.
     */
    @Test
    public void testGetCantidad() {
        //Arrage
        Pago pago = new Pago();
        //Act
        int cantidad = 5;
        pago.setCantidad(cantidad);
        //Assert
        assertEquals(cantidad, pago.getCantidad(), "La cantidad debería ser 5");
    }

    /**
     * Test of setCantidad method, of class Pago.
     */
    @Test
    public void testSetCantidad() {
        //Arrage
        Pago pago = new Pago();
        //Act
        int cantidad = 5;
        pago.setCantidad(cantidad);
        //Assert
        assertEquals(cantidad, pago.getCantidad(), "La cantidad debería haberse establecido correctamente");
    }

    /**
     * Test of getCostoTotal method, of class Pago.
     */
    @Test
    public void testGetCostoTotal() {
        //Arrage
        Pago pago = new Pago();
        //Act
        double costo = 100.0;
        pago.setCostoTotal(costo);
        //Assert
        assertEquals(costo, pago.getCostoTotal(), 0.001, "El costo total debería ser 100.0");
    }

    /**
     * Test of setCostoTotal method, of class Pago.
     */
    @Test
    public void testSetCostoTotal() {
        //Arrage
        Pago pago = new Pago();
        //Act
        double costo = 100.0;
        pago.setCostoTotal(costo);
        //Assert
        assertEquals(costo, pago.getCostoTotal(), 0.001, "El costo total debería haberse establecido correctamente");
    }

    /**
     * Test of getPagoPorOxxo method, of class Pago.
     */
    @Test
    public void testGetPagoPorOxxo() {
        //Arrage
        Pago pago = new Pago();
        List<PagoPorOxxo> pagosOxxo = new ArrayList<>();
        //Act
        pago.setPagoPorOxxo(pagosOxxo);
        //Assert
        assertEquals(pagosOxxo, pago.getPagoPorOxxo(), "La lista de pagos por Oxxo debería coincidir con la proporcionada");
    }

    /**
     * Test of setPagoPorOxxo method, of class Pago.
     */
    @Test
    public void testSetPagoPorOxxo() {
        //Arrage
        Pago pago = new Pago();
        List<PagoPorOxxo> pagosOxxo = new ArrayList<>();
        //Act
        pago.setPagoPorOxxo(pagosOxxo);
        //Assert
        assertEquals(pagosOxxo, pago.getPagoPorOxxo(), "La lista de pagos por Oxxo debería haberse establecido correctamente");
    }

    /**
     * Test of getPagoPorTarjeta method, of class Pago.
     */
    @Test
    public void testGetPagoPorTarjeta() {
        //Arrage
        Pago pago = new Pago();
        List<PagoPorTarjeta> pagosTarjeta = new ArrayList<>();
        //Act
        pago.setPagoPorTarjeta(pagosTarjeta);
        //Assert
        assertEquals(pagosTarjeta, pago.getPagoPorTarjeta(), "La lista de pagos por tarjeta debería coincidir con la proporcionada");
    }

    /**
     * Test of setPagoPorTarjeta method, of class Pago.
     */
    @Test
    public void testSetPagoPorTarjeta() {
        //Arrage
        Pago pago = new Pago();
        List<PagoPorTarjeta> pagosTarjeta = new ArrayList<>();
        //Act
        pago.setPagoPorTarjeta(pagosTarjeta);
        //Assert
        assertEquals(pagosTarjeta, pago.getPagoPorTarjeta(), "La lista de pagos por tarjeta debería haberse establecido correctamente");
    }

    /**
     * Test of toString method, of class Pago.
     */
    @Test
    public void testToString() {
        //Arrage
        Pago pago = new Pago();
        ObjectId id = new ObjectId();
        //Act
        pago.setIdPago(id);
        pago.setCantidad(3);
        pago.setCostoTotal(300.0);
        pago.setFechaDePago(Date.valueOf("2023-10-26"));
        
        String expected = "Pago{idPago=" + id + 
                          ", usuario=" + pago.getUsuario() +
                          ", producto=" + pago.getProducto() +
                          ", cantidad=" + pago.getCantidad() +
                          ", costoTotal=" + pago.getCostoTotal() +
                          ", pagoPorOxxo=" + pago.getPagoPorOxxo() +
                          ", pagoPorTarjeta=" + pago.getPagoPorTarjeta() +
                          ", FechaDePago=" + pago.getFechaDePago() + "}";
        //Assert
        assertEquals(expected, pago.toString(), "El método toString() debería devolver la representación correcta del objeto Pago");
    }
}
