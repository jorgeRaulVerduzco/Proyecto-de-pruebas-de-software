/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ProductosVendidos;

import DTO.ProductoDTO;
import Negocio.UsuarioBO;
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
public class ProductosVendidosTest {

    public ProductosVendidosTest() {
    }

    /**
     * Test of buscarProductosPorVendedor method, of class ProductosVendidos.
     */
    @Test
    public void testBuscarProductosPorVendedor() {
        UsuarioBO mockUsuarioBO = mock(UsuarioBO.class);
        ProductosVendidos productosVendidos = new ProductosVendidos(mockUsuarioBO);

        String vendedor = "Juan";
        List<ProductoDTO> productosEsperados = new ArrayList<>();
        productosEsperados.add(new ProductoDTO(1, "Producto 1", "Autor 1", "Tipo 1", "Editorial 1", 100.0, "Categoría 1", 10));
        
        when(mockUsuarioBO.obtenerHistorialProductosVendidos(vendedor)).thenReturn(productosEsperados);
        
         List<ProductoDTO> productosObtenidos = productosVendidos.buscarProductosPorVendedor(vendedor);
         
         verify(mockUsuarioBO).obtenerHistorialProductosVendidos(vendedor);
         
         assertEquals(productosEsperados, productosObtenidos);
    }

}
