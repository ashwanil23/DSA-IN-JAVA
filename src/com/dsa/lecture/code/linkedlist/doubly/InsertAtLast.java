package com.dsa.lecture.code.linkedlist.doubly;

public class InsertAtLast {
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

    public InsertAtLast(){
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
        ListNode newListNode = new ListNode(data);
        if(isEmpty()){
            head = newListNode;
        }else{
            tail.next = newListNode;
        }
        newListNode.previous = tail;
        tail = newListNode;
        length++;
    }

    public static void main(String[] args) {
        InsertAtLast iaf = new InsertAtLast();
        iaf.insert(10);
        iaf.insert(20);
        iaf.displayForward();
        iaf.displayBackward();

    }
}
