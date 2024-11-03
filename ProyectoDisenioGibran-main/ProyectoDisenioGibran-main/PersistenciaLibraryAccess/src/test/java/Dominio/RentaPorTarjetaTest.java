/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Dominio;

import java.sql.Date;
import org.bson.types.ObjectId;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Serva
 */
public class RentaPorTarjetaTest {

    public RentaPorTarjetaTest() {
    }

    /**
     * Test of getId method, of class RentaPorTarjeta.
     */
    @Test
    public void testGetId() {
        // Arrange
        ObjectId expectedId = new ObjectId();
        RentaPorTarjeta rentaPorTarjeta = new RentaPorTarjeta(expectedId);

        // Act
        ObjectId result = rentaPorTarjeta.getId();

        // Assert
        assertEquals(expectedId, result, "El ID debería ser el que se estableció");
    }

    /**
     * Test of setId method, of class RentaPorTarjeta.
     */
    @Test
    public void testSetId() {
        // Arrange
        RentaPorTarjeta rentaPorTarjeta = new RentaPorTarjeta();
        ObjectId expectedId = new ObjectId();

        // Act
        rentaPorTarjeta.setId(expectedId);
        ObjectId result = rentaPorTarjeta.getId();

        // Assert
        assertEquals(expectedId, result, "El ID debería ser el que se estableció");
    }

    /**
     * Test of getTipoTarjeta method, of class RentaPorTarjeta.
     */
    @Test
    public void testGetTipoTarjeta() {
        // Arrange
        String expectedTipo = "Visa";
        RentaPorTarjeta rentaPorTarjeta = new RentaPorTarjeta(new ObjectId(), expectedTipo, "1234567890123456", Date.valueOf("2025-12-31"), "123");

        // Act
        String result = rentaPorTarjeta.getTipoTarjeta();

        // Assert
        assertEquals(expectedTipo, result, "El tipo de tarjeta debería ser el que se estableció");
    }

    /**
     * Test of setTipoTarjeta method, of class RentaPorTarjeta.
     */
    @Test
    public void testSetTipoTarjeta() {
        // Arrange
        RentaPorTarjeta rentaPorTarjeta = new RentaPorTarjeta();
        String expectedTipo = "Visa";

        // Act
        rentaPorTarjeta.setTipoTarjeta(expectedTipo);
        String result = rentaPorTarjeta.getTipoTarjeta();

        // Assert
        assertEquals(expectedTipo, result, "El tipo de tarjeta debería ser el que se estableció");
    }

    /**
     * Test of getNumeroTarjeta method, of class RentaPorTarjeta.
     */
    @Test
    public void testGetNumeroTarjeta() {
        // Arrange
        String expectedNumero = "1234567890123456";
        RentaPorTarjeta rentaPorTarjeta = new RentaPorTarjeta(new ObjectId(), "Visa", expectedNumero, Date.valueOf("2025-12-31"), "123");

        // Act
        String result = rentaPorTarjeta.getNumeroTarjeta();

        // Assert
        assertEquals(expectedNumero, result, "El número de tarjeta debería ser el que se estableció");
    }

    /**
     * Test of setNumeroTarjeta method, of class RentaPorTarjeta.
     */
    @Test
    public void testSetNumeroTarjeta() {
        // Arrange
        RentaPorTarjeta rentaPorTarjeta = new RentaPorTarjeta();
        String expectedNumero = "1234567890123456";

        // Act
        rentaPorTarjeta.setNumeroTarjeta(expectedNumero);
        String result = rentaPorTarjeta.getNumeroTarjeta();

        // Assert
        assertEquals(expectedNumero, result, "El número de tarjeta debería ser el que se estableció");
    }

    /**
     * Test of getFechaExpiracion method, of class RentaPorTarjeta.
     */
    @Test
    public void testGetFechaExpiracion() {
        // Arrange
        Date expectedFecha = Date.valueOf("2025-12-31");
        RentaPorTarjeta rentaPorTarjeta = new RentaPorTarjeta(new ObjectId(), "Visa", "1234567890123456", expectedFecha, "123");

        // Act
        Date result = rentaPorTarjeta.getFechaExpiracion();

        // Assert
        assertEquals(expectedFecha, result, "La fecha de expiración debería ser la que se estableció");
    }

    /**
     * Test of setFechaExpiracion method, of class RentaPorTarjeta.
     */
    @Test
    public void testSetFechaExpiracion() {
        // Arrange
        RentaPorTarjeta rentaPorTarjeta = new RentaPorTarjeta();
        Date expectedFecha = Date.valueOf("2025-12-31");

        // Act
        rentaPorTarjeta.setFechaExpiracion(expectedFecha);
        Date result = rentaPorTarjeta.getFechaExpiracion();

        // Assert
        assertEquals(expectedFecha, result, "La fecha de expiración debería ser la que se estableció");
    }

    /**
     * Test of getCodigoSeguridad method, of class RentaPorTarjeta.
     */
    @Test
    public void testGetCodigoSeguridad() {
        // Arrange
        String expectedCodigo = "123";
        RentaPorTarjeta rentaPorTarjeta = new RentaPorTarjeta(new ObjectId(), "Visa", "1234567890123456", Date.valueOf("2025-12-31"), expectedCodigo);

        // Act
        String result = rentaPorTarjeta.getCodigoSeguridad();

        // Assert
        assertEquals(expectedCodigo, result, "El código de seguridad debería ser el que se estableció");
    }

    /**
     * Test of setCodigoSeguridad method, of class RentaPorTarjeta.
     */
    @Test
    public void testSetCodigoSeguridad() {
        // Arrange
        RentaPorTarjeta rentaPorTarjeta = new RentaPorTarjeta();
        String expectedCodigo = "123";

        // Act
        rentaPorTarjeta.setCodigoSeguridad(expectedCodigo);
        String result = rentaPorTarjeta.getCodigoSeguridad();

        // Assert
        assertEquals(expectedCodigo, result, "El código de seguridad debería ser el que se estableció");
    }

    /**
     * Test of toString method, of class RentaPorTarjeta.
     */
    @Test
    public void testToString() {
        // Arrange
    ObjectId id = new ObjectId();
    String tipoTarjeta = "Visa";
    String numeroTarjeta = "1234567890123456";
    Date fechaExpiracion = Date.valueOf("2025-12-31");
    String codigoSeguridad = "123";
    RentaPorTarjeta rentaPorTarjeta = new RentaPorTarjeta(id, tipoTarjeta, numeroTarjeta, fechaExpiracion, codigoSeguridad);

    // Act
    String result = rentaPorTarjeta.toString();

    // Expected output
    String expectedString = "RentaPorTarjeta{id=" + id.toHexString() + ", tipoTarjeta=" + tipoTarjeta + ", numeroTarjeta=" + numeroTarjeta + ", fechaExpiracion=" + fechaExpiracion + ", codigoSeguridad=" + codigoSeguridad + "}";

    // Assert
    assertEquals(expectedString, result, "El método toString debería devolver una representación adecuada");
    }

}
