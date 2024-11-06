/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Presentacion;

import DTO.UsuarioDTO;
import javax.swing.JButton;
import javax.swing.JTextField;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author INEGI
 */
public class RegistrarUsuarioTest {

    public RegistrarUsuarioTest() {
    }

    @Test
    public void testBtnAceptarActionPerformed() {
//arrenge
        RegistrarUsuario registrarUsuario = new RegistrarUsuario();
        registrarUsuario.setUsuarioTexto("testUser");
        registrarUsuario.setContraseñaTexto("testPass");

        registrarUsuario.getBtnAceptar().doClick();
//act
        UsuarioDTO usuarioDTO = new UsuarioDTO (registrarUsuario.getTxtNombreUsuario(),registrarUsuario.getTxtContraseña());
//assert
        assertEquals("testUser", usuarioDTO.getNombreUsuario(), "El nombre de usuario no coincide.");
        assertEquals("testPass", usuarioDTO.getContraseña(), "La contraseña no coincide.");
    }

    @Test
    public void testBtnCancelarActionPerformed() {
//Arrenge
        RegistrarUsuario registrarUsuario = new RegistrarUsuario();

//act
        registrarUsuario.getBtnCancelar().doClick();

    }
}
