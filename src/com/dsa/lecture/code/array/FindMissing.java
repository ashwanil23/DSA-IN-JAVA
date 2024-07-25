package com.dsa.lecture.code.array;

public class FindMissing {
    static int getMissingNumber(int[] arr){
        int n = arr.length + 1;
        int sum = (n * (n+1))/2;
        for (int num : arr) {
            sum = sum - num;
        }
        return sum;
    }
    public static void main(String... args){
        int[] myArray = {1,3,5,4};
        System.out.println("Size of Array is : " + myArray.length);
        ArrayUtil arrayUtil = new ArrayUtil();
        arrayUtil.printArray(myArray);

        int missingNumber = getMissingNumber(myArray);
        System.out.println("Missing Number is : " + missingNumber);
    }
}
