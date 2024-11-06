/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Presentacion;

import DTO.UsuarioDTO;
import Negocio.UsuarioSesion;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author INEGI
 */
public class IniciarSesionTest {

    private IniciarSesion iniciarSesion;

    @BeforeEach
    public void setUp() {
        iniciarSesion = new IniciarSesion();
    }

    public IniciarSesionTest() {
    }

    @Test
    public void testInicioSesionCorrecto() {
        // Arrenge
        iniciarSesion.setUsuarioTexto("jose");
        iniciarSesion.setContraseñaTexto("juan");
        //act
        iniciarSesion.simularClicIniciarSesion();
        UsuarioDTO usuarioDTO = new UsuarioDTO(iniciarSesion.getUsuarioTexto(), iniciarSesion.getContraseñaTexto());
        // assert
        assertEquals("jose", usuarioDTO.getNombreUsuario());
        assertEquals("juan", usuarioDTO.getContraseña());

    }

}
