package com.tahvildari.bigo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Abdolrahim Tahvildari on 1/24/2023
 */
class ReverseArrayTest {

    ReverseArray reverseArray = new ReverseArray();

    @Test
    void reverse() {
        int[] ints = new int[]{1,2,3,4};
        assertArrayEquals(new int[]{4, 3, 2, 1}, reverseArray.reverse(ints));

    }
}