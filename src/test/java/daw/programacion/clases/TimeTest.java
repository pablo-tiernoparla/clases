package daw.programacion.clases;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TimeTest {

    Time Time1;

    @BeforeEach
    void crearClaseTime() {
        int hour = 12;
        int minute = 6;
        int second = 14;
        Time1 = new Time(hour, minute, second);
    }

    @AfterEach
    void borrarClaseTime() {
        Time1 = null;
    }

    @Test
    void testGetHora() {
        int expected = 12;
        assertEquals(expected, Time1.getHour());
    }

    @Test
    void testGetMinuto() {
        int expected = 6;
        assertEquals(expected, Time1.getMinute());
    }

    @Test
    void testGetSegundo() {
        int expected = 14;
        assertEquals(expected, Time1.getSecond());
    }

    @Test
    void setSecondNoException() {
        int sumarSegundo = 45;
        int expected = 45;
        Time1.setSecond(sumarSegundo);
        assertEquals(expected, Time1.getSecond());
    }

    @Test
    void setSecondException() {
        int sumarSegundo = 77;
        assertThrows(IllegalArgumentException.class,
                () -> {
                    Time1.setSecond(sumarSegundo);
                });
    }

    @Test
    void setMinNoException() {
        int sumarMin = 45;
        int expected = 45;
        Time1.setMinute(sumarMin);
        assertEquals(expected, Time1.getMinute());
    }

    @Test
    void setMinuteException() {
        int sumarMin = 77;
        assertThrows(IllegalArgumentException.class,
                () -> {
                    Time1.setMinute(sumarMin);
                });
    }

    @Test
    void setHourNoException() {
        int sumarHora = 13;
        int expected = 13;
        Time1.setHour(sumarHora);
        assertEquals(expected, Time1.getHour());
    }

    @Test
    void setHourException() {
        int sumarHora = 77;
        assertThrows(IllegalArgumentException.class,
                () -> {
                    Time1.setHour(sumarHora);
                });
    }

    @Test
    void setTimeNoException(){

    }
}