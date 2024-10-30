package com.dsa.lecture.code.queue;

import java.util.LinkedList;
import java.util.Queue;

public class IntToBinaryArray {
    public static void main(String[] args) {
        String[] newStrArray = toBinary(500);
        for (String s: newStrArray){
            System.out.print(s + " ");
        }
    }

    public static String[] toBinary(int num){
        String[] newStrArray = new String[num];
        Queue<String> newQueue = new LinkedList<>();
        newQueue.offer("1");
        int i = 0;
        while(i < num){
            newStrArray[i] = newQueue.poll();
            String str1 = newStrArray[i] + "0";
            String str2 = newStrArray[i] + "1";
            newQueue.offer(str1);
            newQueue.offer(str2);
            i++;
        }
        return newStrArray;
    }
}
