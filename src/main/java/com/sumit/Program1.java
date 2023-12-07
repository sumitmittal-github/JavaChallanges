package com.sumit;

public class Program1 {

    /*
     * Given an array of positive and negative numbers, arrange them such that all
     * negative integers appear before all the positive integers in the array.
     * Example: Input: {12, 11 -13, -5, 6, -7, 5, -3, -6} Output: {-13, -5, -7, -3, -6, 12, 11, 6, 5}
     */

    public static void main(String[] args) {
        int[] inputArr = {11,-3, 5,8,-5,-3,-1};

        int[] outputArr = new int[inputArr.length];
        segregateNumbers(inputArr, outputArr);

        for(int i : outputArr)
            System.out.print(i + " ");

    }

    private static void segregateNumbers(int[] inputArr, int[] outputArr) {
        int j=0;

        // add all the negative numbers in output array
        for(int element : inputArr) {
            if(element<0)
                outputArr[j++] = element;
        }

        // add all the positive numbers in output array
        for(int element : inputArr) {
            if(element>=0)
                outputArr[j++] = element;
        }
    }
}