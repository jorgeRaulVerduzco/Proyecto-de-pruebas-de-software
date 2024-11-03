/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package AgregaProducto;

import DTO.ProductoDTO;
import static org.mockito.Mockito.*;
import INegocio.IProductoBO;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Serva
 */
public class AgregaProductoTest {

    public AgregaProductoTest() {
    }

    /**
     * Test of agregarProducto method, of class AgregaProducto.
     */
    @Test
    public void testAgregarProducto() {
        IProductoBO productoBOMock = mock(IProductoBO.class);
        doNothing().when(productoBOMock).agregarProducto(any(ProductoDTO.class));
        
        AgregaProducto agregaProducto = new AgregaProducto(productoBOMock);
        ProductoDTO productoDTO = new ProductoDTO(123456789,
                "El misterio del codigo", "Juan Perez", "Novela",
                "Editorial ABC", 299.99, "Ficcion", 20
        );
        agregaProducto.agregarProducto(productoDTO);
        
        verify(productoBOMock).agregarProducto(productoDTO);
    }

}
