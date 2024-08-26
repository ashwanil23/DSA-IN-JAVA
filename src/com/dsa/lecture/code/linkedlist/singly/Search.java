package com.dsa.lecture.code.linkedlist.singly;

import java.util.Scanner;

public class Search {
    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void printList(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("Null");
    }
    public boolean searchElement(int element){
        ListNode current = head;
        while(current != null){
            if(current.data == element){
                return true;
            }else{
                current = current.next;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Search s = new Search();
        s.head = new ListNode(10);
        ListNode firstNode = new ListNode(20);
        ListNode secondNode = new ListNode(30);
        ListNode thirdNode = new ListNode(40);
        ListNode forthNode = new ListNode(50);

        s.head.next = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = forthNode;

        s.printList();
        System.out.print("Enter the element to search: ");
        Scanner input = new Scanner(System.in);
        int element = input.nextInt();
        try{
            if(s.searchElement(element)){
                System.out.println("Element present");
            }else{
                System.out.println("Not Found");
            }
        }catch(Throwable exp){
            System.out.println(exp.getMessage());
        }
    }
}
