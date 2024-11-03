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
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import static org.mockito.ArgumentMatchers.any;
import org.mockito.Mock;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;

/**
 *
 * @author INEGI
 */
public class PagoBOTest {


    
  public PagoBOTest(){
    
    }

    @Test
    public void testComprarProducto() throws PersistenciaException {
     
    }

    @Test
    public void testComprarProductoPorOxxo() throws PersistenciaException {
       
    }

    @Test
    public void testComprarProductoPorTarjeta() throws PersistenciaException {
 
    }

    @Test
    public void testConsultarProductosCompradosPorUsuario() throws PersistenciaException {
      
    }

    @Test
    public void testConsultarHistorialComprasPorUsuario() throws PersistenciaException {
       
    }

    @Test
    public void testConsultarHistorialComprasPorUsuarioMeses() throws PersistenciaException {
      
    }

}
