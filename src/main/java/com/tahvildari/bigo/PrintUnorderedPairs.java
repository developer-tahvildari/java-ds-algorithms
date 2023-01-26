package com.tahvildari.bigo;

/**
 * Created by Abdolrahim Tahvildari on 1/24/2023
 */
public class PrintUnorderedPairs {

    /**
     * create a method which prints tp the console the unordered pairs from given array
     * Time complexity: O(N^2)
     */

    void printUnorderedPairs(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                System.out.println(array[i] + "," + array[j]);
            }
        }

    }
}
