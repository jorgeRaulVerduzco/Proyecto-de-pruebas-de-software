/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ReseñaPorProducto;

import INegocio.IReseñaBO;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Serva
 */
public class ReseñasProductoTest {

    public ReseñasProductoTest() {
    }

    /**
     * Test of obtenerReseñasDeProducto method, of class ReseñasProducto.
     */
    @Test
    public void testObtenerReseñasDeProducto() {
        IReseñaBO mockReseñaBO = mock(IReseñaBO.class);
        ReseñasProducto reseñasProducto = new ReseñasProducto(mockReseñaBO);
        
         int isbn = 123456;
         List<Object> reseñasEsperadas = new ArrayList<>();
         
         when(mockReseñaBO.obtenerReseñasDeProducto(isbn)).thenReturn(reseñasEsperadas);
         
         List<Object> reseñasObtenidas = reseñasProducto.obtenerReseñasDeProducto(isbn);
         
         verify(mockReseñaBO).obtenerReseñasDeProducto(isbn);
         
         assertEquals(reseñasEsperadas, reseñasObtenidas);
    }

}
