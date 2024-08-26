package com.dsa.lecture.code.linkedlist.doubly;

import java.util.NoSuchElementException;

public class DeleteFirst {
    public  ListNode head;
    private ListNode tail;
    private int length;

    private  class ListNode{
        private ListNode next;
        private ListNode previous;
        int data;
        public ListNode(int data){
            this.data = data;
        }
    }

    public DeleteFirst(){
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
        System.out.print("NULL<--");
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    public void displayBackward(){
        if(isEmpty()) return;
        System.out.print("NULL<--");
        ListNode temp = tail;
        while(temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.previous;
        }
        System.out.println("NULL");
    }

    public void insert(int data){
        ListNode newNode = new ListNode(data);
        if(isEmpty()) tail = newNode;
        else head.previous = newNode;
        newNode.next = head;
        head = newNode;
        length++;
    }
    private ListNode delete(){
        ListNode temp = head;
        if(isEmpty()){
            throw new NoSuchElementException();
        }else{
            head = head.next;
            head.previous = temp.previous;
            temp.next = null;
        }
        length--;
        return temp;
    }

    public static void main(String[] args) {
        DeleteFirst iaf = new DeleteFirst();
        iaf.insert(10);
        iaf.insert(20);
        iaf.displayForward();
        iaf.displayBackward();
        try{
            ListNode delete = iaf.delete();
            System.out.println("Removed " + delete.data);
        }catch(NoSuchElementException exp){
            System.out.println(exp.getMessage());
        }
        iaf.displayForward();
        iaf.displayBackward();

    }
}
