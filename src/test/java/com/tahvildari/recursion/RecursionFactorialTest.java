package com.tahvildari.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Abdolrahim Tahvildari on 1/18/2023
 */
class RecursionFactorialTest {
    RecursionFactorial factorial = new RecursionFactorial();

    @Test
    void testFactorial() {
        assertEquals(120 , factorial.factorial(5));
    }
}