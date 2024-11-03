/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Dominio;

import java.time.LocalDateTime;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Serva
 */
public class TicketTest {

    public TicketTest() {
    }

    /**
     * Test of getIdTicket method, of class Ticket.
     */
    @Test
    public void testGetIdTicket() {
        //Arrage
        Ticket ticket = new Ticket();
        //Act
        ticket.setIdTicket(1);
        //Assert
        assertEquals(1, ticket.getIdTicket(), "El ID del ticket debería ser el mismo que se estableció");
    }

    /**
     * Test of setIdTicket method, of class Ticket.
     */
    @Test
    public void testSetIdTicket() {
        //Arrage
        Ticket ticket = new Ticket();
        //Act
        ticket.setIdTicket(1);
        //Assert
        assertEquals(1, ticket.getIdTicket(), "El ID del ticket debería ser el mismo que se estableció");
    }

    /**
     * Test of getCodigoBarras method, of class Ticket.
     */
    @Test
    public void testGetCodigoBarras() {
        //Arrage
        Ticket ticket = new Ticket();
        //Act
        String codigo = "123456789012";
        ticket.setCodigoBarras(codigo);
        //Assert
        assertEquals(codigo, ticket.getCodigoBarras(), "El código de barras debería ser el mismo que se estableció");
    }

    /**
     * Test of setCodigoBarras method, of class Ticket.
     */
    @Test
    public void testSetCodigoBarras() {
        //Arrage
        Ticket ticket = new Ticket();
        //Act
        String codigo = "123456789012";
        ticket.setCodigoBarras(codigo);
        //Assert
        assertEquals(codigo, ticket.getCodigoBarras(), "El código de barras debería ser el mismo que se estableció");
    }

    /**
     * Test of getPago method, of class Ticket.
     */
    @Test
    public void testGetPago() {
        //Arrage
        Ticket ticket = new Ticket();
        Pago pago = new Pago();
        //Act
        ticket.setPago(pago);
        //Assert
        assertEquals(pago, ticket.getPago(), "El pago debería ser el mismo que se estableció");
    }

    /**
     * Test of setPago method, of class Ticket.
     */
    @Test
    public void testSetPago() {
        //Arrage
        Ticket ticket = new Ticket();
        Pago pago = new Pago();
        //Act
        ticket.setPago(pago);
        //Assert
        assertEquals(pago, ticket.getPago(), "El pago debería ser el mismo que se estableció");
    }

    /**
     * Test of getFechaPago method, of class Ticket.
     */
    @Test
    public void testGetFechaPago() {
        //Arrage
        Ticket ticket = new Ticket();
        LocalDateTime fecha = LocalDateTime.now();
        //Act
        ticket.setFechaPago(fecha);
        //Assert
        assertEquals(fecha, ticket.getFechaPago(), "La fecha de pago debería ser la misma que se estableció");
    }

    /**
     * Test of setFechaPago method, of class Ticket.
     */
    @Test
    public void testSetFechaPago() {
        //Arrage
        Ticket ticket = new Ticket();
        LocalDateTime fecha = LocalDateTime.now();
        //Act
        ticket.setFechaPago(fecha);
        //Assert
        assertEquals(fecha, ticket.getFechaPago(), "La fecha de pago debería ser la misma que se estableció");
    }

    /**
     * Test of toString method, of class Ticket.
     */
    @Test
    public void testToString() {
        // Arrange
        int id = 1;
        String codigoBarras = "123456789012";
        Pago pago = new Pago();
        LocalDateTime fechaPago = LocalDateTime.now();

        Ticket ticket = new Ticket(id, codigoBarras, pago, fechaPago);

        // Act
        String result = ticket.toString();
        String expectedString = "Ticket{"
                + "idTicket=" + id
                + ", codigoBarras='" + codigoBarras + '\''
                + ", pago=" + pago
                + ", fechaPago=" + fechaPago
                + '}';

        // Assert
        assertEquals(expectedString, result, "El método toString debería devolver una representación adecuada");
    }

}
