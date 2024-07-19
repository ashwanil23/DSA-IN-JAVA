package com.dsa.lecture.code.array;

public class MinValue{
    static int getMinValue(int[] arr){
        int min = arr[0];
        for (int j : arr){
            if (j < min){
                min = j;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,5,6,7,8,9};
        ArrayUtil arrayUtil = new ArrayUtil();
        arrayUtil.printArray(myArray);
        System.out.println("Minimum value of Array : " + getMinValue(myArray));
    }
}
