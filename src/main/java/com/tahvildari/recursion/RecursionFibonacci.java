package com.tahvildari.recursion;

/**
 * Created by Abdolrahim Tahvildari on 1/18/2023
 */

public class RecursionFibonacci {

    public int fibonacci(int i) {

        if (i < 0) {
            return -1;
        }
        if (i == 0 || i == 1) {
            return i;
        }
        return fibonacci(i - 1) + fibonacci(i - 2);

    }
}
