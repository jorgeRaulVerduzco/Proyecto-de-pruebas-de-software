/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package DAO;

import Dominio.RentaPorTarjeta;
import com.mongodb.client.MongoCollection;
import java.sql.Date;
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
public class RentaPorTarjetaDAOTest {

    private RentaPorTarjetaDAO instance;
    private MongoCollection<RentaPorTarjeta> mockedCollection;

    @BeforeEach
    public void setUp() {
        mockedCollection = mock(MongoCollection.class);
        instance = new RentaPorTarjetaDAO(mockedCollection); 
    }

    @Test
    public void testAgregarRenta() throws Exception {
        System.out.println("agregarRenta");

        RentaPorTarjeta renta = new RentaPorTarjeta(
                new ObjectId(),
                "Visa",
                "4111111111111111",
                new Date(System.currentTimeMillis() + 100000000L),
                "123"
        );

        // Ejecutar el método a probar
        instance.agregarRenta(renta);

        // Verificar que se haya llamado a insertOne con el objeto correcto
        verify(mockedCollection).insertOne(renta);
    }
}
