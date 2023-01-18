package com.tahvildari.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Abdolrahim Tahvildari on 1/18/2023
 */
class RecursionFibonacciTest {

    RecursionFibonacci recursionFibonacci = new RecursionFibonacci();

    @Test
    void fibonacci() {
        assertEquals(55, recursionFibonacci.fibonacci(10));
    }
}