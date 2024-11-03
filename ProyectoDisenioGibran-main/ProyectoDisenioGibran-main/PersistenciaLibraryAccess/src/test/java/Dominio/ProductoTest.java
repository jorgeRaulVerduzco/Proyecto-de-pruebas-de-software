/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Dominio;

import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Serva
 */
public class ProductoTest {

    public ProductoTest() {
    }

    /**
     * Test of getIdProdcuto method, of class Producto.
     */
    @Test
    public void testGetIdProdcuto() {
        // Arrange
        ObjectId id = new ObjectId();
        Producto producto = new Producto(id);

        // Act
        ObjectId result = producto.getIdProdcuto();

        // Assert
        assertEquals(id, result, "El ID del producto debería ser el mismo que se estableció");
    }

    /**
     * Test of setIdProdcuto method, of class Producto.
     */
    @Test
    public void testSetIdProdcuto() {
        // Arrange
        Producto producto = new Producto();
        ObjectId id = new ObjectId();

        // Act
        producto.setIdProdcuto(id);

        // Assert
        assertEquals(id, producto.getIdProdcuto(), "El ID del producto debería ser el que se estableció");
    }

    /**
     * Test of getId method, of class Producto.
     */
    @Test
    public void testGetId() {
        // Arrange
    ObjectId expectedId = new ObjectId(); // Genera un nuevo ObjectId
    Producto producto = new Producto(expectedId);
    
    // Act
    ObjectId result = producto.getId();
    
    // Assert
    assertEquals(expectedId, result, "El ID del producto debería ser el que se estableció");
    }

    /**
     * Test of setId method, of class Producto.
     */
    @Test
    public void testSetId() {
        // Arrange
        ObjectId expectedId = new ObjectId(); // Genera un nuevo ObjectId
        Producto producto = new Producto(expectedId);
        
        // Act
        ObjectId result = producto.getId();
        
        // Assert
        assertEquals(expectedId, result, "El ID del producto debería ser el que se estableció");
    }

    /**
     * Test of getIsbn method, of class Producto.
     */
    @Test
    public void testGetIsbn() {
        // Arrange
        Producto producto = new Producto();
        int expectedIsbn = 123456;
        producto.setIsbn(expectedIsbn);

        // Act
        int result = producto.getIsbn();

        // Assert
        assertEquals(expectedIsbn, result, "El ISBN del producto debería ser el que se estableció.");
    }

    /**
     * Test of setIsbn method, of class Producto.
     */
    @Test
    public void testSetIsbn() {
        // Arrange
        Producto producto = new Producto();
        int expectedIsbn = 123456;

        // Act
        producto.setIsbn(expectedIsbn);

        // Assert
        assertEquals(expectedIsbn, producto.getIsbn(), "El ISBN del producto debería ser el que se estableció");
    }

    /**
     * Test of getTitulo method, of class Producto.
     */
    @Test
    public void testGetTitulo() {
        // Arrange
        Producto producto = new Producto();
        String expectedTitulo = "Título de Ejemplo";
        producto.setTitulo(expectedTitulo);

        // Act
        String result = producto.getTitulo();

        // Assert
        assertEquals(expectedTitulo, result, "El título del producto debería ser el que se estableció");
    }

    /**
     * Test of setTitulo method, of class Producto.
     */
    @Test
    public void testSetTitulo() {
        // Arrange
        Producto producto = new Producto();
        String expectedTitulo = "Título de Ejemplo";

        // Act
        producto.setTitulo(expectedTitulo);

        // Assert
        assertEquals(expectedTitulo, producto.getTitulo(), "El título del producto debería ser el que se estableció");
    }

    /**
     * Test of getAutor method, of class Producto.
     */
    @Test
    public void testGetAutor() {
        // Arrange
        Producto producto = new Producto();
        String expectedAutor = "Autor de Ejemplo";
        producto.setAutor(expectedAutor);

        // Act
        String result = producto.getAutor();

        // Assert
        assertEquals(expectedAutor, result, "El autor del producto debería ser el que se estableció");
    }

    /**
     * Test of setAutor method, of class Producto.
     */
    @Test
    public void testSetAutor() {
        // Arrange
        Producto producto = new Producto();
        String expectedAutor = "Autor de Ejemplo";

        // Act
        producto.setAutor(expectedAutor);

        // Assert
        assertEquals(expectedAutor, producto.getAutor(), "El autor del producto debería ser el que se estableció");
    }

    /**
     * Test of getTipo method, of class Producto.
     */
    @Test
    public void testGetTipo() {
        // Arrange
        Producto producto = new Producto();
        String expectedTipo = "Tipo de Ejemplo";
        producto.setTipo(expectedTipo);

        // Act
        String result = producto.getTipo();

        // Assert
        assertEquals(expectedTipo, result, "El tipo del producto debería ser el que se estableció");
    }

    /**
     * Test of setTipo method, of class Producto.
     */
    @Test
    public void testSetTipo() {
        // Arrange
        Producto producto = new Producto();
        String expectedTipo = "Tipo de Ejemplo";

        // Act
        producto.setTipo(expectedTipo);

        // Assert
        assertEquals(expectedTipo, producto.getTipo(), "El tipo del producto debería ser el que se estableció");
    }

    /**
     * Test of getEditorial method, of class Producto.
     */
    @Test
    public void testGetEditorial() {
        // Arrange
        Producto producto = new Producto();
        String expectedEditorial = "Editorial de Ejemplo";
        producto.setEditorial(expectedEditorial);

        // Act
        String result = producto.getEditorial();

        // Assert
        assertEquals(expectedEditorial, result, "La editorial del producto debería ser la que se estableció");
    }

    /**
     * Test of setEditorial method, of class Producto.
     */
    @Test
    public void testSetEditorial() {
        // Arrange
        Producto producto = new Producto();
        String expectedEditorial = "Editorial de Ejemplo";

        // Act
        producto.setEditorial(expectedEditorial);

        // Assert
        assertEquals(expectedEditorial, producto.getEditorial(), "La editorial del producto debería ser la que se estableció");
    }

    /**
     * Test of getPrecio method, of class Producto.
     */
    @Test
    public void testGetPrecio() {
        // Arrange
        Producto producto = new Producto();
        double expectedPrecio = 29.99;
        producto.setPrecio(expectedPrecio);

        // Act
        double result = producto.getPrecio();

        // Assert
        assertEquals(expectedPrecio, result, "El precio del producto debería ser el que se estableció");
    }

    /**
     * Test of setPrecio method, of class Producto.
     */
    @Test
    public void testSetPrecio() {
        // Arrange
        Producto producto = new Producto();
        double expectedPrecio = 29.99;

        // Act
        producto.setPrecio(expectedPrecio);

        // Assert
        assertEquals(expectedPrecio, producto.getPrecio(), "El precio del producto debería ser el que se estableció");
    }

    /**
     * Test of getCategoria method, of class Producto.
     */
    @Test
    public void testGetCategoria() {
        // Arrange
        Producto producto = new Producto();
        String expectedCategoria = "Categoría de Ejemplo";
        producto.setCategoria(expectedCategoria);

        // Act
        String result = producto.getCategoria();

        // Assert
        assertEquals(expectedCategoria, result, "La categoría del producto debería ser la que se estableció");
    }

    /**
     * Test of setCategoria method, of class Producto.
     */
    @Test
    public void testSetCategoria() {
        // Arrange
        Producto producto = new Producto();
        String expectedCategoria = "Categoría de Ejemplo";

        // Act
        producto.setCategoria(expectedCategoria);

        // Assert
        assertEquals(expectedCategoria, producto.getCategoria(), "La categoría del producto debería ser la que se estableció");
    }

    /**
     * Test of getCantidad method, of class Producto.
     */
    @Test
    public void testGetCantidad() {
        // Arrange
        Producto producto = new Producto();
        int expectedCantidad = 10;
        producto.setCantidad(expectedCantidad);

        // Act
        int result = producto.getCantidad();

        // Assert
        assertEquals(expectedCantidad, result, "La cantidad del producto debería ser la que se estableció");
    }

    /**
     * Test of setCantidad method, of class Producto.
     */
    @Test
    public void testSetCantidad() {
        // Arrange
        Producto producto = new Producto();
        int expectedCantidad = 10;

        // Act
        producto.setCantidad(expectedCantidad);

        // Assert
        assertEquals(expectedCantidad, producto.getCantidad(), "La cantidad del producto debería ser la que se estableció");
    }

    /**
     * Test of restarCantidad method, of class Producto.
     */
    @Test
    public void testRestarCantidad() {
        // Arrange
        Producto producto = new Producto();
        producto.setCantidad(10);

        // Act
        producto.restarCantidad(3);

        // Assert
        assertEquals(7, producto.getCantidad(), "La cantidad después de restar debería ser correcta");
    }

    /**
     * Test of getReseñas method, of class Producto.
     */
    @Test
    public void testGetReseñas() {
        // Arrange
        Producto producto = new Producto();
        ArrayList<Reseña> expectedReseñas = new ArrayList<>();
        producto.setReseñas(expectedReseñas);

        // Act
        List<Reseña> result = producto.getReseñas();

        // Assert
        assertEquals(expectedReseñas, result, "La lista de reseñas debería ser la que se estableció");
    }

    /**
     * Test of setReseñas method, of class Producto.
     */
    @Test
    public void testSetReseñas() {
        // Arrange
        Producto producto = new Producto();
        ArrayList<Reseña> expectedReseñas = new ArrayList<>();

        // Act
        producto.setReseñas(expectedReseñas);

        // Assert
        assertEquals(expectedReseñas, producto.getReseñas(), "La lista de reseñas debería ser la que se estableció");
    }

    /**
     * Test of toString method, of class Producto.
     */
    @Test
    public void testToString() {
        // Arrange
        int isbn = 123456;
        String titulo = "Título de Ejemplo";
        String autor = "Autor de Ejemplo";
        String tipo = "Tipo de Ejemplo";
        String editorial = "Editorial de Ejemplo";
        double precio = 29.99;
        String categoria = "Categoría de Ejemplo";
        int cantidad = 10;

        // Act
        Producto producto = new Producto(isbn, titulo, autor, tipo, editorial, precio, categoria, cantidad);

        // Assert
        assertEquals(isbn, producto.getIsbn(), "El ISBN del producto debería ser el que se estableció");
        assertEquals(titulo, producto.getTitulo(), "El título del producto debería ser el que se estableció");
        assertEquals(autor, producto.getAutor(), "El autor del producto debería ser el que se estableció");
        assertEquals(tipo, producto.getTipo(), "El tipo del producto debería ser el que se estableció");
        assertEquals(editorial, producto.getEditorial(), "La editorial del producto debería ser la que se estableció");
        assertEquals(precio, producto.getPrecio(), "El precio del producto debería ser el que se estableció");
        assertEquals(categoria, producto.getCategoria(), "La categoría del producto debería ser la que se estableció");
        assertEquals(cantidad, producto.getCantidad(), "La cantidad del producto debería ser la que se estableció");
    }

}
