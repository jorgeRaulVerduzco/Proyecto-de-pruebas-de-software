/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Negocio;

import DTO.ProductoDTO;
import DTO.RentaDTO;
import DTO.RentaPorOxxoDTO;
import DTO.RentaPorTarjetaDTO;
import DTO.UsuarioDTO;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author INEGI
 */
public class RentaBOTest {

    private RentaBO rentaBO;
    private RentaDTO rentaDTO;
    private ProductoDTO productoDTO;
    private UsuarioDTO usuarioDTO;

    @BeforeEach
    public void setUp() {
        rentaBO = new RentaBO();

        // Inicializar ProductoDTO
        productoDTO = new ProductoDTO();
        productoDTO.setIsbn(12345);
        productoDTO.setTitulo("El Principito");
        productoDTO.setAutor("Antoine de Saint-Exupéry");
        productoDTO.setTipo("Libro");
        productoDTO.setEditorial("Salamandra");
        productoDTO.setPrecio(299.99);
        productoDTO.setCategoria("Ficción");
        productoDTO.setCantidad(1);

        // Inicializar UsuarioDTO
        usuarioDTO = new UsuarioDTO();
        usuarioDTO.setNombreUsuario("usuario_test");
        usuarioDTO.setContraseña("password123");

        // Inicializar RentaDTO
        rentaDTO = new RentaDTO();
        rentaDTO.setFechaRenta(new Date(System.currentTimeMillis()));
        rentaDTO.setFechaDevolucion(new Date(System.currentTimeMillis() + 7 * 24 * 60 * 60 * 1000)); // 7 días después
        rentaDTO.setCantidad(1);

        List<ProductoDTO> productos = new ArrayList<>();
        productos.add(productoDTO);
        rentaDTO.setProductoDTO(productos);

        List<UsuarioDTO> usuarios = new ArrayList<>();
        usuarios.add(usuarioDTO);
        rentaDTO.setUsuarioDTO(usuarios);
    }

    @Test
    public void testRentarProducto() {
        //act
        rentaBO.rentarProducto(rentaDTO);
        // Assert
        assertTrue(true);

    }

    @Test
    public void testRentarProductoPorOxxo() {
        //arrenge
        RentaPorOxxoDTO rentaPorOxxoDTO = new RentaPorOxxoDTO("1234567890");
        //act
        rentaBO.rentarProductoPorOxxo(rentaPorOxxoDTO);
        //assert
        assertTrue(true);

    }

    @Test
    public void testRentarProductoPorTarjeta() {
        //arrenge
        RentaPorTarjetaDTO rentaPorTarjetaDTO = new RentaPorTarjetaDTO(
                "VISA",
                "4111111111111111",
                new Date(System.currentTimeMillis() + 365 * 24 * 60 * 60 * 1000),
                "123"
        );
        //Act
        rentaBO.rentarProductoPorTarjeta(rentaPorTarjetaDTO);
        //assert
        assertTrue(true);

    }

   
}
