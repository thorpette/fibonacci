package org.uma.ingsoft.fibonacci;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Clase para probar fibonacci
 */
class FibonacciTest {

    private Fibonacci fibonacciUnderTest;

    /**
     * Sets up.
     * Para probar la clase Fibonacci
     */
    @BeforeEach
    void setUp() {

        fibonacciUnderTest = new Fibonacci();
    }

    /**
     * Calcular el fibonacci de 0 que es 1.
     */
    @Test
    public void calcular_0() {
        int testIndex = 0;
        int expectedResult = 1;
        assertThat(fibonacciUnderTest.calcular(testIndex)).isEqualTo(expectedResult);
    }

    /**
     * Calcular el fibonacci de 1 que es 1.
     */
    @Test
    public void calcular_1() {
        int testIndex = 1;
        int expectedResult = 1;

        assertThat(fibonacciUnderTest.calcular(testIndex)).isEqualTo(expectedResult);
    }

    /**
     * Calcular el fibonacci de un numero superior a 1 (el 15 con valor 987)
     */
    @Test
    public void calcular_15() {
        int testIndex = 15;
        int expectedResult = 987;

        assertThat(fibonacciUnderTest.calcular(testIndex)).isEqualTo(expectedResult);
    }

    /**
     * Calcular el fibonacci de -1 que debe generar error.
     */
    @Test
    public void calcular_negative() {
        Throwable exception = assertThrows(IllegalArgumentException.class,
                ()->{fibonacciUnderTest.calcular(-1);} );

    }
}
