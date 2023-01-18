package com.tahvildari.recursion;

/**
 * Created by Abdolrahim Tahvildari on 1/18/2023
 */
public class SumOfDigits {

    /**
     * How to find the sum of digits of a positive integer number using recursion
     */
    public int sumOfDigits(int i) {

        if (i == 0 || i < 0) {
            return 0;
        }

        return i % 10 + sumOfDigits(i / 10);

    }
}

