package com.tahvildari.recursion;

/**
 * Created by Abdolrahim Tahvildari on 1/18/2023
 */
public class GreatestCommonDivisor {

    /**
     * How to find GCD(Greatest Common Divisor) two numbers using recursion
     */
    public int gcd(int a, int b) {
        if(a < 0 || b < 0) {
            return -1;
        }
        if(b == 0) {
            return a;
        }

        return gcd(b, a%b);
    }
}
