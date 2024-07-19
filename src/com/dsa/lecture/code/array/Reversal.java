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
        int[] myArray = {2,0,5,3,2,1,0,8,9,6,4,7,2,1,0};
        ArrayUtil arrayUtil = new ArrayUtil();
        arrayUtil.printArray(myArray);

        reverse(myArray,0,myArray.length-1);

        arrayUtil.printArray(myArray);
    }
}
