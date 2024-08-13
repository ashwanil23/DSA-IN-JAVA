package com.dsa.lecture.code.linkedlist;

public class InsertInSortedList {
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
    private void insertInSorted(int data){
        ListNode newNode = new ListNode(data);
        if (head.next == null && head.data < newNode.data){
            head.next = newNode;
        }else if (head.next == null && head.data > newNode.data){
            newNode.next = head;
            head = newNode;
        }
        ListNode currentNode = head;
        ListNode expSolver = null;
        ListNode previousNode;
        while(currentNode.data < newNode.data){
            expSolver = currentNode;
            currentNode = currentNode.next;
        }
        previousNode = expSolver;
        newNode.next = previousNode.next;
        previousNode.next = newNode;
    }

    public static void main(String[] args) {
        InsertInSortedList iisl = new InsertInSortedList();
        iisl.head = new InsertInSortedList.ListNode(10);
        InsertInSortedList.ListNode firstNode = new InsertInSortedList.ListNode(20);
        InsertInSortedList.ListNode secondNode = new InsertInSortedList.ListNode(30);
        InsertInSortedList.ListNode thirdNode = new InsertInSortedList.ListNode(40);
        InsertInSortedList.ListNode forthNode = new InsertInSortedList.ListNode(50);

        iisl.head.next = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = forthNode;
        iisl.printList();
        System.out.println("Total " + iisl.listCount(iisl.head) + " members");

        iisl.insertInSorted(35);
        iisl.printList();
    }

}
