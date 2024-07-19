package com.dsa.lecture.code.array;

public class ArrayUtil {
    public void printArray(int[] arr){
        int n = arr.length;
        for (int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
//    public void demoArray(){
//        int[] myArray = new int[5];
//        for (int i = 0; i < myArray.length; i++) {
//            myArray[i] = i + 11;
//        }
//        printArray(myArray);
//    }

//    public static void main(String[] args) {
//        ArrayUtil arrayUtil = new ArrayUtil();
//        arrayUtil.demoArray();
//    }
}


