package com.dsa.lecture.code.array;

public class MinValue{
    static int getMinValue(int[] arr){
        if (arr == null || arr.length == 0){
            System.out.println("Empty Array");
        }
        int min = arr[0];
        for (int j : arr){
            if (j < min){
                min = j;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] myArray = {2,0,5,3,2,1,0,8,9,6,4,7,2,1,0};
        ArrayUtil arrayUtil = new ArrayUtil();
        arrayUtil.printArray(myArray);
        System.out.println("Minimum value of Array : " + getMinValue(myArray));
    }
}
