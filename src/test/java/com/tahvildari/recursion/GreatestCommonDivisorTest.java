package com.tahvildari.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Abdolrahim Tahvildari on 1/18/2023
 */
class GreatestCommonDivisorTest {

    GreatestCommonDivisor commonDivisor = new GreatestCommonDivisor();

    @Test
    void gcd() {
        assertEquals(8, commonDivisor.gcd(16 , 24));
    }
}