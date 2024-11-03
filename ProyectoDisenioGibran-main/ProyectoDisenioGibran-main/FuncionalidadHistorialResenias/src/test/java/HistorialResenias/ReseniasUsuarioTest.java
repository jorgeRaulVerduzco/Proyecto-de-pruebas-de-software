/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package HistorialResenias;

import INegocio.IReseñaBO;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 *
 * @author Serva
 */
public class ReseniasUsuarioTest {
    
    public ReseniasUsuarioTest() {
    }

    /**
     * Test of obtenerReseñasDeUsuario method, of class ReseniasUsuario.
     */
    @Test
    public void testObtenerReseñasDeUsuario() {
        IReseñaBO reseñaBOMock = mock(IReseñaBO.class);
        
        List<Object> reseñasMock = Arrays.asList("Reseña 1","Reseña 2");
        
        String nombre = "Jorge";
        when(reseñaBOMock.obtenerReseñasDeUsuario(nombre)).thenReturn(reseñasMock);
        
        ReseniasUsuario reseñaUsuario = new ReseniasUsuario(reseñaBOMock);
        List<Object> resultado = reseñaUsuario.obtenerReseñasDeUsuario(nombre);
        
        assertEquals(2, resultado.size());
        assertEquals("Reseña 1", resultado.get(0));
        assertEquals("Reseña 2", resultado.get(1));
        verify(reseñaBOMock).obtenerReseñasDeUsuario(nombre);
    }
    
}
