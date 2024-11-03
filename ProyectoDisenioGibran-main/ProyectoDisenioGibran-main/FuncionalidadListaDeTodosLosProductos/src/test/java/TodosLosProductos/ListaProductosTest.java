/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package TodosLosProductos;

import DTO.ProductoDTO;
import INegocio.IProductoBO;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

/**
 *
 * @author Serva
 */
public class ListaProductosTest {
    
    public ListaProductosTest() {
    }

    /**
     * Test of listaProductos method, of class ListaProductos.
     */
    @Test
    public void testListaProductos() {
        IProductoBO productoBOMock = mock(IProductoBO.class);
        
        ProductoDTO producto1 = new ProductoDTO();
        producto1.setIsbn(123);
        producto1.setTitulo("Producto 1");

        ProductoDTO producto2 = new ProductoDTO();
        producto2.setIsbn(456);
        producto2.setTitulo("Producto 2");
        
        List<ProductoDTO> productosMock = Arrays.asList(producto1,producto2);
        when(productoBOMock.listaProductos()).thenReturn(productosMock);
        
        ListaProductos listaProductos = new ListaProductos(productoBOMock);
        List<ProductoDTO> resultado = listaProductos.listaProductos();
        
        assertEquals(2, resultado.size());
        assertEquals("Producto 1", resultado.get(0).getTitulo());
        assertEquals("Producto 2", resultado.get(1).getTitulo());
        
        
    }
    
}
