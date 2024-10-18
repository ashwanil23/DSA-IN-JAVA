package com.dsa.lecture.code.stack;

public class NextGreater {
    public static int[] nextGreater(int[] array){
        int[] result = new int[array.length];
        ListImplementation newStack = new ListImplementation();
        for(int i = array.length-1; i >= 0; i--){
            if (!newStack.isEmpty()){
                while(!newStack.isEmpty() && newStack.peek() <= array[i]){
                    newStack.pop();
                }
            }
            if (newStack.isEmpty()) result[i] = -1;
            else {
                result[i] = newStack.peek();
            }
            newStack.push(array[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] myArray = {4,7,3,4,8,1};
        myArray = nextGreater(myArray);
        for (int i : myArray) {
            System.out.print(i+ " ");
        }
    }
}
