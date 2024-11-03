/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Dominio;

import org.bson.types.ObjectId;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Serva
 */
public class ReseñaTest {

    public ReseñaTest() {
    }

    /**
     * Test of getIdReseña method, of class Reseña.
     */
    @Test
    public void testGetIdReseña() {
        //Arrage
        Reseña reseña = new Reseña();
        ObjectId id = new ObjectId();
        //Act
        reseña.setIdReseña(id);
        //Assert
        assertEquals(id, reseña.getIdReseña(), "El ID de la reseña debería ser el mismo que se estableció");
    }

    /**
     * Test of setIdReseña method, of class Reseña.
     */
    @Test
    public void testSetIdReseña() {
        //Arrage
        Reseña reseña = new Reseña();
        ObjectId id = new ObjectId();
        //Act
        reseña.setIdReseña(id);
        //Assert
        assertEquals(id, reseña.getIdReseña(), "El ID de la reseña debería ser el mismo que se estableció");
    }

    /**
     * Test of getReseña method, of class Reseña.
     */
    @Test
    public void testGetReseña() {
        //Arrage
        Reseña reseña = new Reseña();
        String texto = "Una reseña positiva.";
        //Act
        reseña.setReseña(texto);
        //Assert
        assertEquals(texto, reseña.getReseña(), "El texto de la reseña debería ser el mismo que se estableció");
    }

    /**
     * Test of setReseña method, of class Reseña.
     */
    @Test
    public void testSetReseña() {
        //Arrage
        Reseña reseña = new Reseña();
        //Act
        String texto = "Una reseña positiva.";
        reseña.setReseña(texto);
        //Assert
        assertEquals(texto, reseña.getReseña(), "El texto de la reseña debería ser el mismo que se estableció");
    }

    /**
     * Test of getRating method, of class Reseña.
     */
    @Test
    public void testGetRating() {
        //Arrage
        Reseña reseña = new Reseña();
        //Act
        Integer rating = 5;
        reseña.setRating(rating);
        //Assert
        assertEquals(rating, reseña.getRating(), "El rating debería ser el mismo que se estableció");
    }

    /**
     * Test of setRating method, of class Reseña.
     */
    @Test
    public void testSetRating() {
        //Arrage
        Reseña reseña = new Reseña();
        //Act
        Integer rating = 5;
        reseña.setRating(rating);
        //Assert
        assertEquals(rating, reseña.getRating(), "El rating debería ser el mismo que se estableció");
    }

    /**
     * Test of getProducto method, of class Reseña.
     */
    @Test
    public void testGetProducto() {
        //Arrage
        Reseña reseña = new Reseña();
        Producto producto = new Producto();
        //Act
        reseña.setProducto(producto);
        //Assert
        assertEquals(producto, reseña.getProducto(), "El producto debería ser el mismo que se estableció");
    }

    /**
     * Test of setProducto method, of class Reseña.
     */
    @Test
    public void testSetProducto() {
        //Arrage
        Reseña reseña = new Reseña();
        Producto producto = new Producto();
        //Act
        reseña.setProducto(producto);
        //Assert
        assertEquals(producto, reseña.getProducto(), "El producto debería ser el mismo que se estableció");
    }

    /**
     * Test of getUsuario method, of class Reseña.
     */
    @Test
    public void testGetUsuario() {
        //Arrage
        Reseña reseña = new Reseña();
        Usuario usuario = new Usuario();
        //ACT
        reseña.setUsuario(usuario);
        //Assert
        assertEquals(usuario, reseña.getUsuario(), "El usuario debería ser el mismo que se estableció");
    }

    /**
     * Test of setUsuario method, of class Reseña.
     */
    @Test
    public void testSetUsuario() {
        //Arrage
        Reseña reseña = new Reseña();
        Usuario usuario = new Usuario();
        //Act
        reseña.setUsuario(usuario);
        //Assert
        assertEquals(usuario, reseña.getUsuario(), "El usuario debería ser el mismo que se estableció");
    }

    /**
     * Test of toString method, of class Reseña.
     */
    @Test
    public void testToString() {
        // Arrange
        ObjectId id = new ObjectId();
        String texto = "Una reseña positiva.";
        Integer rating = 5;
        Producto producto = new Producto();
        Usuario usuario = new Usuario();

        Reseña reseña = new Reseña();
        reseña.setIdReseña(id);
        reseña.setReseña(texto);
        reseña.setRating(rating);
        reseña.setProducto(producto);
        reseña.setUsuario(usuario);

        // Act
        String result = reseña.toString();
        String expectedString = "Reseña{"
                + "idReseña=" + id
                + ", reseña=" + texto
                + ", rating=" + rating
                + ", producto=" + producto
                + ", usuario=" + usuario
                + '}';

        // Assert
        assertEquals(expectedString, result, "El método toString debería devolver una representación adecuada");
    }

}
