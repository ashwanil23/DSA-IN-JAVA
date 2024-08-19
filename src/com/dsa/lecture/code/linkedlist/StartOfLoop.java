package com.dsa.lecture.code.linkedlist;

public class StartOfLoop {
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

    private static ListNode getStartOfLoop(ListNode slowPtr){
        ListNode temp = head;
        while(temp != slowPtr){
            temp = temp.next;
            slowPtr = slowPtr.next;
        }
        return temp;
    }

    private static ListNode startOfLoop(){
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        while(fastPtr != null && fastPtr.next != null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if(slowPtr == fastPtr) return  getStartOfLoop(slowPtr);
        }
        return null;
    }

    public static void main(String[] args) {
        StartOfLoop sol = new StartOfLoop();
        sol.head = new ListNode(5);
        ListNode first = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode forth = new ListNode(40);
        ListNode fifth = new ListNode(50);
        ListNode sixth = new ListNode(60);

        sol.head.next = first;
        first.next = second;
        second.next = third;
        third.next = forth;
        forth.next = fifth;
        fifth.next = third;

        assert startOfLoop() != null;
        System.out.println("start of the loop is "+ startOfLoop().data);
    }
}
