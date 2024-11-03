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
public class UsuarioTest {

    public UsuarioTest() {
    }

    /**
     * Test of getIdUsuario method, of class Usuario.
     */
    @Test
    public void testGetIdUsuario() {
        //Arrage
        ObjectId id = new ObjectId();
        // Act
        Usuario usuario = new Usuario(id, "testUser", "password");
        // Assert
        assertEquals(id, usuario.getIdUsuario(), "El ID del usuario debería ser el mismo que se estableció");
    }

    /**
     * Test of setIdUsuario method, of class Usuario.
     */
    @Test
    public void testSetIdUsuario() {
        //Arrage
        ObjectId id = new ObjectId();
        Usuario usuario = new Usuario();
        // Act
        usuario.setIdUsuario(id);
        // Assert
        assertEquals(id, usuario.getIdUsuario(), "El ID del usuario debería ser el mismo que se estableció");
    }

    /**
     * Test of getNombreUsuario method, of class Usuario.
     */
    @Test
    public void testGetNombreUsuario() {
        //Arrage
        Usuario usuario = new Usuario();
        // Act
        String nombre = "testUser";
        usuario.setNombreUsuario(nombre);
        // Assert
        assertEquals(nombre, usuario.getNombreUsuario(), "El nombre de usuario debería ser el mismo que se estableció");
    }

    /**
     * Test of setNombreUsuario method, of class Usuario.
     */
    @Test
    public void testSetNombreUsuario() {
        //Arrage
        Usuario usuario = new Usuario();
        // Act
        String nombre = "testUser";
        usuario.setNombreUsuario(nombre);
        // Assert
        assertEquals(nombre, usuario.getNombreUsuario(), "El nombre de usuario debería ser el mismo que se estableció");
    }

    /**
     * Test of getContraseña method, of class Usuario.
     */
    @Test
    public void testGetContraseña() {
        //Arrage
        Usuario usuario = new Usuario();
        // Act
        String contraseña = "password";
        usuario.setContraseña(contraseña);
        // Assert
        assertEquals(contraseña, usuario.getContraseña(), "La contraseña debería ser la misma que se estableció");
    }

    /**
     * Test of setContraseña method, of class Usuario.
     */
    @Test
    public void testSetContraseña() {
        //Arrage
        Usuario usuario = new Usuario();
        // Act
        String contraseña = "password";
        usuario.setContraseña(contraseña);
        // Assert
        assertEquals(contraseña, usuario.getContraseña(), "La contraseña debería ser la misma que se estableció");
    }

    /**
     * Test of getProductosVendidos method, of class Usuario.
     */
    @Test
    public void testGetProductosVendidos() {
        //Arrage
        Usuario usuario = new Usuario();
        List<Producto> productos = new ArrayList<>();
        // Act
        usuario.setProductosVendidos(productos);
        // Assert
        assertEquals(productos, usuario.getProductosVendidos(), "La lista de productos vendidos debería ser la misma que se estableció");
    }

    /**
     * Test of setProductosVendidos method, of class Usuario.
     */
    @Test
    public void testSetProductosVendidos() {
        //Arrage
        Usuario usuario = new Usuario();
        List<Producto> productos = new ArrayList<>();
        // Act
        usuario.setProductosVendidos(productos);
        // Assert
        assertEquals(productos, usuario.getProductosVendidos(), "La lista de productos vendidos debería ser la misma que se estableció");
    }

    /**
     * Test of toString method, of class Usuario.
     */
    @Test
    public void testToString() {
        // Arrange
        ObjectId id = new ObjectId();
        String nombreUsuario = "testUser";
        String contraseña = "password";
        List<Producto> productosVendidos = new ArrayList<>();

        Usuario usuario = new Usuario(id, nombreUsuario, contraseña);
        usuario.setProductosVendidos(productosVendidos);

        // Act
        String result = usuario.toString();
        String expectedString = "Usuario{"
                + "idUsuario=" + id
                + ", nombreUsuario=" + nombreUsuario
                + ", contrasenia=" + contraseña
                + ", productosVendidos=" + productosVendidos
                + '}';

        // Assert
        assertEquals(expectedString, result, "El método toString debería devolver una representación adecuada");
    }
}
