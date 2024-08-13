package com.dsa.lecture.code.linkedlist;

public class InsertAtBeginning {
    private ListNode head;

     public static class ListNode{
         private int data;
         private ListNode next;
         public ListNode(int data){
             this.data = data;
             this.next = null;
         }
     }

     private void printList(){
         ListNode headNode = head;
         while(headNode != null){
             System.out.print(headNode.data + "->");
             headNode = headNode.next;
         }
         System.out.print("null");
     }
     public void insetFirst(int data){
         ListNode newNode = new ListNode(data);
         newNode.next = head;
         head = newNode;
     }
     public static void main(String[] args){
         InsertAtBeginning iab = new InsertAtBeginning();
         iab.head = new ListNode(10);
         ListNode firstNode = new ListNode(20);
         ListNode secondNode = new ListNode(30);
         ListNode thirdNode = new ListNode (40);
         ListNode forthNode = new ListNode(50);

         iab.head.next = firstNode;
         firstNode.next = secondNode;
         secondNode.next = thirdNode;
         thirdNode.next = forthNode;

         iab.printList();
         iab.insetFirst(5);
         iab.insetFirst(0);
         System.out.println();
         iab.printList();
     }
}
