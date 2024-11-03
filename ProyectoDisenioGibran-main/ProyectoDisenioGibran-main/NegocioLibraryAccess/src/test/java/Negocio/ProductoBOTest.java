/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Negocio;

import DTO.ProductoDTO;
import Dominio.Producto;
import Excepciones.PersistenciaException;
import IDAO.IProductoDAO;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;

/**
 *
 * @author INEGI
 */
public class ProductoBOTest {

    private ProductoBO productoBO;
    private ProductoDTO productoDTO;

    @BeforeEach
    public void setUp() {
        productoBO = new ProductoBO();
        productoDTO = new ProductoDTO(
                123456,
                "El Principito",
                "Antoine de Saint-Exupéry",
                "Libro",
                "Editorial Test",
                299.99,
                "Ficción",
                10
        );
    }

    @Test
    public void testAgregarProducto() {
        // Arrange
        ProductoDTO nuevoProducto = new ProductoDTO(
                789012,
                "1984",
                "George Orwell",
                "Libro",
                "Editorial Test",
                399.99,
                "Ficción",
                5
        );

        // Act
        productoBO.agregarProducto(nuevoProducto);
        List<ProductoDTO> productos = productoBO.buscarProductosPorIsbn(789012);

        // Assert
        assertNotNull( productos);
        assertFalse( productos.isEmpty());
        assertEquals(789012, productos.get(0).getIsbn());
    }

    @Test
    public void testBuscarProductosPorNombre() {
        // Arrange
        productoBO.agregarProducto(productoDTO);

        // Act
        List<ProductoDTO> productos = productoBO.buscarProductosPorNombre("Principito");

        // Assert
        assertNotNull(productos);
        assertFalse(productos.isEmpty());
        assertTrue(
                productos.get(0).getTitulo().contains("Principito"));
    }

    @Test
    public void testBuscarProductosPorIsbn() {
        // Arrange
        productoBO.agregarProducto(productoDTO);

        // Act
        List<ProductoDTO> productos = productoBO.buscarProductosPorIsbn(123456);

        // Assert
        assertNotNull(productos);
        assertFalse(productos.isEmpty());
        assertEquals(123456, productos.get(0).getIsbn());
    }

 
}
