package com.dsa.lecture.code.linkedlist.singly;

public class InsertAtPosition {
    private ListNode head;
    public static class ListNode{
        int data;
        ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void printList(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.print("null");
    }
    public void insertPosition(int data, int position){
        ListNode newNode = new ListNode(data);
        if(position == 1){
            newNode.next = head;
            head = newNode;
            return;
        }
        ListNode previous = head;
        int counter = 1;

        while(counter < position-1 ){
            previous = previous.next;
            counter++;
        }
        ListNode current = previous.next;
        previous.next = newNode;
        newNode.next = current;
    }

    public static void main(String[] args){
        InsertAtPosition iap = new InsertAtPosition();
        iap.head = new InsertAtPosition.ListNode(10);
        InsertAtPosition.ListNode firstNode = new InsertAtPosition.ListNode(20);
        InsertAtPosition.ListNode secondNode = new InsertAtPosition.ListNode(30);
        InsertAtPosition.ListNode thirdNode = new InsertAtPosition.ListNode(40);
        InsertAtPosition.ListNode forthNode = new InsertAtPosition.ListNode(50);

        iap.head.next = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = forthNode;

        iap.printList();
        iap.insertPosition(5,3);
        iap.insertPosition(5,5);

        System.out.println();
        iap.printList();
    }
}
