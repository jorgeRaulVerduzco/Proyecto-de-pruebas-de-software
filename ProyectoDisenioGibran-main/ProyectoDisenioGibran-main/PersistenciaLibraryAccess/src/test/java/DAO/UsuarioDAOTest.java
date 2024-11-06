/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package DAO;

import Dominio.Producto;
import Dominio.Usuario;
import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author INEGI
 */
public class UsuarioDAOTest {

    private UsuarioDAO usuarioDAO;

    @BeforeEach
    public void setUp() {
        usuarioDAO = new UsuarioDAO();
    }

    @Test
    public void testAgregarUsuario() throws Exception {
        System.out.println("agregarUsuario");
        //assert
        Usuario usuario = new Usuario(ObjectId.get(), "testUser", "testPassword");
        // Act
        usuarioDAO.agregarUsuario(usuario);
        // assert
        List<Usuario> usuarios = usuarioDAO.obtenerTodosLosUsuarios();
        assertTrue(usuarios.stream().anyMatch(u -> u.getNombreUsuario().equals("testUser")), "El usuario no fue agregado correctamente.");
    }

    @Test
    public void testAgregarProductoVendido() throws Exception {
        System.out.println("agregarProductoVendido");
        //rrenge
        Usuario usuario = new Usuario(ObjectId.get(), "testUser", "testPassword");
        usuarioDAO.agregarUsuario(usuario);
        Producto productoVendido = new Producto();
        productoVendido.setId(ObjectId.get());
        productoVendido.setIsbn(123456);
        productoVendido.setTitulo("Libro de Prueba");
        productoVendido.setAutor("Autor de Prueba");
        productoVendido.setTipo("Tipo");
        productoVendido.setEditorial("Editorial");
        productoVendido.setPrecio(10.0);
        productoVendido.setCategoria("Categoria");
        productoVendido.setCantidad(5);
        //act
        usuarioDAO.agregarProductoVendido("testUser", productoVendido);
//assert
        List<Producto> productosVendidos = usuarioDAO.obtenerHistorialProductosVendidos("testUser");
        assertTrue(productosVendidos.stream().anyMatch(p -> p.getTitulo().equals("Libro de Prueba")), "El producto vendido no fue agregado correctamente.");
    }

    @Test
    public void testObtenerHistorialProductosVendidos() throws Exception {
        //arrenge
        String nombreUsuario = "testUser";
        List<Producto> expResult = new ArrayList<>();
        Usuario usuario = new Usuario(ObjectId.get(), nombreUsuario, "testPassword");
        usuarioDAO.agregarUsuario(usuario);
        Producto productoVendido = new Producto();
        productoVendido.setId(ObjectId.get());
        productoVendido.setIsbn(123456);
        productoVendido.setTitulo("Libro de Prueba");
        productoVendido.setAutor("Autor de Prueba");
        productoVendido.setTipo("Tipo");
        productoVendido.setEditorial("Editorial");
        productoVendido.setPrecio(10.0);
        productoVendido.setCategoria("Categoria");
        productoVendido.setCantidad(5);
        usuarioDAO.agregarProductoVendido(nombreUsuario, productoVendido);
//act
        List<Producto> result = usuarioDAO.obtenerHistorialProductosVendidos(nombreUsuario);
        expResult.add(productoVendido);
        //assert
        assertNotNull(result, "El resultado no debe ser nulo.");
    }

    @Test
    public void testBuscarUsuario() throws Exception {
        System.out.println("buscarUsuario");
        //asset
        String nombreUsuario = "testUser";
        String contraseña = "testPassword";
        Usuario usuario = new Usuario(ObjectId.get(), nombreUsuario, contraseña);
        //act
        usuarioDAO.agregarUsuario(usuario);
        //assert
        boolean result = usuarioDAO.buscarUsuario(nombreUsuario, contraseña);
        assertTrue(result, "El usuario debería ser encontrado.");
        boolean resultNoExistente = usuarioDAO.buscarUsuario("usuarioInexistente", "contraseña");
        assertFalse(resultNoExistente, "El usuario no debería ser encontrado.");
    }

    @Test
    public void testUsuarioInicioSesion() throws Exception {
        System.out.println("UsuarioInicioSesion");
        String nombreUsuario = "testUser";
        String contraseña = "testPassword";

        Usuario usuario = new Usuario(ObjectId.get(), nombreUsuario, contraseña);
        usuarioDAO.agregarUsuario(usuario);

        Usuario result = usuarioDAO.UsuarioInicioSesion(nombreUsuario, contraseña);
        assertNotNull(result, "El usuario debería iniciar sesión correctamente.");
        assertEquals(nombreUsuario, result.getNombreUsuario(), "El nombre de usuario no coincide.");
    }

    @Test
    public void testObtenerTodosLosUsuarios() throws Exception {
        System.out.println("obtenerTodosLosUsuarios");

        // Agregar un usuario para la prueba
        Usuario usuario = new Usuario(ObjectId.get(), "testUser", "testPassword");
        usuarioDAO.agregarUsuario(usuario);

        List<Usuario> result = usuarioDAO.obtenerTodosLosUsuarios();
        System.out.println(result);
        assertFalse(result.isEmpty(), "La lista de usuarios debería contener al menos un usuario.");
        assertTrue(result.stream().anyMatch(u -> u.getNombreUsuario().equals("testUser")), "El usuario agregado no se encuentra en la lista.");
    }

}
