package com.dsa.lecture.code.stack;

import java.util.NoSuchElementException;

public class ListImplementation {
    private ListNode top;
    private int length;

    private static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public ListImplementation() {
        this.top = null;
        this.length = 0;
    }

    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length == 0;
    }

    public void push(int data){
        if (isEmpty()){
            this.top = new ListNode(data);
            this.length++;
        }else{
            ListNode newNode = new ListNode(data);
            newNode.next = this.top;
            this.top = newNode;
            this.length++;
        }
    }

    public int pop(){
        if (isEmpty()){
            throw new NoSuchElementException("Stack is empty");
        }else{
            ListNode temp = top;
            this.top = this.top.next;
            length--;
            return temp.data;
        }
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

    public static void main(String[] args) {
        ListImplementation stack = new ListImplementation();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.print("Top -> "+stack.peek());
        System.out.println();

        stack.display();

        stack.pop();

        System.out.println();
        System.out.print("Top -> "+stack.peek());

        System.out.println();
        stack.display();
    }
}
