package org.jdelira.junitapp.models;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CuentaTest {

    @Test
    void testNombreCuenta() {
        Cuenta cuenta = new Cuenta("Jorge", new BigDecimal("1000.12345"));
        //cuenta.setPersona("Jorge");
        String esperado = "Jorge";
        String real = cuenta.getPersona();
        assertEquals(esperado, real);
        assertTrue(real.equals("Jorge"));

    }

    @Test
    void testSaldoCuenta() {
        Cuenta cuenta = new Cuenta("Jorge", new BigDecimal("1000.12345"));
        assertEquals(1000.12345, cuenta.getSaldo().doubleValue());
        assertFalse(cuenta.getSaldo().compareTo(BigDecimal.ZERO) < 0);
        assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO) > 0);

    }
}