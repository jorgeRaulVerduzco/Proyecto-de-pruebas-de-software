/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package RegistrarUsuarioFuncionalidad;

import DTO.UsuarioDTO;
import INegocio.IUsuarioBO;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

/**
 *
 * @author Serva
 */
public class RegistrarUsuarioFuncionalidadTest {
    
    public RegistrarUsuarioFuncionalidadTest() {
    }

    /**
     * Test of registrarNuevoUsuario method, of class RegistrarUsuarioFuncionalidad.
     */
    @Test
    public void testRegistrarNuevoUsuario() {
        //arrenge
        IUsuarioBO usuarioBOMock = mock(IUsuarioBO.class);
        RegistrarUsuarioFuncionalidad registrarFuncionalidad = new RegistrarUsuarioFuncionalidad(usuarioBOMock);
        UsuarioDTO usuarioDTO = new UsuarioDTO();
        //act
        usuarioDTO.setNombreUsuario("Servando");
        registrarFuncionalidad.registrarNuevoUsuario(usuarioDTO);
       //assert
        verify(usuarioBOMock).agregarUsuario(usuarioDTO);
    }
    
}
