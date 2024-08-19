package com.dsa.lecture.code.linkedlist;

public class MergeSortedList {
    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    private void printList(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("Null");
    }

    private static ListNode merge(ListNode a, ListNode b){
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while(a != null && b != null){
            if(a.data <= b.data) {
                tail.next = a;
                a = a.next;
            }else{
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }
        if(a == null) {
            tail.next = b;
        }
        if (b == null) {
            tail.next = a;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        MergeSortedList msl = new MergeSortedList();
        msl.head = new ListNode(10);
        ListNode firstNode = new ListNode(20);
        ListNode secondNode = new ListNode(30);
        ListNode thirdNode = new ListNode(40);
        ListNode forthNode = new ListNode(50);

        MergeSortedList msl2 = new MergeSortedList();
        msl2.head = new ListNode(15);
        ListNode newFirstNode = new ListNode(25);
        ListNode newSecondNode = new ListNode(35);


        msl.head.next = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = forthNode;

        msl2.head.next = newFirstNode;
        newFirstNode.next = newSecondNode;
        newSecondNode.next = null;


        msl.printList();
        msl2.printList();

        msl.head = merge(msl.head,msl2.head);
        msl.printList();
    }
}
