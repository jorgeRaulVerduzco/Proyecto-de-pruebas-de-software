/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package DAO;

import Dominio.Pago;
import Dominio.Producto;
import com.mongodb.client.MongoCollection;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.bson.types.ObjectId;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 *
 * @author INEGI
 */
public class PagoDAOTest {

    private PagoDAO pagoDAO;
    private List<Producto> productos;
    private Pago pago;

    @BeforeEach
    public void setUp() {
        pagoDAO = new PagoDAO();
        
        // Configuración de datos de prueba
        Producto producto1 = new Producto();
        producto1.setIsbn(123456);
        producto1.setTitulo("Producto 1");
        producto1.setPrecio(100.0);
        
        Producto producto2 = new Producto();
        producto2.setIsbn(789012);
        producto2.setTitulo("Producto 2");
        producto2.setPrecio(200.0);
        
        productos = new ArrayList<>();
        productos.add(producto1);
        productos.add(producto2);

        pago = new Pago();
        pago.setProducto(productos);
        pago.setCantidad(2);
        pago.setCostoTotal(300.0);
           // Configura un pago de ejemplo
        pago.setIdPago(new ObjectId());
        Date fechaSql = new Date(System.currentTimeMillis());
        pago.setFechaDePago(fechaSql); 
    }

    @Test
    public void testAgregarPago() throws Exception {
        System.out.println("agregarPago");
        PagoDAO instance = new PagoDAO();
        // Act
        instance.agregarPago(pago);
        // Assert
        List<Producto> productosComprados = instance.consultarProductosCompradosPorUsuario("nombreUsuario"); 
        assertNotNull(productosComprados);
    }

    @Test
    public void testConsultarProductosCompradosPorUsuario() throws Exception {
        System.out.println("consultarProductosCompradosPorUsuario");
        String nombreUsuario = "nombreUsuario"; 
        PagoDAO instance = new PagoDAO();
        // Act
        List<Producto> result = instance.consultarProductosCompradosPorUsuario(nombreUsuario);
        // Assert
        assertNotNull(result);
    }

    @Test
    public void testConsultarHistorialComprasPorUsuario() throws Exception {
        System.out.println("consultarHistorialComprasPorUsuario");
        String nombreUsuario = "nombreUsuario"; // Cambia "nombreUsuario" a un usuario válido
        PagoDAO instance = new PagoDAO();
        
        // Act
        List<Object> result = instance.consultarHistorialComprasPorUsuario(nombreUsuario);
        
        // Assert
        assertNotNull(result);
    }

    @Test
    public void testConsultarHistorialComprasPorUsuarioMeses() throws Exception {
        System.out.println("consultarHistorialComprasPorUsuarioMeses");
        String nombreUsuario = "nombreUsuario"; 
        int año = 2024;
        int mes = 11; 
        PagoDAO instance = new PagoDAO();
        
        // Act
        List<Object> result = instance.consultarHistorialComprasPorUsuarioMeses(nombreUsuario, año, mes);
        
        // Assert
        assertNotNull(result);
    }
}
