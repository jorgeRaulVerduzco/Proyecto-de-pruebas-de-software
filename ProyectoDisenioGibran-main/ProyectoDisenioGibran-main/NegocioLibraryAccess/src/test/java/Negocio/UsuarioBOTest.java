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


}
