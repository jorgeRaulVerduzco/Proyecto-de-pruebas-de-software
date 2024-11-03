/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package GenerarReseña;

import DTO.ProductoDTO;
import DTO.ReseñaDTO;
import DTO.UsuarioDTO;
import INegocio.IReseñaBO;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Serva
 */
public class GenerarReseñaTest {
    
    public GenerarReseñaTest() {
    }

    /**
     * Test of GenerarReseña method, of class GenerarReseña.
     */
    @Test
    public void testGenerarReseña() {
        IReseñaBO reseñaBOMock = mock(IReseñaBO.class);
        GenerarReseña generarReseña = new GenerarReseña(reseñaBOMock);
        
        ProductoDTO productoDTO = new ProductoDTO();
        productoDTO.setIsbn(1234);
        productoDTO.setTitulo("Producto");
        
        UsuarioDTO usuarioDTO = new UsuarioDTO();
        usuarioDTO.setNombreUsuario("Jorge");
        
        ReseñaDTO reseñaDTO = new ReseñaDTO();
        reseñaDTO.setReseña("Exelente producto");
        reseñaDTO.setRating(5);
        reseñaDTO.setProducto(productoDTO);
        reseñaDTO.setUsuario(usuarioDTO);
        
        generarReseña.GenerarReseña(reseñaDTO);
        
        verify(reseñaBOMock).generarReseña(reseñaDTO);
        
    }
    
}
