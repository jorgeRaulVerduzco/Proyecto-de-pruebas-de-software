/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Dominio;

import org.bson.types.ObjectId;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Serva
 */
public class RentaPorOxxoTest {

    public RentaPorOxxoTest() {
    }

    /**
     * Test of getId method, of class RentaPorOxxo.
     */
    @Test
    public void testGetId() {
        // Arrange
        ObjectId expectedId = new ObjectId();
        RentaPorOxxo rentaPorOxxo = new RentaPorOxxo(expectedId);

        // Act
        ObjectId result = rentaPorOxxo.getId();

        // Assert
        assertEquals(expectedId, result, "El ID debería ser el que se estableció");
    }

    /**
     * Test of setId method, of class RentaPorOxxo.
     */
    @Test
    public void testSetId() {
        // Arrange
        RentaPorOxxo rentaPorOxxo = new RentaPorOxxo();
        ObjectId expectedId = new ObjectId();

        // Act
        rentaPorOxxo.setId(expectedId);
        ObjectId result = rentaPorOxxo.getId();

        // Assert
        assertEquals(expectedId, result, "El ID debería ser el que se estableció");
    }

    /**
     * Test of getCodigoBarrasOxxo method, of class RentaPorOxxo.
     */
    @Test
    public void testGetCodigoBarrasOxxo() {
        // Arrange
        String expectedCodigo = "1234567890123";
        RentaPorOxxo rentaPorOxxo = new RentaPorOxxo(new ObjectId(), expectedCodigo);

        // Act
        String result = rentaPorOxxo.getCodigoBarrasOxxo();

        // Assert
        assertEquals(expectedCodigo, result, "El código de barras debería ser el que se estableció");
    }

    /**
     * Test of setCodigoBarrasOxxo method, of class RentaPorOxxo.
     */
    @Test
    public void testSetCodigoBarrasOxxo() {
        // Arrange
        RentaPorOxxo rentaPorOxxo = new RentaPorOxxo();
        String expectedCodigo = "1234567890123";

        // Act
        rentaPorOxxo.setCodigoBarrasOxxo(expectedCodigo);
        String result = rentaPorOxxo.getCodigoBarrasOxxo();

        // Assert
        assertEquals(expectedCodigo, result, "El código de barras debería ser el que se estableció");
    }

    /**
     * Test of toString method, of class RentaPorOxxo.
     */
    @Test
    public void testToString() {
        // Arrange
        ObjectId id = new ObjectId();
        String codigoBarras = "1234567890123";
        RentaPorOxxo rentaPorOxxo = new RentaPorOxxo(id, codigoBarras);

        // Act
        String result = rentaPorOxxo.toString();

        // Expected output
        String expectedString = "RentaPorOxxo{id=" + id + ", codigoBarrasOxxo=" + codigoBarras + "}";

        // Assert
        assertEquals(expectedString, result, "El método toString debería devolver una representación adecuada");
    }

}
