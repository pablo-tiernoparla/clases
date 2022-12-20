package daw.programacion.clases;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class FacturaTest {
    
    Factura factura1;

    @BeforeEach
    void crearClaseFactura() {
        String id = "1a";
        String desc = "abc";
        int cantidad = 10;
        double precio = 1.1;
        factura1 = new Factura(id, desc, cantidad, precio);
    }

    @AfterEach
    void borrarClaseFactura() {
        factura1 = null;
    }

    @Test
    public void id() {
        String expected = "1a";
        assertEquals(expected, factura1.getId());
    }

    @Test
    public void desc() {
        String expected = "abc";
        assertEquals(expected, factura1.getDesc());
    }

    @Test
    public void cantidad() {
        int expected = 10;
        assertEquals(expected, factura1.getCantidad());
    }

    @Test
    public void precio() {
        double expected = 1.1;
        assertEquals(expected, factura1.getPrecioUnitario());
    }

    @Test
    public void toStringPrimero() {
        String expected = "Factura [id=" + "1a" + ", desc=" + "abc" + ", cantidad=" + "10" + ", precioUnitario=" + "1.1"
        + "]";
        assertEquals(expected, factura1.toString());
    }

    @Test
    public void cantidadSet() {
        factura1.setCantidad(20);
        int expected = 20;
        assertEquals(expected, factura1.getCantidad());
    }

    @Test
    public void precioSet() {
        factura1.setPrecioUnitario(2.2);
        double expected = 2.2;
        assertEquals(expected, factura1.getPrecioUnitario());
    }

    @Test
    public void total() {
        double expected = 11.0;
        assertEquals(expected, factura1.getTotal());
    }

}
