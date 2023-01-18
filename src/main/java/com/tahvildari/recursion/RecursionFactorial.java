package com.tahvildari.recursion;

/**
 * Created by Abdolrahim Tahvildari on 1/18/2023
 */
public class RecursionFactorial {


    public int factorial(int i) {
        if (i < 0) {
            return -1;
        }
        if (i== 0 || i== 1) {
            return 1;
        }
        return i * factorial(i -1);
    }
}
