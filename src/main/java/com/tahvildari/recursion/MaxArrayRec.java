package com.tahvildari.recursion;

/**
 * Created by Abdolrahim Tahvildari on 1/23/2023
 */
public class MaxArrayRec {

    /**
     * Recursive function to find biggest element in array, time complexity is O(n)
     */
     public int findMaxRex(int[]  sampleArray, int arraySize){
        if(arraySize == 0) {
            return sampleArray[0];
        }
        return Math.max(sampleArray[arraySize-1], findMaxRex(sampleArray, arraySize-1)  );


    }
}
