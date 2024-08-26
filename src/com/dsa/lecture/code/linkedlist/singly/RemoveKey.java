package com.dsa.lecture.code.linkedlist.singly;

public class RemoveKey {
    private static ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void printList(){
        ListNode current = head;
        while(current != null){
            System.out.printf("%d --> ", current.data);
            current = current.next;
        }
        System.out.print("NULL");
        System.out.println();
    }

    public static void removeKey(int key){
        ListNode current = head;
        ListNode previous = null;
        if(current != null && current.data == key){
            current = current.next;
            return;
        }
        while(current != null && current.data != key){
            previous = current;
            current = current.next;
        }
        if(current == null) return;
        previous.next = current.next;
    }

    public static void main(String... args){
        RemoveKey rk = new RemoveKey();
        rk.head = new ListNode(5);
        ListNode first = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode forth = new ListNode(40);
        ListNode fifth = new ListNode(50);
        ListNode sixth = new ListNode(60);

        rk.head.next = first;
        first.next = second;
        second.next = third;
        third.next = forth;
        forth.next = fifth;
        fifth.next = sixth;

        printList();
        removeKey(30);
        printList();
    }
}
