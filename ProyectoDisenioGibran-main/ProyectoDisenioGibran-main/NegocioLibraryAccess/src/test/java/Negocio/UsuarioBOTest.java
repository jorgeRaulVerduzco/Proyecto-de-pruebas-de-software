/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Negocio;

import DTO.ProductoDTO;
import DTO.UsuarioDTO;
import Dominio.Producto;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author INEGI
 */
public class UsuarioBOTest {

    private UsuarioBO usuarioBO;

    public UsuarioBOTest() {
        usuarioBO = new UsuarioBO();
    }

    @Test
    public void testAgregarUsuario() {
        System.out.println("agregarUsuario");
        //arrenge
        UsuarioDTO usuarioDTO = new UsuarioDTO("testUser", "testPassword");
        usuarioDTO.setProductos(new ArrayList<>());

//Act
        usuarioBO.agregarUsuario(usuarioDTO);

//Assert
        assertTrue(usuarioBO.buscarUsuario("testUser", "testPassword"));
    }

    @Test
    public void testBuscarUsuario() {
        System.out.println("buscarUsuario");
        //arrenge
        String nombreUsuario = "testUser";
        String contraseña = "testPassword";
        UsuarioDTO usuarioDTO = new UsuarioDTO(nombreUsuario, contraseña);
        usuarioDTO.setProductos(new ArrayList<>());
        usuarioBO.agregarUsuario(usuarioDTO);

        //act
        boolean expResult = true;
        boolean result = usuarioBO.buscarUsuario(nombreUsuario, contraseña);
        System.out.println(result);
        //Assert
        assertEquals(expResult, result);
    }

    @Test
    public void testUsuarioInicioSesion() {
        System.out.println("UsuarioInicioSesion");
        //arrenge
        String nombreUsuario = "testUser";
        String contraseña = "testPassword";
        UsuarioDTO usuarioDTO = new UsuarioDTO(nombreUsuario, contraseña);
        usuarioDTO.setProductos(new ArrayList<>());
        //act
        usuarioBO.agregarUsuario(usuarioDTO);
        UsuarioDTO expResult = new UsuarioDTO(nombreUsuario, contraseña);
        UsuarioDTO result = usuarioBO.UsuarioInicioSesion(nombreUsuario, contraseña);
        //assert
        assertEquals(expResult.getNombreUsuario(), result.getNombreUsuario());
        assertEquals(expResult.getContraseña(), result.getContraseña());
    }

    @Test
    public void testAgregarProductoVendido() {
        //Arrenge
        System.out.println("agregarProductoVendido");
        String nombreUsuario = "testUser";
        String contraseña = "testPassword";
        UsuarioDTO usuarioDTO = new UsuarioDTO(nombreUsuario, contraseña);
        usuarioDTO.setProductos(new ArrayList<>());
        //act
        usuarioBO.agregarUsuario(usuarioDTO);
        ProductoDTO productoVendido = new ProductoDTO(123456, "TestProduct", "Test Author", "Book", "Test Editorial", 19.99, "Test Category", 5);
        usuarioBO.agregarProductoVendido(nombreUsuario, productoVendido);
        List<ProductoDTO> productosVendidos = usuarioBO.obtenerHistorialProductosVendidos(nombreUsuario);
        //assert
        assertFalse(productosVendidos.isEmpty());
        assertEquals(productoVendido.getTitulo().toLowerCase(), productosVendidos.get(0).getTitulo().toLowerCase());
    }

    @Test
    public void testObtenerHistorialProductosVendidos() {
        //arrenge
        System.out.println("obtenerHistorialProductosVendidos");
        String nombreUsuario = "testUser";
        String contraseña = "testPassword";
        UsuarioDTO usuarioDTO = new UsuarioDTO(nombreUsuario, contraseña);
        usuarioDTO.setProductos(new ArrayList<>());
        //act
        usuarioBO.agregarUsuario(usuarioDTO);
        ProductoDTO productoVendido = new ProductoDTO(123456, "testProduct", "TestAuthor", "Book", "TestEditorial", 19.99, "TestCategory", 5);
        usuarioBO.agregarProductoVendido(nombreUsuario, productoVendido);

        List<ProductoDTO> result = usuarioBO.obtenerHistorialProductosVendidos(nombreUsuario);
        //assert
        assertNotNull(result);
        assertFalse(result.isEmpty());
        assertEquals(productoVendido.getTitulo(), result.get(0).getTitulo());
    }

}
