/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Presentacion;

import DTO.ProductoDTO;
import DTO.UsuarioDTO;
import Negocio.UsuarioSesion;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author INEGI
 */
public class VentasProductoTest {

    public VentasProductoTest() {
    }

    @Test
    public void testBtnAgregarProductoActionPerformed() {
        // Arrange
        UsuarioDTO USUARIS = new UsuarioDTO("juan", "jose");
        UsuarioSesion.setUsuarioSeleccionado(USUARIS);
        UsuarioDTO usuarioDTO = UsuarioSesion.usuarioSesion();
        VentasProducto ventasProducto = new VentasProducto();
        ventasProducto.setIsbnTexto("1234");
        ventasProducto.setTituloTexto("Test Book");
        ventasProducto.setAutorTexto("Test Author");
        ventasProducto.setTipoTexto("Test Type");
        ventasProducto.setPrecioTexto("100.0");
        ventasProducto.setCategoriaTexto("Test Category");
        ventasProducto.setEditorialTexto("Test Editorial");
        // Act
        ventasProducto.getBtnAgregarProducto().doClick();
        // Assert
        ProductoDTO productoDTO = new ProductoDTO(
                Integer.parseInt(ventasProducto.getTxtIsbn()),
                ventasProducto.getTxtTitulo(),
                ventasProducto.getTxtAutor(),
                ventasProducto.getTxtTipo(),
                ventasProducto.getTxtEditorial(),  Double.parseDouble(ventasProducto.getTxtPrecio()), ventasProducto.getTxtCategoria(),  Integer.parseInt(ventasProducto.getComboBoxCantidad())
        );
        assertEquals("1234", String.valueOf(productoDTO.getIsbn()));
        assertEquals("Test Book", productoDTO.getTitulo());
    }

}
