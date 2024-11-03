/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package DAO;

import Dominio.PagoPorOxxo;
import com.mongodb.client.MongoCollection;
import org.bson.types.ObjectId;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 *
 * @author INEGI
 */
public class PagoPorOxxoDAOTest {

    private PagoPorOxxoDAO instance;
    private MongoCollection<PagoPorOxxo> mockedCollection;

    @BeforeEach
    public void setUp() {
        mockedCollection = mock(MongoCollection.class);
        instance = new PagoPorOxxoDAO(mockedCollection);
    }

    /**
     * Test of agregarPago method, of class PagoPorOxxoDAO.
     */
    @Test
    public void testAgregarPago() throws Exception {
        System.out.println("agregarPago");

        // Arrenge
        PagoPorOxxo pago = new PagoPorOxxo(new ObjectId(), "123456789012");

        //Act
        instance.agregarPago(pago);

        // Assert
        verify(mockedCollection).insertOne(pago);
    }

}
