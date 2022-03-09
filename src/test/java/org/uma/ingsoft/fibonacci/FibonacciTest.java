package org.uma.ingsoft.fibonacci;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * The type Fibonacci test.
 */
class FibonacciTest {

    private Fibonacci fibonacciUnderTest;

    /**
     * Sets up.
     */
    @BeforeEach
    void setUp() {

        fibonacciUnderTest = new Fibonacci();
    }

    /**
     * Calcular 0.
     */
    @Test
    public void calcular_0() {
        int testIndex = 0;
        int expectedResult = 1;
        assertThat(fibonacciUnderTest.calcular(testIndex)).isEqualTo(expectedResult);
    }

    /**
     * Calcular 1.
     */
    @Test
    public void calcular_1() {
        int testIndex = 1;
        int expectedResult = 1;

        assertThat(fibonacciUnderTest.calcular(testIndex)).isEqualTo(expectedResult);
    }

    /**
     * Calcular 6.
     */
    @Test
    public void calcular_6() {
        int testIndex = 15;
        int expectedResult = 987;

        assertThat(fibonacciUnderTest.calcular(testIndex)).isEqualTo(expectedResult);
    }

    /**
     * Calcular negative.
     */
    @Test
    public void calcular_negative() {
        Throwable exception = assertThrows(IllegalArgumentException.class,
                ()->{fibonacciUnderTest.calcular(-1);} );

    }
}
