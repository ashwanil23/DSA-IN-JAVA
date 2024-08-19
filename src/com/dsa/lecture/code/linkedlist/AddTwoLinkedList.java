package com.dsa.lecture.code.linkedlist;

public class AddTwoLinkedList {
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

    private int listCount(ListNode head){
        int count = 0;
        ListNode current = head;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }
    private static ListNode add(ListNode a, ListNode b){
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        int carry =0;
        while(a != null || b != null){
            int firstDigit = (a!=null) ?  a.data : 0;
            int secondDigit = (b!=null) ?  b.data : 0;
            int sum = carry + firstDigit + secondDigit;
            carry = sum/10;
            tail.next = new ListNode(sum%10);
            if(a != null) a = a.next;
            if(b != null) b = b.next;
            tail = tail.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        AddTwoLinkedList atll = new AddTwoLinkedList();
        atll.head = new AddTwoLinkedList.ListNode(1);
        AddTwoLinkedList.ListNode firstNode = new AddTwoLinkedList.ListNode(2);
        AddTwoLinkedList.ListNode secondNode = new AddTwoLinkedList.ListNode(3);
        AddTwoLinkedList.ListNode thirdNode = new AddTwoLinkedList.ListNode(4);
        AddTwoLinkedList.ListNode forthNode = new AddTwoLinkedList.ListNode(5);

        AddTwoLinkedList atll2 = new AddTwoLinkedList();
        atll2.head = new ListNode(9);
        ListNode newfirstNode = new ListNode(7);
        atll2.head.next = newfirstNode;
        newfirstNode.next = null;

        atll.head.next = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = forthNode;
        atll.printList();
        atll2.printList();

        atll.head = AddTwoLinkedList.add(atll.head,atll2.head);
        System.out.println("List sum is :");
        atll.printList();
    }

}
