/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package IniciarSesionFuncionalidad;

import DTO.UsuarioDTO;
import INegocio.IUsuarioBO;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 *
 * @author Serva
 */
public class IniciarSesionFuncionalidadTest {
    
    public IniciarSesionFuncionalidadTest() {
    }

    /**
     * Test of iniciarSesion method, of class IniciarSesionFuncionalidad.
     */
    @Test
    public void testIniciarSesion() {
        IUsuarioBO usuarioBOMock = mock(IUsuarioBO.class);
        when(usuarioBOMock.buscarUsuario("Servando123", "4567")).thenReturn(true);
        
        IniciarSesionFuncionalidad iniciarSesionFuncionalidad = new IniciarSesionFuncionalidad(usuarioBOMock);
        
        assertTrue(iniciarSesionFuncionalidad.iniciarSesion("Servando123", "4567"));
        verify(usuarioBOMock).buscarUsuario("Servando123", "4567");
    }

    /**
     * Test of obtenerUsuarioDTO method, of class IniciarSesionFuncionalidad.
     */
    @Test
    public void testObtenerUsuarioDTO() {
        IUsuarioBO usuarioBOMock = mock(IUsuarioBO.class);
        UsuarioDTO mockUsuarioDTO = new UsuarioDTO();
        mockUsuarioDTO.setNombreUsuario("Servando452");
        
        when(usuarioBOMock.UsuarioInicioSesion("Servando452", "452")).thenReturn(mockUsuarioDTO);
        IniciarSesionFuncionalidad iniciarSesionFuncionalidad = new IniciarSesionFuncionalidad(usuarioBOMock);
        
         UsuarioDTO result = iniciarSesionFuncionalidad.obtenerUsuarioDTO("Servando452", "452");
         
         assertNotNull(result);
         assertEquals("Servando452", result.getNombreUsuario());
         verify(usuarioBOMock).UsuarioInicioSesion("Servando452", "452");
                 
                 
    }
    
}
