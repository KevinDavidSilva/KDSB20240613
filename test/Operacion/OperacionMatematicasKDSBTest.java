package Operacion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperacionMatematicasKDSBTest {

    @Test
    public void testCalcularRaizCuadrada() {
        OperacionMatematicasKDSB operaciones = new OperacionMatematicasKDSB();


        assertEquals(2.0, operaciones.calcularRaizCuadrada(4.0), 0.0001);


        assertEquals(0.0, operaciones.calcularRaizCuadrada(0.0), 0.0001);


        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            operaciones.calcularRaizCuadrada(-1.0);
        });
        assertEquals("El número no puede ser negativo", exception.getMessage());
    }

}