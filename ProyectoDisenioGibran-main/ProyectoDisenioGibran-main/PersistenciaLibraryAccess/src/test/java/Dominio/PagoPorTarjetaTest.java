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
public class PagoPorTarjetaTest {

    public PagoPorTarjetaTest() {
    }

    /**
     * Test of getIdPagoPorTarjeta method, of class PagoPorTarjeta.
     */
    @Test
    public void testGetIdPagoPorTarjeta() {
        // Arrange
        ObjectId id = new ObjectId();
        // Act
        PagoPorTarjeta pago = new PagoPorTarjeta(id);
        // Assert
        assertEquals(id, pago.getIdPagoPorTarjeta(), "El ID debería ser el mismo que el proporcionado en el constructor");
    }

    /**
     * Test of setIdPagoPorTarjeta method, of class PagoPorTarjeta.
     */
    @Test
    public void testSetIdPagoPorTarjeta() {
        // Arrange
        PagoPorTarjeta pago = new PagoPorTarjeta();
        ObjectId id = new ObjectId();
        // Act
        pago.setIdPagoPorTarjeta(id);
        // Assert
        assertEquals(id, pago.getIdPagoPorTarjeta(), "El ID debería haberse establecido correctamente");
    }

    /**
     * Test of getTipoTarjeta method, of class PagoPorTarjeta.
     */
    @Test
    public void testGetTipoTarjeta() {
        //Arrage
        PagoPorTarjeta pago = new PagoPorTarjeta();
        //Act
        pago.setTipoTarjeta("MasterCard");
        //Assert
        assertEquals("MasterCard", pago.getTipoTarjeta(), "El tipo de tarjeta debería ser 'MasterCard'");
    }

    /**
     * Test of setTipoTarjeta method, of class PagoPorTarjeta.
     */
    @Test
    public void testSetTipoTarjeta() {
        //Arrage
        PagoPorTarjeta pago = new PagoPorTarjeta();
        //Act
        pago.setTipoTarjeta("American Express");
        //Assert
        assertEquals("American Express", pago.getTipoTarjeta(), "El tipo de tarjeta debería haberse establecido correctamente");
    }

    /**
     * Test of getNumeroTarjeta method, of class PagoPorTarjeta.
     */
    @Test
    public void testGetNumeroTarjeta() {
        //Arrage
        PagoPorTarjeta pago = new PagoPorTarjeta();
        //Act
        pago.setNumeroTarjeta("9876543298765432");
        //Assert
        assertEquals("9876543298765432", pago.getNumeroTarjeta(), "El número de tarjeta debería ser '9876543298765432'");
    }

    /**
     * Test of setNumeroTarjeta method, of class PagoPorTarjeta.
     */
    @Test
    public void testSetNumeroTarjeta() {
        //Arrage
        PagoPorTarjeta pago = new PagoPorTarjeta();
        //Act
        pago.setNumeroTarjeta("1234567812345678");
        //Assert
        assertEquals("1234567812345678", pago.getNumeroTarjeta(), "El número de tarjeta debería haberse establecido correctamente");
    }

    /**
     * Test of getFechaExpiracion method, of class PagoPorTarjeta.
     */
    @Test
    public void testGetFechaExpiracion() {
        //Arrage
        Date fecha = Date.valueOf("2024-11-30");
        PagoPorTarjeta pago = new PagoPorTarjeta();
        //Act
        pago.setFechaExpiracion(fecha);
        //Assert
        assertEquals(fecha, pago.getFechaExpiracion(), "La fecha de expiración debería ser '2024-11-30'");
    }

    /**
     * Test of setFechaExpiracion method, of class PagoPorTarjeta.
     */
    @Test
    public void testSetFechaExpiracion() {
        //Arrage
        Date fecha = Date.valueOf("2025-05-31");
        PagoPorTarjeta pago = new PagoPorTarjeta();
        //Act
        pago.setFechaExpiracion(fecha);
        //Assert
        assertEquals(fecha, pago.getFechaExpiracion(), "La fecha de expiración debería haberse establecido correctamente");
    }

    /**
     * Test of getCodigoSeguridad method, of class PagoPorTarjeta.
     */
    @Test
    public void testGetCodigoSeguridad() {
        //Arrage
        PagoPorTarjeta pago = new PagoPorTarjeta();
        //Act
        pago.setCodigoSeguridad("456");
        //Assert
        assertEquals("456", pago.getCodigoSeguridad(), "El código de seguridad debería ser '456'");
    }

    /**
     * Test of setCodigoSeguridad method, of class PagoPorTarjeta.
     */
    @Test
    public void testSetCodigoSeguridad() {
        //Arrage
        PagoPorTarjeta pago = new PagoPorTarjeta();
        //Act
        pago.setCodigoSeguridad("789");
        //Assert
        assertEquals("789", pago.getCodigoSeguridad(), "El código de seguridad debería haberse establecido correctamente");
    }

    /**
     * Test of toString method, of class PagoPorTarjeta.
     */
    @Test
    public void testToString() {
        // Arrange
        ObjectId id = new ObjectId(); 
        // Act
        PagoPorTarjeta pago = new PagoPorTarjeta(id, "Visa", "1234567812345678", Date.valueOf("2025-12-31"), "123");
        String expected = "PagoPorTarjeta{idPagoPorTarjeta=" + id + ", tipoTarjeta=Visa, numeroTarjeta=1234567812345678, fechaExpiracion=2025-12-31, codigoSeguridad=123}";
        // Assert
        assertEquals(expected, pago.toString(), "El método toString() debería devolver la representación correcta del objeto PagoPorTarjeta");
    }

}
