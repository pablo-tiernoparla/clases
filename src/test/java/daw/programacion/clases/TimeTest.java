package daw.programacion.clases;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TimeTest {
    
    Time Time1;

    @BeforeEach
    void crearClaseTime(){
        int hour = 12;
        int minute = 6;
        int second = 59;
        Time1 = new Time(hour, minute, second);
    }

    @AfterEach
    void borrarClaseTime(){
        Time1 = null;
    }

    @Test
    public void toStringCorrecto(){
        String expected = "12:06:59";
        assertEquals(expected, Time1.toString());
    }
}
