package daw.programacion.clases;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class CuentaTest {
    
    Cuenta cuenta1;
    Cuenta cuenta2;

    @BeforeEach
    void crearClaseCuenta() {
        String id = "45gt"; 
        String nombreCliente = "Ana Botin";
        double saldo = 125.6;
        cuenta1 = new Cuenta(id, nombreCliente);
        cuenta2 = new Cuenta(id, nombreCliente, saldo);
    }

    @AfterEach
    void borrarClasesCuenta() {
        cuenta1 = null;
        cuenta2 = null;
    }

    @Test
    public void elIdConElPrimerConstructorBien() {
        String expected = "45gt";
        assertEquals(expected, cuenta1.getId());
    }

    @Test
    public void elNombreConElPrimerConstructorBien() {
        String expected = "Ana Botin";
        assertEquals(expected, cuenta1.getNombreCliente());
    }

    @Test
    public void saldoConPrimerConstructor() {
        double expected = 0;
        assertEquals(expected, cuenta1.getSaldo());
    }

    @Test
    public void tostringPrimerConstructor() {
        String expected = "Cuenta [id=" + "45gt" + ", nombreCliente=" + "Ana Botin" + ", saldo=" + "0.0" + "]";
        assertEquals(expected, cuenta1.toString());
    }

    @Test
    public void idSegundoConstructor() {
        String expected = "45gt";
        assertEquals(expected, cuenta2.getId());
    }

    @Test
    public void nombreSegundoConstructor() {
        String expected = "Ana Botin";
        assertEquals(expected, cuenta2.getNombreCliente());
    }

    @Test
    public void saldoSegundoConstructor() {
        double expected = 125.6;
        assertEquals(expected, cuenta2.getSaldo());
    }

    @Test
    public void tostringSegundoConstructor() {
        String expected = "Cuenta [id=" + "45gt" + ", nombreCliente=" + "Ana Botin" + ", saldo=" + "125.6" + "]";
        assertEquals(expected, cuenta2.toString());
    }

    @Test
    public void creditoPrimerConstructor() {
        double expected = -100;
        assertEquals(expected, cuenta1.credito(100));
    }

    @Test
    public void creditoNumeroNegativo() {
        double expected = 225.6;
        assertEquals(expected, cuenta2.credito(-100));
    }

    @Test
    public void creditoSumaCero() {
        double expected = 125.6;
        assertEquals(expected, cuenta2.credito(0));
    }

    @Test
    public void debitoSegundoConstructor() {
        double expected = 25;
        assertEquals(expected, cuenta2.debito(100.6));
    }

    @Test
    public void debitoNegativo() {
        double expected = 225.6;
        assertEquals(expected, cuenta2.debito(-100));
    }

    @Test
    public void debitoSegundoInvalido() {
        double expected = 125.6;
        assertEquals(expected, cuenta2.debito(800));
    }

    @Test
    public void transferenciaSegundoConstrustor() {
        double expected = 25;
        assertEquals(expected, cuenta2.transferencia(cuenta1, 100.6));
    }

    @Test
    public void transferenciaNegativa() {
        double expected = 225.6;
        assertEquals(expected, cuenta2.transferencia(cuenta1, -100));
    }

    @Test
    public void transferenciaInvalida() {
        double expected = -674.4;
        assertEquals(expected, cuenta2.transferencia(cuenta1, 800));
    }
}
