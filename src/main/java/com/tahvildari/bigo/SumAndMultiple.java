package com.tahvildari.bigo;

/**
 * Created by Abdolrahim Tahvildari on 1/24/2023
 */
public class SumAndMultiple {

    /**
     * methods which calculate sum and multiple of arrays elements
     * Time complexity: O(N)
     */
    public void sumAndMultipleOfArray(int[] array) {
        int sum = 0;
        int multiple = 1;
        for (int j : array) {
            sum += j;
            multiple *= j;
        }
        System.out.println("multiple = " + multiple);
        System.out.println("sum = " + sum);
    }
}
