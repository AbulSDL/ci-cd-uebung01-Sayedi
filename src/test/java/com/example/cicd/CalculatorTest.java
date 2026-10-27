package com.example.cicd;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Hinweise:
 * - Ergänze weitere Testfälle (z. B. negative Zahlen, große Werte)
 * - Diskutiere das Verhalten von divide(… , 0) und entscheide in Ü2, ob Exception sinnvoller ist
 */
class CalculatorTest {

    @Test
    void add_shouldSumTwoIntegers() {
        Calculator c = new Calculator();
        assertEquals(5, c.add(2, 3));
        // TODO: weitere Grenzfälle (z. B. negative Zahlen)
    }

    @Test
    void divide_byZero_shouldReturnZero_currentBehavior() {
        Calculator c = new Calculator();
        // Aktuelles (schlechtes) Verhalten absichtlich bestätigt – Refactoring in Ü2
        assertEquals(0, c.divide(10, 0));
    }

    @Test
    void sum_methods_shouldProduceSameResult() {
        Calculator c = new Calculator();
        List<Integer> nums = Arrays.asList(1, 2, 3, null, 4);
        assertEquals(c.sumUp(nums), c.addAll(nums));
    }
    
    @Test
    void add_withNegativeNumbers_shouldReturnNegativeSum() {
        Calculator c = new Calculator();

        int result = c.add(-2, -3);

        assertEquals(-5, result);
    }

    @Test
    void sumUp_withEmptyList_shouldReturnZero() {
        Calculator c = new Calculator();

        int result = c.sumUp(List.of());

        assertEquals(0, result);
    }
}
