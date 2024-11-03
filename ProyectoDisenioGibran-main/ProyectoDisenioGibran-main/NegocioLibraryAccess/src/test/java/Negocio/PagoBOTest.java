/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Negocio;

import DTO.PagoDTO;
import DTO.PagoPorOxxoDTO;
import DTO.PagoPorTarjetaDTO;
import DTO.ProductoDTO;
import DTO.UsuarioDTO;
import Dominio.Pago;
import Dominio.PagoPorOxxo;
import Dominio.PagoPorTarjeta;
import Dominio.Producto;
import Excepciones.PersistenciaException;
import IDAO.IPagoDAO;
import IDAO.IPagoPorOxxoDAO;
import IDAO.IPagoPorTarjetaDAO;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import static org.mockito.ArgumentMatchers.any;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;

/**
 *
 * @author INEGI
 */
public class PagoBOTest {

    private PagoBO pagoBO;
    private PagoDTO pagoDTO;
    private PagoPorOxxoDTO pagoPorOxxoDTO;
    private PagoPorTarjetaDTO pagoPorTarjetaDTO;
    private UsuarioDTO usuarioDTO;
    private ProductoDTO productoDTO;

    @BeforeEach 
    public void setUp() {
        pagoBO = new PagoBO();

        // Inicializar DTO de Usuario
        usuarioDTO = new UsuarioDTO();
        usuarioDTO.setNombreUsuario("testUser");
        usuarioDTO.setContraseña("password123");

        // Inicializar DTO de Producto
        productoDTO = new ProductoDTO();
        productoDTO.setIsbn(12345);
        productoDTO.setTitulo("Test Book");
        productoDTO.setAutor("Test Author");
        productoDTO.setPrecio(299.99);
        productoDTO.setCantidad(1);

        // Inicializar DTO de Pago básico
        pagoDTO = new PagoDTO();
        pagoDTO.setUsuarioDTO(Arrays.asList(usuarioDTO));
        pagoDTO.setProductoDTO(Arrays.asList(productoDTO));
        pagoDTO.setCantidad(1);
        pagoDTO.setFechaDePago(new Date(System.currentTimeMillis()));
        pagoDTO.setCostoTotal(299.99);
        // Inicializar DTO de Pago por OXXO
        pagoPorOxxoDTO = new PagoPorOxxoDTO();
        pagoPorOxxoDTO.setCodigoBarrasOxxo("123456789");

        // Inicializar DTO de Pago por Tarjeta
        pagoPorTarjetaDTO = new PagoPorTarjetaDTO();
        pagoPorTarjetaDTO.setTipoTarjeta("VISA");
        pagoPorTarjetaDTO.setNumeroTarjeta("4111111111111111");
        pagoPorTarjetaDTO.setFechaExpiracion(new Date(System.currentTimeMillis()));
        pagoPorTarjetaDTO.setCodigoSeguridad("123");
    }

    @Test
    public void testComprarProducto() throws PersistenciaException {
//arrenge
        double costo = 299.99;

// Act
        pagoBO.ComprarProducto(pagoDTO);

        // Assert
        assertEquals(costo, pagoDTO.getCostoTotal(), 0.01);

    }

    @Test
    public void testComprarProductoPorOxxo() throws PersistenciaException {

        // Act
        pagoBO.ComprarProductoPorOxxo(pagoPorOxxoDTO);

        // Assert
        assertNotNull(pagoPorOxxoDTO.getCodigoBarrasOxxo());
        assertEquals(9, pagoPorOxxoDTO.getCodigoBarrasOxxo().length());
    }

   
}
