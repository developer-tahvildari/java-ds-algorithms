package com.tahvildari.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Abdolrahim Tahvildari on 1/18/2023
 */
class SumOfDigitsTest {
    SumOfDigits sumOfDigits = new SumOfDigits();

    @Test
    void sumOfDigits() {
        assertEquals(6, sumOfDigits.sumOfDigits(123));
    }
}