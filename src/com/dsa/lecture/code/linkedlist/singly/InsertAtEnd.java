package com.dsa.lecture.code.linkedlist.singly;

public class InsertAtEnd {
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
     public void insertEnd(int data){
         ListNode newNode = new ListNode(data);
         if(head == null){
             head = newNode;
             return;
         }
         ListNode current = head;
         ListNode previous = null;
         while(current != null ){
             previous = current;
             current = current.next;
         }
         previous.next = newNode;
         newNode.next = current;
     }

    public static void main(String[] args){
        InsertAtEnd iae = new InsertAtEnd();
        iae.head = new InsertAtEnd.ListNode(10);
        InsertAtEnd.ListNode firstNode = new InsertAtEnd.ListNode(20);
        InsertAtEnd.ListNode secondNode = new InsertAtEnd.ListNode(30);
        InsertAtEnd.ListNode thirdNode = new InsertAtEnd.ListNode(40);
        InsertAtEnd.ListNode forthNode = new InsertAtEnd.ListNode(50);

        iae.head.next = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = forthNode;

        iae.printList();
        iae.insertEnd(5);

        System.out.println();
        iae.printList();
    }
}
