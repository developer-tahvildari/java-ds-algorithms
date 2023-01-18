package com.tahvildari.recursion;

/**
 * Created by Abdolrahim Tahvildari on 1/18/2023
 */
public class DecimalToBinaryConvertor {
    public int decimalToBinary(int i) {
        if (i == 0) {
            return 0;
        }
        return i % 2 + 10 * decimalToBinary(i / 2);
    }
}
