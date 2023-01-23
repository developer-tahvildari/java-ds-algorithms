package com.tahvildari.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by Abdolrahim Tahvildari on 1/23/2023
 */
class MaxArrayRecTest {

    MaxArrayRec maxRec = new MaxArrayRec();

    @Test
    void findMaxRex() {
        assertEquals(15,maxRec.findMaxRex(new int[]{1, 7, 12,15},4));
    }
}