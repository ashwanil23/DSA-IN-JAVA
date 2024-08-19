package com.dsa.lecture.code.linkedlist;

public class LoopDetection {
    private static ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        private ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    private static void printList(){
        ListNode current = head;
        while(current != null){
            System.out.printf("%d --> ", current.data);
            current = current.next;
        }
        System.out.print("NULL");
        System.out.println();
    }
    private static Boolean loopDetection(){
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        while(fastPtr != null && fastPtr.next != null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if(slowPtr == fastPtr) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        LoopDetection ld = new LoopDetection();
        ld.head = new ListNode(5);
        ListNode first = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode forth = new ListNode(40);
        ListNode fifth = new ListNode(50);
        ListNode sixth = new ListNode(60);

        ld.head.next = first;
        first.next = second;
        second.next = third;
        third.next = forth;
        forth.next = fifth;
        fifth.next = third;

        if(loopDetection()){
            System.out.println("Loop Exists");
        }else{
            System.out.println("Loop Not Exists");
        }
    }
}
