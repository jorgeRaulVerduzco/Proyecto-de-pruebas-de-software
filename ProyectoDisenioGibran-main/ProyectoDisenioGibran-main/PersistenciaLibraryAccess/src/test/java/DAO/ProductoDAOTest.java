/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package DAO;

import Dominio.Producto;
import java.util.List;
import org.bson.BsonDocument;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author INEGI
 */
public class ProductoDAOTest {

    public ProductoDAOTest() {
    }

    private ProductoDAO productoDAO;
    private Producto producto;

    @BeforeEach
    public void setUp() {
        productoDAO = new ProductoDAO();
        producto = new Producto(123456789, "Libro de Prueba", "Autor de Prueba", "Tipo", "Editorial", 20.0, "Categoria", 10);
    }

    @Test
    public void testActualizarCantidadProducto() throws Exception {
        // Arrenge
        productoDAO.agregarProducto(producto);

        // Act
        int cantidadVendida = 3;
        productoDAO.actualizarCantidadProducto(producto.getIsbn(), cantidadVendida);

        // Assert
        Producto updatedProducto = productoDAO.buscarProductosPorIsbn(producto.getIsbn()).get(0);
        System.out.println(updatedProducto);
        assertEquals(1, updatedProducto.getCantidad(), "La cantidad del producto debe reducirse correctamente");
    }

    @Test
    public void testAgregarProducto() throws Exception {
        // Areenge
        productoDAO.agregarProducto(producto);

        // act
        List<Producto> productosEncontrados = productoDAO.buscarProductosPorIsbn(producto.getIsbn());
        //assert
        assertFalse(productosEncontrados.isEmpty(), "El producto debería haber sido agregado correctamente");
    }

    @Test
    public void testBuscarProductosPorNombre() throws Exception {
//arrenge
        productoDAO.agregarProducto(producto);

        // Act
        List<Producto> resultados = productoDAO.buscarProductosPorNombre("Libro de Prueba");

        // Assert
        assertFalse(resultados.isEmpty(), "Debería encontrar productos con el nombre dado");
        assertEquals("Libro de Prueba", resultados.get(0).getTitulo(), "El título del producto encontrado no coincide");
    }

    @Test
    public void testBuscarProductosPorIsbn() throws Exception {
        // Arrenge
        productoDAO.agregarProducto(producto);

        // Act
        List<Producto> resultados = productoDAO.buscarProductosPorIsbn(producto.getIsbn());

        // assert
        assertFalse(resultados.isEmpty(), "Debería encontrar el producto por su ISBN");
        assertEquals(producto.getIsbn(), resultados.get(0).getIsbn(), "El ISBN del producto encontrado no coincide");
    }

    @Test
    public void testBuscarProductosPorVendedor() throws Exception {
        // Arrenge
        productoDAO.agregarProducto(producto);

        // Act
        List<Producto> resultados = productoDAO.buscarProductosPorVendedor(producto.getEditorial());
        System.out.println(resultados);
        // Assert
        assertFalse(resultados.isEmpty(), "Debería encontrar productos por su vendedor");
        assertEquals(producto.getEditorial(), resultados.get(0).getEditorial(), "La editorial del producto encontrado no coincide");
    }

    @Test
    public void testObtenerTodosProductos() throws Exception {
       // Arrange
    productoDAO.agregarProducto(producto);

    // Act
    List<Producto> productos = productoDAO.obtenerTodosProductos();

    // Assert
    boolean productoEncontrado = false;
    for (Producto p : productos) {
        if (p.getIsbn()==(producto.getIsbn())) { 
            productoEncontrado = true;
            break;
        }
    }
        System.out.println(productos);
    assertTrue(productoEncontrado, "La lista de productos debería incluir el producto agregado");
    }

    @Test
    public void testBuscarProductosPorAutor() throws Exception {
        // Aarrenge
        productoDAO.agregarProducto(producto);

        // Act
        List<Producto> resultados = productoDAO.buscarProductosPorAutor(producto.getAutor());

        // Assert
        assertFalse(resultados.isEmpty(), "Debería encontrar productos por su autor");
        assertEquals(producto.getAutor(), resultados.get(0).getAutor(), "El autor del producto encontrado no coincide");
    }

    @Test
    public void testBuscarProductosPorCategoria() throws Exception {
        // Arrenge
        productoDAO.agregarProducto(producto);

        // Act
        List<Producto> resultados = productoDAO.buscarProductosPorCategoria(producto.getCategoria());

        //assert
        assertFalse(resultados.isEmpty(), "Debería encontrar productos por su categoría");
        assertEquals(producto.getCategoria(), resultados.get(0).getCategoria(), "La categoría del producto encontrado no coincide");
    }
}
