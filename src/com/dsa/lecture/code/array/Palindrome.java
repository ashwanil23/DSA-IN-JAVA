package com.dsa.lecture.code.array;

import java.util.Scanner;

public class Palindrome {
    static boolean isPalindrome(String word){
        char[] charArray = word.toCharArray();
        int start = 0;
        int end = charArray.length-1;
        while(start < end){
            if (charArray[start] != charArray[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter a string = ");
        String word = input.next();
        if (isPalindrome(word)){
            System.out.println("String is a palindrome");
        }else{
            System.out.println("String isn't a palindrome");
        }
    }
}
