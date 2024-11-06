/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Conexion;

import org.junit.jupiter.api.Test;
import com.mongodb.client.MongoDatabase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Serva
 */
public class ConexionBDTest {
    
    private MongoDatabase database;
    
    @BeforeEach
    public void setUp(){
        //Inicializa la conexion antes de la prueba
        database = ConexionBD.getDatabase();
    }
    
    @AfterEach
    public void tearDown(){
        //Cierra la conexion despues de cada prueba
        ConexionBD.close();
    }
    
    /**
     * Test of getDatabase method, of class ConexionBD.
     */
    @Test
    public void testGetDatabase() {
        //Verifica que la conexion no es nula
        assertNotNull(database, "La base de datos deberia estar inicializada");
        //Verifica que el nombre de la base de datos es correcto
        assertEquals("libraryAccess", database.getName(), 
                "El nombre de la base de datos debe ser 'libraryAccess'");
    }

    /**
     * Test of close method, of class ConexionBD.
     */
    @Test
    public void testClose() {
        //Llama a close() y verifica que la conexion se cierra
        ConexionBD.close();
       
        //Intenta volver a obtener la base de datos y asegurase de que la conexion es nueva
        MongoDatabase newDatabase = ConexionBD.getDatabase();
        assertNotSame(database, newDatabase, 
                "La conexion deberia haberse cerrado y creado nuevamente");
    }
    
}
