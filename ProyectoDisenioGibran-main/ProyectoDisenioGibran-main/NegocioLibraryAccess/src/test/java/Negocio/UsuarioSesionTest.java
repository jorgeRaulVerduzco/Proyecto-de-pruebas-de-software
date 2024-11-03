/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Negocio;

import DTO.UsuarioDTO;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author INEGI
 */
public class UsuarioSesionTest {

    private UsuarioDTO usuarioPrueba;

    public UsuarioSesionTest() {
    }

    @BeforeEach
    public void setUp() {
        usuarioPrueba = new UsuarioDTO("userPrueba", "contraseñaSegura");
    }

    /**
     * Test de usuarioSesion method, de class UsuarioSesion.
     */
    @Test
    public void testUsuarioSesion() {
        System.out.println("usuarioSesion");

        //Act
        UsuarioSesion.setUsuarioSeleccionado(usuarioPrueba);
        UsuarioDTO result = UsuarioSesion.usuarioSesion();
        //assert
        assertEquals(usuarioPrueba.getNombreUsuario(), result.getNombreUsuario(), "El usuario en sesión deberia ser el mismo que el seleccionado.");
        assertEquals(usuarioPrueba.getContraseña(), result.getContraseña(), "La contraseña del usuario en sesion deberia ser la misma que la del usuario seleccionado.");
    }

}
