/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package DAO;

import Dominio.Producto;
import Dominio.Renta;
import Dominio.Usuario;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import java.time.LocalDate;

/**
 *
 * @author INEGI
 */
public class RentaDAOTest {

    private RentaDAO rentaDAO;
    private Renta renta;

    @BeforeEach
    public void setUp() {
        rentaDAO = new RentaDAO();
        renta = new Renta();
        LocalDate localDate = LocalDate.now();
        renta.setFechaRenta(Date.valueOf(localDate));
        renta.setFechaDevolucion(Date.valueOf(localDate));
        renta.setCantidad(1);
        renta.setCostoRenta(100.0);

        Usuario usuario = new Usuario(); // Crear un usuario
        usuario.setNombreUsuario("testUser");
        renta.setUsuario(new ArrayList<>());
        renta.getUsuario().add(usuario);

        Producto producto = new Producto(); // Crear un producto
        producto.setIsbn(123456);
        producto.setTitulo("Test Product");
        renta.setProducto(new ArrayList<>());
        renta.getProducto().add(producto);
    }

    @Test
    public void testAgregarPago() throws Exception {
        System.out.println("agregarPago");
        // Actuar
        rentaDAO.agregarPago(renta);

        List<Producto> productosRentados = rentaDAO.consultarProductosRentadosPorUsuario("testUser");
        assertNotNull(productosRentados);
        assertFalse(productosRentados.isEmpty());
    }

    @Test
    public void testConsultarProductosRentadosPorUsuario() throws Exception {
        System.out.println("consultarProductosRentadosPorUsuario");
        String nombreUsuario = "testUser";
        List<Producto> expResult = new ArrayList<>();
        expResult.add(renta.getProducto().get(0)); // Esperar que el producto de prueba esté en la lista

        // Actuar
        List<Producto> result = rentaDAO.consultarProductosRentadosPorUsuario(nombreUsuario);

        // Aserciones
        assertEquals(expResult.size(), result.size());
        assertEquals(expResult.get(0).getIsbn(), result.get(0).getIsbn());
    }

    @Test
    public void testConsultarHistorialRentasPorUsuario() throws Exception {
        System.out.println("consultarHistorialRentasPorUsuario");
        String nombreUsuario = "testUser";

        // Actuar
        List<Object> result = rentaDAO.consultarHistorialRentasPorUsuario(nombreUsuario);

        // Aserciones
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    public void testConsultarHistorialRentasPorUsuarioMeses() throws Exception {
        System.out.println("consultarHistorialRentasPorUsuarioMeses");
        String nombreUsuario = "testUser";
        int año = 2024;
        int mes = 11;

        // Actuar
        List<Object> result = rentaDAO.consultarHistorialRentasPorUsuarioMeses(nombreUsuario, año, mes);

        // Aserciones
        assertNotNull(result);
    }
}
