package daw.programacion.clases;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class EmpleadoTest {
    
    Empleado empleado1;

    @BeforeEach
    void crearClaseEmpleado() {
        int id = 1;
        String firstName = "Pablo";
        String lastName = "Delgado";
        double salary = 10.0;
        empleado1 = new Empleado(id, firstName, lastName, salary);
    }

    @AfterEach
    void borrarClaseEmpleado() {
        empleado1 = null;
    }

    @Test
    public void id() {
        int expected = 1;
        assertEquals(expected, empleado1.getId());
    }

    @Test
    public void name() {
        String expected = "Pablo";
        assertEquals(expected, empleado1.getFirstName());
    }

    @Test
    public void lastName() {
        String expected = "Delgado";
        assertEquals(expected, empleado1.getLastName());
    }

    @Test
    public void salaryGet() {
        double expected = 10.0;
        assertEquals(expected, empleado1.getSalary());
    }

    @Test
    public void salarySet() {
        double set = 20.0;
        double expected = set;
        empleado1.setSalary(set);
        assertEquals(expected, empleado1.getSalary());
    }

    @Test
    public void toStringEmpleado() {
        String expected = "Employee [id=" + "1" + ", firstName=" + "Pablo" + ", lastName=" + "Delgado" + ", salary=" + "10.0"+ "]";
        assertEquals(expected, empleado1.toString());
    }

    @Test
    public void nombre() {
        String expected = "Pablo" + " " + "Delgado";
        assertEquals(expected, empleado1.getName());
    }

    @Test
    public void salarioAnual() {
        double expected = 120.0;
        assertEquals(expected, empleado1.getAnualSalary());
    }

    @Test
    public void aumentarSalario() {
        double expected = 10.01;
        assertEquals(expected, empleado1.raiseSalary(1));
    }

    @Test
    public void aumentarSalarioNegativo() {
        double expected = 9.99;
        assertEquals(expected, empleado1.raiseSalary(-1));
    }

    @Test
    public void aumentarSalarioDesdeNegativo() {
        empleado1.setSalary(-10);
        double expected = -9.99;
        assertEquals(expected, empleado1.raiseSalary(1));
    }
}
