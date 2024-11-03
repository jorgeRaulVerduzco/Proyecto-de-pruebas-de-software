/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ProductosPorNombre;

import DTO.ProductoDTO;
import INegocio.IProductoBO;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 *
 * @author Serva
 */
public class ProductosPorNombreTest {
    
    public ProductosPorNombreTest() {
    }

    /**
     * Test of buscarProductosPorNombre method, of class ProductosPorNombre.
     */
    @Test
    public void testBuscarProductosPorNombre() {
        IProductoBO productoBOMock = mock(IProductoBO.class);
        
        String titulo1 = "La niebla";
        String titulo2 = "La odisea";
        ProductoDTO libro1 = new ProductoDTO();
        libro1.setTitulo(titulo1);
        ProductoDTO libro2 = new ProductoDTO();
        libro2.setTitulo(titulo2);
        
        List<ProductoDTO> productoMock = Arrays.asList(libro1,libro2);
        
        when(productoBOMock.buscarProductosPorNombre("La")).thenReturn(productoMock);
        
        ProductosPorNombre productoPorNombre = new ProductosPorNombre(productoBOMock);
        List<ProductoDTO> resultado = productoPorNombre.buscarProductosPorNombre("La");
        
        verify(productoBOMock).buscarProductosPorNombre("La");
        assertNotNull(resultado);
        assertEquals(2, resultado.size());
        assertEquals(titulo1, resultado.get(0).getTitulo());
        assertEquals(titulo2, resultado.get(1).getTitulo());
    }
    
}
