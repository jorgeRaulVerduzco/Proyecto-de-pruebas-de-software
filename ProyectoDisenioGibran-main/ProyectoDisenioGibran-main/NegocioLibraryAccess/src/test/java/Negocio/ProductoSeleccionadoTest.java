/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Negocio;

import DTO.ProductoDTO;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author INEGI
 */
public class ProductoSeleccionadoTest {
    
  
    public ProductoSeleccionadoTest() {
    }

    /**
     * Test of getPersonaSeleccionada method, of class ProductoSeleccionado.
     */
    @Test
    public void testGetPersonaSeleccionada() {
        System.out.println("getPersonaSeleccionada");
//Arrenge
        ProductoDTO result;
        ProductoDTO producto = new ProductoDTO(12345, "Producto Test", "Autor Test", "Tipo Test", "Editorial Test", 9.99, "Categoría Test", 5);
       //Act
        ProductoSeleccionado.setPersonaSeleccionada(producto);

        // assert<
        result = ProductoSeleccionado.getPersonaSeleccionada();
        assertEquals( producto, result);
    }

}
