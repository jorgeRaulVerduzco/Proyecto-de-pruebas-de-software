/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package DAO;

import Dominio.PagoPorTarjeta;
import Excepciones.PersistenciaException;
import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 *
 * @author INEGI
 */
public class PagoPorTarjetaDAOTest {
   private PagoPorTarjetaDAO instance;
    private MongoCollection<PagoPorTarjeta> mockedCollection;

    @BeforeEach
    public void setUp() {
        mockedCollection = mock(MongoCollection.class);
        instance = new PagoPorTarjetaDAO(mockedCollection);
    }

    /**
     * Test of agregarPago method, of class PagoPorTarjetaDAO.
     */
    @Test
    public void testAgregarPago() throws Exception {
        System.out.println("agregarPago");
        //arrenge
        Date fechaSql = new Date(System.currentTimeMillis());
        PagoPorTarjeta pagoPorTarjeta = new PagoPorTarjeta(
                new ObjectId(),
                "Visa",
                "1234567890123456",
                fechaSql,
                "123"
        );
//act
        instance.agregarPago(pagoPorTarjeta);
//assert
        verify(mockedCollection).insertOne(pagoPorTarjeta);
    }

   
}
