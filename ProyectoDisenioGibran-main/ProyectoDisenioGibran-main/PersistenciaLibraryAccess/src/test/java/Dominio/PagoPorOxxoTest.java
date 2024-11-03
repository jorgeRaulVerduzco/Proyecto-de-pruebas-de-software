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
public class PagoPorOxxoTest {
    
    public PagoPorOxxoTest() {
    }

    /**
     * Test of getCodigoBarrasOxxo method, of class PagoPorOxxo.
     */
    @Test
    public void testGetCodigoBarrasOxxo() {
        //Arrage
        PagoPorOxxo pago = new PagoPorOxxo();
        //Act
        pago.setCodigoBarrasOxxo("123456789012");
        //Assert
        assertEquals("123456789012",pago.getCodigoBarrasOxxo(),"El código de barras debería ser '123456789012'");
    }

    /**
     * Test of setCodigoBarrasOxxo method, of class PagoPorOxxo.
     */
    @Test
    public void testSetCodigoBarrasOxxo() {
        //Arrage
        PagoPorOxxo pago = new PagoPorOxxo();
        //Act
        pago.setCodigoBarrasOxxo("123456789012");
        //Assert
        assertEquals("123456789012",pago.getCodigoBarrasOxxo(),"El código de barras debería haberse establecido correctamente");
    }

    /**
     * Test of getIdOxxo method, of class PagoPorOxxo.
     */
    @Test
    public void testGetIdOxxo() {
        //Arrage
        ObjectId id = new ObjectId();
        //Act
        PagoPorOxxo pago = new PagoPorOxxo(id,"123456789012");
        //Assert
        assertEquals(id, pago.getIdOxxo(), "El ID debería ser el mismo que el proporcionado en el constructor");
    }

    /**
     * Test of setIdOxxo method, of class PagoPorOxxo.
     */
    @Test
    public void testSetIdOxxo() {
        //Arrage
        PagoPorOxxo pago = new PagoPorOxxo();
        ObjectId id = new ObjectId();
        //Act
        pago.setIdOxxo(id);
        //Assert
        assertEquals(id, pago.getIdOxxo(), "El ID debería haberse establecido correctamente");
    }

    /**
     * Test of toString method, of class PagoPorOxxo.
     */
    @Test
    public void testToString() {
        //Arrage
        ObjectId id = new ObjectId();
        PagoPorOxxo pago = new PagoPorOxxo(id, "123456789012");
        //Act
        String expected = "PagoPorOxxo{idOxxo=" + id + ", codigoBarrasOxxo=123456789012}";
        //Assert
        assertEquals(expected, pago.toString(), "El método toString() debería devolver la representación correcta del objeto PagoPorOxxo");
    }
    
}
