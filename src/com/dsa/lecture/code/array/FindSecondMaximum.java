package com.dsa.lecture.code.array;

public class FindSecondMaximum {
    static int getSecondMaximum(int[] arr){
        int secondMax = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            if(i > max){
                secondMax = max;
                max = i;
            }else if(i > secondMax && i != max){
                secondMax = i;
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        int[] myArray = {2,0,5,3,2,1,0,8,9,6,4,7,2,1,0};
        ArrayUtil arrayUtil = new ArrayUtil();
        arrayUtil.printArray(myArray);
        System.out.println(getSecondMaximum(myArray));
    }
}
