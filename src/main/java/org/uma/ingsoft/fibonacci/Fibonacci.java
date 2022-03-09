package org.uma.ingsoft.fibonacci;

/**
 * The type Fibonacci.
 */
public class Fibonacci {
    /**
     * Calcular int.
     *
     * @param indice the indice
     * @return the int
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