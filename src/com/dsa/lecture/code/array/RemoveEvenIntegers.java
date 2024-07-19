package com.dsa.lecture.code.array;


public class RemoveEvenIntegers {
    int[] removeEven(int[] arr){
        int oddCounter = 0;
        for (int j : arr) {
            if (j % 2 != 0) {
                oddCounter++;
            }
        }
        int[] result = new int[oddCounter];
        int idx = 0;
        for (int j : arr) {
            if (j % 2 != 0) {
                result[idx] = j;
                idx++;
            }
        }
        return result;
    }

    public static void main(String... args){
        int[] myArray = {1,2,3,4,5,6,7,8,9};
        ArrayUtil arrayUtil = new ArrayUtil();
        arrayUtil.printArray(myArray);

        RemoveEvenIntegers removeEvenIntegers = new RemoveEvenIntegers();
        arrayUtil.printArray(removeEvenIntegers.removeEven(myArray));
    }
}
