package com.dsa.lecture.code.linkedlist;
import com.dsa.lecture.code.linkedlist.SinglyLinkedList;

public class PrintList {
    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    private void printList(ListNode head){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("Null");
    }

    private int listCount(ListNode head){
        int count = 0;
        ListNode current = head;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }

    public static void main(String[] args) {
        PrintList sll = new PrintList();
        sll.head = new PrintList.ListNode(10);
        PrintList.ListNode firstNode = new PrintList.ListNode(20);
        PrintList.ListNode secondNode = new PrintList.ListNode(30);
        PrintList.ListNode thirdNode = new PrintList.ListNode(40);
        PrintList.ListNode forthNode = new PrintList.ListNode(50);

        sll.head.next = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = forthNode;
        sll.printList(sll.head);
        System.out.println("Total " + sll.listCount(sll.head) + " members");
    }

}
