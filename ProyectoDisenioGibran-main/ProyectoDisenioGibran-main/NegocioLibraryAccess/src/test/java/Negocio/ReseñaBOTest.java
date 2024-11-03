/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Negocio;

import DTO.ProductoDTO;
import DTO.ReseñaDTO;
import DTO.UsuarioDTO;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author INEGI
 */
public class ReseñaBOTest {

    private ReseñaBO reseñaBO;
    private ReseñaDTO reseñaDTO;


    @BeforeEach
    public void setUp() {
        reseñaBO = new ReseñaBO();
        reseñaDTO = new ReseñaDTO();
        reseñaDTO.setReseña("Excelente producto");
        reseñaDTO.setRating(5);
        // Se puede setear el producto y usuario según sea necesario
        ProductoDTO productoDTO = new ProductoDTO();
        productoDTO.setIsbn(12345);
        productoDTO.setTitulo("Test Book");
        productoDTO.setAutor("Test Author");
        productoDTO.setPrecio(299.99);
        productoDTO.setCantidad(1);
        reseñaDTO.setProducto(productoDTO);
        UsuarioDTO usuarioDTO = new UsuarioDTO();
        usuarioDTO.setNombreUsuario("user");
        usuarioDTO.setContraseña("password");
        reseñaDTO.setUsuario(usuarioDTO);
     
    }

    @Test
    public void testGenerarReseña() {
        System.out.println("Prueba de generarReseña");
        //act
        reseñaBO.generarReseña(reseñaDTO);
        //Assert
        assertEquals("user", reseñaDTO.getUsuario().getNombreUsuario());

    }

    @Test
    public void testObtenerReseñasDeProducto() {
        System.out.println("Prueba de obtenerReseñasDeProducto");
        //Act
        List<Object> reseñasObtenidas = reseñaBO.obtenerReseñasDeProducto(12345);
        //assert
        assertNotNull(reseñasObtenidas, "La lista de reseñas no debe ser null");
    }

    @Test
    public void testObtenerReseñasDeUsuario() {
        System.out.println("Prueba de obtenerReseñasDeUsuario");
        //Arrenge
        List<Object> reseñasObtenidas;
        //Act
        reseñasObtenidas = reseñaBO.obtenerReseñasDeUsuario("user");
        System.out.println(reseñasObtenidas);
        //assert
        assertNotNull(reseñasObtenidas, "La lista de reseñas no debe ser null");
    }
}
