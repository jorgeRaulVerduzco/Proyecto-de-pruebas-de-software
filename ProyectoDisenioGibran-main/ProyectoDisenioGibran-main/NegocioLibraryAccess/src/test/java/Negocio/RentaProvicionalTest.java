/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Negocio;

import DTO.RentaDTO;
import java.sql.Date;
import org.bson.types.ObjectId;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author INEGI
 */
public class RentaProvicionalTest {

    public RentaProvicionalTest() {
    }

    /**
     * Test of getRentaProvicional method, of class RentaProvicional.
     */
    @Test
    public void testGetRentaProvicional() {
        //Arrange
        RentaDTO rentaProvicional = new RentaDTO();
        rentaProvicional.setId(new ObjectId());
        rentaProvicional.setFechaRenta(new Date(System.currentTimeMillis()));
        rentaProvicional.setFechaDevolucion(new Date(System.currentTimeMillis()));
        rentaProvicional.setCantidad(3);
        rentaProvicional.setCostoRenta(500.0);
//Act
        RentaProvicional.setRentaProvicional(rentaProvicional);
        RentaDTO resultAfterSet = RentaProvicional.getRentaProvicional();
        //assert
        assertNotNull(resultAfterSet, "La renta provisional no debería ser null después de establecerla.");
        assertEquals(rentaProvicional.getFechaRenta(), resultAfterSet.getFechaRenta(), "La fecha de renta debería coincidir.");
        assertEquals(500.0, resultAfterSet.getCostoRenta(), "El costo de la renta debería ser 500.0.");
    }

    @Test
    public void testSetRentaProvicional() {
        System.out.println("setRentaProvicional");
//Arrenge
        RentaDTO rentaProvicional = new RentaDTO();
        rentaProvicional.setId(new ObjectId());
        rentaProvicional.setFechaRenta(new Date(System.currentTimeMillis()));
        rentaProvicional.setFechaDevolucion(new Date(System.currentTimeMillis()));
        rentaProvicional.setCantidad(5);
        rentaProvicional.setCostoRenta(1000.0);
        //act
        RentaProvicional.setRentaProvicional(rentaProvicional);
        RentaDTO result = RentaProvicional.getRentaProvicional();
        //Assert
        assertNotNull(result, "La renta provisional no debería ser null.");
        assertEquals(rentaProvicional.getId(), result.getId(), "El id de la renta provisional debería coincidir.");
        assertEquals(rentaProvicional.getFechaRenta(), result.getFechaRenta(), "La fecha de renta debería coincidir.");
        assertEquals(rentaProvicional.getFechaDevolucion(), result.getFechaDevolucion(), "La fecha de devolución debería coincidir.");
    }

}
