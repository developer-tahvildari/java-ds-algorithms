package com.tahvildari.bigo;

/**
 * Created by Abdolrahim Tahvildari on 1/24/2023
 */
public class ReverseArray {

    /**
     * method which takes an array as a parameter and reverse it
     * Time complexity: O(N)
     */
    public int[] reverse(int[] array) {
        for (int i = 0; i < array.length /2; i++) {
            int other = array.length-i-1;
            int temp = array[i];
            array[i] = array[other];
            array[other] = temp;
        }
        return array;
    }
}