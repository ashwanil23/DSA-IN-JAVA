package com.dsa.lecture.code.array;

public class MoveZerosToEnd {
    static void moveZeros(int[] arr){
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0 && arr[j] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }if(arr[j] != 0){
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] myArray = {2,0,5,3,2,1,0,8,9,6,4,7,2,1,0};
        ArrayUtil arrayUtil = new ArrayUtil();
        arrayUtil.printArray(myArray);
        moveZeros(myArray);
        arrayUtil.printArray(myArray);
    }
}
