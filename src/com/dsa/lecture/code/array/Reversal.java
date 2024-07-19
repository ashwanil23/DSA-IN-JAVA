package com.dsa.lecture.code.array;

public class Reversal {
    static void reverse(int[] numberArr,int start,int end){
        while(start < end) {
            int temp = numberArr[start];
            numberArr[start] = numberArr[end];
            numberArr[end] = temp;
            start ++;
            end --;
        }
    }

    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,5,6,7,8,9};
        ArrayUtil arrayUtil = new ArrayUtil();
        arrayUtil.printArray(myArray);

        reverse(myArray,0,myArray.length-1);

        arrayUtil.printArray(myArray);
    }
}
