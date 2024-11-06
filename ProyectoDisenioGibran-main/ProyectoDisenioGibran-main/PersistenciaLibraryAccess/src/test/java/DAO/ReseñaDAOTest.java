/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package DAO;

import Dominio.Producto;
import Dominio.Reseña;
import Dominio.Usuario;

import org.bson.types.ObjectId;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Map;

public class ReseñaDAOTest {

    private ReseñaDAO reseñaDAO;
    private Reseña reseña;
    private Producto producto;
    private Usuario usuario;

    @BeforeEach
    public void setUp() {
        reseñaDAO = new ReseñaDAO();
        usuario = new Usuario(new ObjectId(), "usuarioPrueba", "contraseña");
        producto = new Producto(123456, "Título de prueba", "Autor de prueba", "Tipo de prueba", "Editorial de prueba", 19.99, "Categoría de prueba", 10);
        reseña = new Reseña();
        reseña.setUsuario(usuario);
        reseña.setProducto(producto);
        reseña.setReseña("Esta es una reseña de prueba.");
        reseña.setRating(5);

        // Genera la reseña para asegurarte de que esté disponible
        try {
            reseñaDAO.generarReseña(reseña);
        } catch (Exception e) {
            fail("Error al generar reseña en setUp: " + e.getMessage());
        }
    }

    @Test
    public void testGenerarReseña() throws Exception {
        System.out.println("testGenerarReseña");

        // Act
        List<Object> reseñasProducto = reseñaDAO.obtenerReseñasDeProducto(producto.getIsbn());
        // Assert
        System.out.println(reseñasProducto);
        assertNotNull(reseñasProducto);
        assertFalse(reseñasProducto.isEmpty(), "No se obtuvieron reseñas del producto.");
        Map<String, Object> primeraReseña = (Map<String, Object>) reseñasProducto.get(0);
        assertEquals("Esta es una reseña de prueba.", primeraReseña.get("reseña"));
        assertEquals(5, ((Number) primeraReseña.get("rating")).intValue(), "El rating esperado es 5.");
    }

    @Test
    public void testObtenerReseñasDeProducto() throws Exception {
        System.out.println("testObtenerReseñasDeProducto");
        // Act
        List<Object> reseñasProducto = reseñaDAO.obtenerReseñasDeProducto(producto.getIsbn());
        // Assert
        assertNotNull(reseñasProducto, "La lista de reseñas no debe ser nula.");
        assertFalse(reseñasProducto.isEmpty(), "No se obtuvieron reseñas del producto.");
        Map<String, Object> primeraReseña = (Map<String, Object>) reseñasProducto.get(0);
        assertEquals("Esta es una reseña de prueba.", primeraReseña.get("reseña"), "La reseña no es la esperada.");
        assertEquals(5, ((Number) primeraReseña.get("rating")).intValue(), "El rating esperado es 5.");
    }

    @Test
    public void testObtenerReseñasDeUsuario() throws Exception {
        System.out.println("testObtenerReseñasDeUsuario");
        // Arrange
        String nombreUsuario = usuario.getNombreUsuario(); // Usar el nombre de usuario creado en setUp
        ReseñaDAO instance = new ReseñaDAO();

        // Act
        List<Object> reseñasUsuario = instance.obtenerReseñasDeUsuario(nombreUsuario);
        assertNotNull(reseñasUsuario, "La lista de reseñas del usuario no debe ser nula.");
        System.out.println("Número de reseñas encontradas para el usuario " + nombreUsuario + ": " + reseñasUsuario.size());
        for (Object reseña : reseñasUsuario) {
            System.out.println(reseña);
        }
        if (!reseñasUsuario.isEmpty()) {
            Map<String, Object> primeraReseña = (Map<String, Object>) reseñasUsuario.get(0); // Cast a Map
            Object rating = primeraReseña.get("rating");
            // Assert
            assertNotNull(rating, "El rating no debe ser nulo.");
            assertTrue(rating instanceof Number, "El rating debe ser un número.");
            assertEquals(5, ((Number) rating).intValue(), "El rating esperado es 5.");
        } else {
            System.out.println("No se encontraron reseñas para el usuario " + nombreUsuario + ".");
            // assertTrue(true, "No se encontraron reseñas, lo que es esperado en este contexto."); // Descomentar si esto es esperado
        }
    }

}
