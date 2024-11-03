/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package VenderProducto;

import DTO.ProductoDTO;
import Negocio.UsuarioBO;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

/**
 *
 * @author Serva
 */
public class VenderProductoTest {

    public VenderProductoTest() {
    }

    /**
     * Test of agregarProductoVendido method, of class VenderProducto.
     */
    @Test
    public void testAgregarProductoVendido() {
        UsuarioBO usuarioBO = new UsuarioBO(); 
        VenderProducto venderProducto = new VenderProducto(usuarioBO);

        ProductoDTO productoVendido = new ProductoDTO();
        productoVendido.setIsbn(1234);
        productoVendido.setTitulo("La niebla");

        String usuario = "Jorge";

        venderProducto.agregarProductoVendido(usuario, productoVendido);
    }

}
