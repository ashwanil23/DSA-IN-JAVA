package com.dsa.lecture.code.linkedlist.doubly;

import com.dsa.lecture.code.linkedlist.singly.InsertAtPosition;

public class DoublyLinkedListRepresentation {
    public  ListNode head;
    private ListNode tail;
    private int length;

    private class ListNode{
        private ListNode next;
        private ListNode previous;
        int data;
        public ListNode(int data){
            this.data = data;
        }
    }

    public DoublyLinkedListRepresentation(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public int length(){
        return length;
    }

    public void displayForward(){
        if(isEmpty()) return;
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.print("NULL");
    }
    public void displayBackward(){
        if(isEmpty()) return;
        ListNode temp = tail;
        while(temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.print("NULL");
    }

    public static void main(String[] args) {
        DoublyLinkedListRepresentation dllr = new DoublyLinkedListRepresentation();
    }

}
