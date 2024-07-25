package com.dsa.lecture.code.array;

public class Resize {
    static int[] getResizedArray(int[] arr, int capacity){
        int[] temp = new int[capacity];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        return temp;
    }
    public static void main(String... args){
        int[] myArray = {2,0,5,3,2,1,0,8,9,6,4,7,2,1,3};
        System.out.println("Size of Array is : " + myArray.length);
        ArrayUtil arrayUtil = new ArrayUtil();
        arrayUtil.printArray(myArray);

        int[] newArray = getResizedArray(myArray,2* myArray.length);
        System.out.println("Size of new Array is : " + newArray.length);
        arrayUtil.printArray(newArray);
    }
}
