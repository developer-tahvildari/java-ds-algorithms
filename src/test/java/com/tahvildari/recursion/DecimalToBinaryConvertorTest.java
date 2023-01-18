package com.tahvildari.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Abdolrahim Tahvildari on 1/18/2023
 */
class DecimalToBinaryConvertorTest {
    DecimalToBinaryConvertor binaryConvertor = new DecimalToBinaryConvertor();

    @Test
    void decimalToBinary() {
        assertEquals(1100100,binaryConvertor.decimalToBinary(100));
    }
}