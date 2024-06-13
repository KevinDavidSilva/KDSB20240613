package Operacion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperacionMatematicasKDSBTest {

    @Test
    public void testCalcularRaizCuadrada() {
        OperacionMatematicasKDSB operaciones = new OperacionMatematicasKDSB();


        double[] numeros = {16, 0, 0.0001, 4};


        for (double numero : numeros) {
            try {
                double resultado = operaciones.calcularRaizCuadrada(numero);
                System.out.println("La raíz cuadrada de " + numero + " es: " + resultado);
            } catch (IllegalArgumentException e) {
                System.out.println("Excepción para el número " + numero + ": " + e.getMessage());
            }
        }
    }

}