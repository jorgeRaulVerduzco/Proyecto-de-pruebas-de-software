/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ProductosDelUsuario;

import DTO.ProductoDTO;
import INegocio.IPagoBO;
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
public class ProductosUsuarioTest {
    
    public ProductosUsuarioTest() {
    }

    /**
     * Test of consultarProductosCompradosPorUsuario method, of class ProductosUsuario.
     */
    @Test
    public void testConsultarProductosCompradosPorUsuario() {
        IPagoBO mockPagoBO = mock(IPagoBO.class);
        ProductosUsuario productosUsuario = new ProductosUsuario(mockPagoBO);
        
        String nombre = "Jorge";
        List<ProductoDTO> productosEsperados = new ArrayList();
        productosEsperados.add(new ProductoDTO(1, "Producto 1", "Autor 1", "Tipo 1", "Editorial 1", 100.0, "Categoría 1", 10));
        
        when(mockPagoBO.consultarProductosCompradosPorUsuario(nombre)).thenReturn(productosEsperados);
        
         List<ProductoDTO> productosObtenidos = productosUsuario.consultarProductosCompradosPorUsuario(nombre);
        
        verify(mockPagoBO).consultarProductosCompradosPorUsuario(nombre);
        
        assertEquals(productosEsperados, productosObtenidos);
    }
    
}
