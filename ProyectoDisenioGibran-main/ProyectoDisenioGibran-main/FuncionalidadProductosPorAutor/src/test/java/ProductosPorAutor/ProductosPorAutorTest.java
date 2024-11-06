/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ProductosPorAutor;

import DTO.ProductoDTO;
import INegocio.IProductoBO;
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
public class ProductosPorAutorTest {

    public ProductosPorAutorTest() {
    }

    /**
     * Test of buscarProductosPorAutor method, of class ProductosPorAutor.
     */
    @Test
    public void testBuscarProductosPorAutor() {
        IProductoBO mockProductoBO = mock(IProductoBO.class);
        ProductosPorAutor productosPorAutor = new ProductosPorAutor(mockProductoBO);
        String autor = "Autor 1";
        List<ProductoDTO> productosEsperados = new ArrayList<>();
        productosEsperados.add(new ProductoDTO(1, "Producto 1", "Autor 1", "Tipo 1", "Editorial 1", 100.0, "Categoría 1", 10));
        when(mockProductoBO.buscarProductosPorAutor(autor)).thenReturn(productosEsperados);
        List<ProductoDTO> productosObtenidos = productosPorAutor.buscarProductosPorAutor(autor);
        verify(mockProductoBO).buscarProductosPorAutor(autor);
        assertEquals(productosEsperados, productosObtenidos);
    }

}
