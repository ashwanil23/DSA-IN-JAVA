package com.dsa.lecture.code.stack;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class ReverseString {
    private ListNode top;
    private int length;

    public ReverseString() {
        this.top = null;
        this.length = 0;
    }

    public static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public boolean isEmpty(){
        return length == 0;
    }
    public int length(){
        return length;
    }
    public void push(int data){
        ListNode newNode = new ListNode(data);
        if (isEmpty()) top = newNode;
        else newNode.next = top;
        top = newNode;
        length++;
    }
    public int pop(){
        int value;
        if (isEmpty()) throw new EmptyStackException();
        else{
            value = top.data;
            top = top.next;
            length--;
        }
        return value;
    }
    public void display(){
        if(isEmpty()){
            throw new NoSuchElementException("Stack is empty");
        }else{
            ListNode temp = this.top;
            while(temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
    }
    public int peek(){
        if(isEmpty()){
            throw new NoSuchElementException("Stack is empty");
        }
        return this.top.data;
    }

    public static String reverseString(String str){
        ReverseString newStack = new ReverseString();
        char[] newCharArray = str.toCharArray();

        for(int i = 0 ; i < str.length(); i++){
            newStack.push(newCharArray[i]);
        }

        for(int i = 0 ; i < str.length(); i++){
            newCharArray[i] = (char) newStack.pop();
        }
        return new String(newCharArray);
    }

    public static void main(String[] args) {
        String str = "ABED";
        System.out.println("String before reversal :" + str);
        System.out.println("String before reversal :" + reverseString(str));
    }
}
