package com.dsa.lecture.code.linkedlist;

public class SinglyLinkedList {
    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new ListNode(10);
        ListNode firstNode = new ListNode(20);
        ListNode secondNode = new ListNode(30);
        ListNode thirdNode = new ListNode(40);
        ListNode forthNode = new ListNode(50);

        sll.head.next = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = forthNode;

        PrintList pl = new PrintList();
    }
}
