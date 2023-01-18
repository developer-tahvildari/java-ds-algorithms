package com.tahvildari.recursion;

/**
 * Created by Abdolrahim Tahvildari on 1/18/2023
 */
public class Power {

    /**
     * How to calculate power of a number using recursion
     */
    public int power(int base, int exp) {
        if (exp < 0) {
            return -1;
        }else if (exp == 0) {
            return 1;
        }else if (exp == 1) {
            return base;
        }

        return base * power(base, exp - 1);
    }
}
