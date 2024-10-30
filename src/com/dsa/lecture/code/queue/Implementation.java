package com.dsa.lecture.code.queue;

import java.util.NoSuchElementException;

public class Implementation {
    private ListNode front;
    private ListNode rear;
    private int length;

    public static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public Implementation(){
        this.front = null;
        this.rear = null;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public int length(){
        return length;
    }

    public void enQueue(int data) {
        ListNode newNode = new ListNode(data);
        if (isEmpty()) {
            this.front = newNode;
            this.rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        length++;
    }


    public int deQueue(){
        if(isEmpty()){
            throw new NoSuchElementException("Queue Empty");
        }
        int val = this.front.data;
        this.front = this.front.next;
        length--;
        return val;
    }

    public void print() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue Empty");
        }
        ListNode current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }


    public static void main(String... args) {
        Implementation newQueue = new Implementation();
        newQueue.enQueue(10);
        newQueue.print();

    }
}
