package Operacion;

public class OperacionMatematicasKDSB {
    public double calcularRaizCuadrada(double numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo");
        }
        return Math.sqrt(numero);
    }
}
