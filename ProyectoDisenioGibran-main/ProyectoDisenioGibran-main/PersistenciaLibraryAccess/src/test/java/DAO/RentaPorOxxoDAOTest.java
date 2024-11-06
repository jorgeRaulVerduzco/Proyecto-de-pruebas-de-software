/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package DAO;

import Dominio.RentaPorOxxo;
import Excepciones.PersistenciaException;
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
public class RentaPorOxxoDAOTest {

    private RentaPorOxxoDAO instance;
    private MongoCollection<RentaPorOxxo> mockedCollection;

    @BeforeEach
    public void setUp() {
        mockedCollection = mock(MongoCollection.class);
        instance = new RentaPorOxxoDAO(mockedCollection); 
    }

    public RentaPorOxxoDAOTest() throws PersistenciaException {
    }

    /**
     * Test of agregarRenta method, of class RentaPorOxxoDAO.
     */
    @Test
    public void testAgregarRenta() throws Exception {
         System.out.println("agregarRenta");
        //arrenge
        RentaPorOxxo renta = new RentaPorOxxo(new ObjectId(), "1234567890123");
        // act
        instance.agregarRenta(renta);
        // Assert
        verify(mockedCollection).insertOne(renta);
    }
    

}
