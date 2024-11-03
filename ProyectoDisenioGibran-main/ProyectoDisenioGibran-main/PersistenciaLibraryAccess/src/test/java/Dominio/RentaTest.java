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
public class RentaTest {

    public RentaTest() {
    }

    /**
     * Test of getId method, of class Renta.
     */
    @Test
    public void testGetId() {
        // Arrange
        ObjectId expectedId = new ObjectId();
        Renta renta = new Renta(expectedId);

        // Act
        ObjectId result = renta.getId();

        // Assert
        assertEquals(expectedId, result, "El ID de la renta debería ser el que se estableció");
    }

    /**
     * Test of setId method, of class Renta.
     */
    @Test
    public void testSetId() {
        // Arrange
        Renta renta = new Renta();
        ObjectId expectedId = new ObjectId();

        // Act
        renta.setId(expectedId);

        // Assert
        assertEquals(expectedId, renta.getId(), "El ID de la renta debería ser el que se estableció");
    }

    /**
     * Test of getFechaRenta method, of class Renta.
     */
    @Test
    public void testGetFechaRenta() {
        // Arrange
        Renta renta = new Renta();
        Date expectedFechaRenta = new Date(System.currentTimeMillis());
        renta.setFechaRenta(expectedFechaRenta);

        // Act
        Date result = renta.getFechaRenta();

        // Assert
        assertEquals(expectedFechaRenta, result, "La fecha de renta debería ser la que se estableció");
    }

    /**
     * Test of setFechaRenta method, of class Renta.
     */
    @Test
    public void testSetFechaRenta() {
        // Arrange
        Renta renta = new Renta();
        Date expectedFechaRenta = new Date(System.currentTimeMillis());

        // Act
        renta.setFechaRenta(expectedFechaRenta);

        // Assert
        assertEquals(expectedFechaRenta, renta.getFechaRenta(), "La fecha de renta debería ser la que se estableció");
    }

    /**
     * Test of getFechaDevolucion method, of class Renta.
     */
    @Test
    public void testGetFechaDevolucion() {
        // Arrange
        Renta renta = new Renta();
        Date expectedFechaDevolucion = new Date(System.currentTimeMillis() + 86400000);
        renta.setFechaDevolucion(expectedFechaDevolucion);

        // Act
        Date result = renta.getFechaDevolucion();

        // Assert
        assertEquals(expectedFechaDevolucion, result, "La fecha de devolución debería ser la que se estableció");

    }

    /**
     * Test of setFechaDevolucion method, of class Renta.
     */
    @Test
    public void testSetFechaDevolucion() {
        // Arrange
        Renta renta = new Renta();
        Date expectedFechaDevolucion = new Date(System.currentTimeMillis() + 86400000);

        // Act
        renta.setFechaDevolucion(expectedFechaDevolucion);

        // Assert
        assertEquals(expectedFechaDevolucion, renta.getFechaDevolucion(), "La fecha de devolución debería ser la que se estableció");
    }

    /**
     * Test of getCantidad method, of class Renta.
     */
    @Test
    public void testGetCantidad() {
        // Arrange
        Renta renta = new Renta();
        int expectedCantidad = 5;
        renta.setCantidad(expectedCantidad);

        // Act
        int result = renta.getCantidad();

        // Assert
        assertEquals(expectedCantidad, result, "La cantidad debería ser la que se estableció");
    }

    /**
     * Test of setCantidad method, of class Renta.
     */
    @Test
    public void testSetCantidad() {
        // Arrange
        Renta renta = new Renta();
        int expectedCantidad = 5;

        // Act
        renta.setCantidad(expectedCantidad);

        // Assert
        assertEquals(expectedCantidad, renta.getCantidad(), "La cantidad debería ser la que se estableció");
    }

    /**
     * Test of getCostoRenta method, of class Renta.
     */
    @Test
    public void testGetCostoRenta() {
        // Arrange
        Renta renta = new Renta();
        double expectedCosto = 100.0;
        renta.setCostoRenta(expectedCosto);

        // Act
        double result = renta.getCostoRenta();

        // Assert
        assertEquals(expectedCosto, result, "El costo de renta debería ser el que se estableció");
    }

    /**
     * Test of setCostoRenta method, of class Renta.
     */
    @Test
    public void testSetCostoRenta() {
        // Arrange
        Renta renta = new Renta();
        double expectedCosto = 100.0;

        // Act
        renta.setCostoRenta(expectedCosto);

        // Assert
        assertEquals(expectedCosto, renta.getCostoRenta(), "El costo de renta debería ser el que se estableció");
    }

    /**
     * Test of getUsuario method, of class Renta.
     */
    @Test
    public void testGetUsuario() {
        // Arrange
        Renta renta = new Renta();
        List<Usuario> expectedUsuarios = new ArrayList<>();
        expectedUsuarios.add(new Usuario()); // Asegúrate de tener una clase Usuario

        // Act
        renta.setUsuario(expectedUsuarios);
        List<Usuario> result = renta.getUsuario();

        // Assert
        assertEquals(expectedUsuarios, result, "La lista de usuarios debería ser la que se estableció");
    }

    /**
     * Test of setUsuario method, of class Renta.
     */
    @Test
    public void testSetUsuario() {
        // Arrange
        Renta renta = new Renta();
        List<Usuario> expectedUsuarios = new ArrayList<>();
        expectedUsuarios.add(new Usuario()); // Asegúrate de tener una clase Usuario

        // Act
        renta.setUsuario(expectedUsuarios);

        // Assert
        assertEquals(expectedUsuarios, renta.getUsuario(), "La lista de usuarios debería ser la que se estableció");
    }

    /**
     * Test of getProducto method, of class Renta.
     */
    @Test
    public void testGetProducto() {
        // Arrange
        Renta renta = new Renta();
        List<Producto> expectedProductos = new ArrayList<>();
        expectedProductos.add(new Producto(123456, "Título", "Autor", "Tipo", "Editorial", 100.0, "Categoría", 10));

        // Act
        renta.setProducto(expectedProductos);
        List<Producto> result = renta.getProducto();

        // Assert
        assertEquals(expectedProductos, result, "La lista de productos debería ser la que se estableció");
    }

    /**
     * Test of setProducto method, of class Renta.
     */
    @Test
    public void testSetProducto() {
        // Arrange
        Renta renta = new Renta();
        List<Producto> expectedProductos = new ArrayList<>();
        expectedProductos.add(new Producto(123456, "Título", "Autor", "Tipo", "Editorial", 100.0, "Categoría", 10));

        // Act
        renta.setProducto(expectedProductos);

        // Assert
        assertEquals(expectedProductos, renta.getProducto(), "La lista de productos debería ser la que se estableció");
    }

    /**
     * Test of getRentaPorOxxo method, of class Renta.
     */
    @Test
    public void testGetRentaPorOxxo() {
        // Arrange
        Renta renta = new Renta();
        List<RentaPorOxxo> expectedRentaOxxo = new ArrayList<>();
        expectedRentaOxxo.add(new RentaPorOxxo());

        // Act
        renta.setRentaPorOxxo(expectedRentaOxxo);
        List<RentaPorOxxo> result = renta.getRentaPorOxxo();

        // Assert
        assertEquals(expectedRentaOxxo, result, "La lista de renta por Oxxo debería ser la que se estableció");
    }

    /**
     * Test of setRentaPorOxxo method, of class Renta.
     */
    @Test
    public void testSetRentaPorOxxo() {
        // Arrange
        Renta renta = new Renta();
        List<RentaPorOxxo> expectedRentaOxxo = new ArrayList<>();
        expectedRentaOxxo.add(new RentaPorOxxo());

        // Act
        renta.setRentaPorOxxo(expectedRentaOxxo);

        // Assert
        assertEquals(expectedRentaOxxo, renta.getRentaPorOxxo(), "La lista de renta por Oxxo debería ser la que se estableció");
    }

    /**
     * Test of getRentaPorTarjeta method, of class Renta.
     */
    @Test
    public void testGetRentaPorTarjeta() {
        // Arrange
        Renta renta = new Renta();
        List<RentaPorTarjeta> expectedRentaTarjeta = new ArrayList<>();
        expectedRentaTarjeta.add(new RentaPorTarjeta());

        // Act
        renta.setRentaPorTarjeta(expectedRentaTarjeta);
        List<RentaPorTarjeta> result = renta.getRentaPorTarjeta();

        // Assert
        assertEquals(expectedRentaTarjeta, result, "La lista de renta por tarjeta debería ser la que se estableció");
    }

    /**
     * Test of setRentaPorTarjeta method, of class Renta.
     */
    @Test
    public void testSetRentaPorTarjeta() {
        // Arrange
        Renta renta = new Renta();
        List<RentaPorTarjeta> expectedRentaTarjeta = new ArrayList<>();
        expectedRentaTarjeta.add(new RentaPorTarjeta());

        // Act
        renta.setRentaPorTarjeta(expectedRentaTarjeta);

        // Assert
        assertEquals(expectedRentaTarjeta, renta.getRentaPorTarjeta(), "La lista de renta por tarjeta debería ser la que se estableció");
    }

    /**
     * Test of toString method, of class Renta.
     */
    @Test
    public void testToString() {
        // Arrange
        Renta renta = new Renta();
        renta.setId(new ObjectId());
        renta.setFechaRenta(new Date(System.currentTimeMillis()));
        renta.setFechaDevolucion(new Date(System.currentTimeMillis() + 86400000));
        renta.setCantidad(5);
        renta.setCostoRenta(100.0);

        String expectedString = "Renta{id=" + renta.getId()
                + ", fechaRenta=" + renta.getFechaRenta()
                + ", fechaDevolucion=" + renta.getFechaDevolucion()
                + ", cantidad=" + renta.getCantidad()
                + ", costoRenta=" + renta.getCostoRenta()
                + ", usuario=[], producto=[], rentaPorOxxo=[], rentaPorTarjeta=[]}";

        // Act
        String result = renta.toString();

        // Assert
        assertEquals(expectedString, result, "El método toString debería devolver una representación adecuada");
    }

}
