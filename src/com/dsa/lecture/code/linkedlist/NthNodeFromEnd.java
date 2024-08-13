package com.dsa.lecture.code.linkedlist;

import java.util.Scanner;

public class NthNodeFromEnd {
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

    public ListNode nthFromEnd(int n){
        ListNode mainPtr = head;
        ListNode refPtr = head;
        int counter = 0;
        while(counter < n){
            if(refPtr == null) throw new IllegalArgumentException();
            else{
                refPtr = refPtr.next;
                counter++;
            }
        }
        while(refPtr != null){
            mainPtr = mainPtr.next;
            refPtr = refPtr.next;
        }
        return mainPtr;
    }

    public static void main(String[] args) {
        NthNodeFromEnd nnfe = new NthNodeFromEnd();
        nnfe.head = new NthNodeFromEnd.ListNode(10);
        NthNodeFromEnd.ListNode firstNode = new NthNodeFromEnd.ListNode(20);
        NthNodeFromEnd.ListNode secondNode = new NthNodeFromEnd.ListNode(30);
        NthNodeFromEnd.ListNode thirdNode = new NthNodeFromEnd.ListNode(40);
        NthNodeFromEnd.ListNode forthNode = new NthNodeFromEnd.ListNode(50);

        nnfe.head.next = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = forthNode;
        nnfe.printList();
        System.out.println("Total " + nnfe.listCount(nnfe.head) + " members");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = input.nextInt();
        try{
            ListNode nthNode = nnfe.nthFromEnd(n);
            System.out.println("Nth From End : "+nthNode.data);
        }catch(Throwable exp){
            System.out.println(exp.getMessage());
        }
    }

}
