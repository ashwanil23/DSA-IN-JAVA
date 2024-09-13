package com.dsa.lecture.code.linkedlist.circular;

public class InsertAtEnd {
    private ListNode tail;
    private int length;

    public static class ListNode{
        ListNode next;
        int data;
        public ListNode(int data){
            this.data = data;
        }
    }
    public InsertAtEnd(){
        this.tail = null;
        length = 0;
    }
     public boolean isEmpty(){
        return length == 0;
     }
     public int length(){
        return length;
     }

    public void insert(int data) {
        ListNode newNode = new ListNode(data);
        if (isEmpty()) {
            tail = newNode;
            tail.next = newNode;
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }


    public void display(){
        if(isEmpty()) {
            System.out.println("Empty");
            return;
        }
         ListNode first = tail.next;
         while(first != tail){
             System.out.print(first.data + "-->");
             first = first.next;
         }
         System.out.println(first.data);
     }

    @Override
    public String toString() {
        return "Implementation{" +
                "tail=" + tail +
                ", length=" + length +
                ", data=" + tail.data+
                '}';
    }

    public static void main(String[] args) {
        InsertAtEnd iae = new InsertAtEnd();
        iae.insert(10);
        iae.insert(20);
        iae.insert(30);
        iae.insert(10);
        iae.insert(20);
        iae.insert(30);
        iae.insert(40);
        iae.insert(50);
        System.out.println(iae.tail.next.data);
        iae.display();
    }
}
