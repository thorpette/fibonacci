package org.uma.ingsoft.fibonacci;

/**
 * El tipo Fibonacci.
 */
public class Fibonacci {
    /**
     * Calcular Fibonacci.
     *
     * @param indice el indice
     * @return
     *   Si se pasa un numero negativo devuelve una excepcion (Fibonacci es para positivos)
     *   Si el indice es 0 0 1 el valor es 1
     *   Si el indice es superior a 1
     *   el calculo de fibonacci = fibonacci (indice-1) + fibonacci (indice-2)
     */
    public int calcular(int indice) {
        if (indice < 0) {
            throw new IllegalArgumentException("Fibonacci es para positivos.");
        } else if (indice <= 1) {
            return 1;
        } else {
            return calcular(indice - 1) + calcular(indice - 2);
        }
    }
}