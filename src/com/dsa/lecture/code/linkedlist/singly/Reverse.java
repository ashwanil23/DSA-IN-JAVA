package com.dsa.lecture.code.linkedlist.singly;

public class Reverse {
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

    public void reverseList(){
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;
        while(current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }

    public static void main(String[] args) {
        Reverse r = new Reverse();
        r.head = new Reverse.ListNode(10);
        Reverse.ListNode firstNode = new Reverse.ListNode(20);
        Reverse.ListNode secondNode = new Reverse.ListNode(30);
        Reverse.ListNode thirdNode = new Reverse.ListNode(40);
        Reverse.ListNode forthNode = new Reverse.ListNode(50);

        r.head.next = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = forthNode;
        r.printList(r.head);
        System.out.println("Total " + r.listCount(r.head) + " members");

        try{
            r.reverseList();
        }catch(Throwable exp){
            System.out.println(exp.getMessage());
        }
        r.printList(r.head);
    }

}
