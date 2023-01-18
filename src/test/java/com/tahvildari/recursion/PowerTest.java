package com.tahvildari.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Abdolrahim Tahvildari on 1/18/2023
 */
class PowerTest {
    Power power = new Power();
    @Test
    void testPower() {
        assertEquals(8, power.power(2,3));
        assertEquals(1, power.power(2,0));
    }
}