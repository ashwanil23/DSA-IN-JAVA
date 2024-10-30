package com.dsa.lecture.code.stack;

import java.util.NoSuchElementException;

public class ArrayImplementation {
    private int top;
    private int[] stackArray;

    public ArrayImplementation(int capacity){
        this.top = -1;
        this.stackArray = new int[capacity];
    }

    public int size(){
        return top+1;
    }
    public boolean isFull(){
        return stackArray.length == size();
    }
    public boolean isEmpty(){
        return top < 0;
    }
    public void push(int data){
        if(isFull()){
            throw new NoSuchElementException("Stack full");
        }else{
            this.top++;
            this.stackArray[top] = data;
        }
    }
    public int pop(){
        if(isEmpty()){
            throw new NoSuchElementException("Stack empty");
        }else{
            int element = this.stackArray[top];
            top--;
            return element;
        }
    }

    public int peek(){
        if (isEmpty()){
            throw new NoSuchElementException("Stack empty");
        }else{
            return this.stackArray[top];
        }
    }

    public void display(){
        if (isEmpty()) throw new NoSuchElementException("Stack empty");
        else {
            int tempTop = top;
            while(tempTop >= 0){
                System.out.print(this.stackArray[tempTop]+" ");
                tempTop--;
            }
        }
    }

    public static void main(String[] args) {
        ArrayImplementation stack = new ArrayImplementation(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(10);
        stack.display();
        System.out.println();
        System.out.print("Top->"+stack.peek());
        stack.pop();
        System.out.println();
        stack.display();
        System.out.println();
        System.out.print("Top->"+stack.peek());
    }
}
