package com.equipo.saludo;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {


    @Test
    public void testSaludo() {
        assertEquals("¡Hola, DevOps!", App.saludar("DevOps"));
    }
}
