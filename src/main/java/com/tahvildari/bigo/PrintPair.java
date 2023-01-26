package com.tahvildari.bigo;

/**
 * Created by Abdolrahim Tahvildari on 1/24/2023
 */
public class PrintPair {

    /**
     * create a method which prints tp the console the pairs from given array
     * Time complexity: O(N^2)
     */
    void printPairs(int[] array) {
        for (int k : array) {
            for (int i : array) {
                System.out.println(k + "," + i);
            }
        }
    }
}

