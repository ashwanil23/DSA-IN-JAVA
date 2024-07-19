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
        int[] myArray = {2,0,5,3,2,1,0,8,9,6,4,7,2,1,0};
        ArrayUtil arrayUtil = new ArrayUtil();
        arrayUtil.printArray(myArray);

        RemoveEvenIntegers removeEvenIntegers = new RemoveEvenIntegers();
        arrayUtil.printArray(removeEvenIntegers.removeEven(myArray));
    }
}
