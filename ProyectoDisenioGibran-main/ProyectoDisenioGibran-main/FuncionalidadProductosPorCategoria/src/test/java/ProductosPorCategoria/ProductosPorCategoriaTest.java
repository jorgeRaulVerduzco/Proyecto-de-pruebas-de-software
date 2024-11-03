/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ProductosPorCategoria;

import DTO.ProductoDTO;
import INegocio.IProductoBO;
import java.util.ArrayList;
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
public class ProductosPorCategoriaTest {
    
    public ProductosPorCategoriaTest() {
    }

    /**
     * Test of buscarProductosPorCategoria method, of class ProductosPorCategoria.
     */
    @Test
    public void testBuscarProductosPorCategoria() {
        IProductoBO mockProductoBO = mock(IProductoBO.class);
        ProductosPorCategoria productosPorCategoria = new ProductosPorCategoria(mockProductoBO);
        
        String categoria = "Ficción";
        List<ProductoDTO> productosEsperados = new ArrayList<>();
        productosEsperados.add(new ProductoDTO(1, "Producto 1", "Autor 1", "Tipo 1", "Editorial 1", 100.0, "Ficción", 10));
        
        when(mockProductoBO.buscarProductosPorCategoria(categoria)).thenReturn(productosEsperados);
        
        List<ProductoDTO> productosObtenidos = productosPorCategoria.buscarProductosPorCategoria(categoria);
        
        verify(mockProductoBO).buscarProductosPorCategoria(categoria);
        
        assertEquals(productosEsperados, productosObtenidos);
    }
    
}
