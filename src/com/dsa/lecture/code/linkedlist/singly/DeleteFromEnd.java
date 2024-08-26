package com.dsa.lecture.code.linkedlist.singly;

public class DeleteFromEnd {
    private ListNode head;

    public static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    private void printList(){
        ListNode headNode = head;
        while(headNode != null){
            System.out.print(headNode.data + "->");
            headNode = headNode.next;
        }
        System.out.print("null");
    }
    public int deleteEnd(){
        if(head.next == null){
            int value = head.data;
            head = null;
            return value;
        }
        ListNode currentNode = head;
        ListNode previousNode = null;
        while(currentNode.next != null){
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
        previousNode.next = currentNode.next;
        return currentNode.data;
    }
    public static void main(String[] args){
        DeleteFromEnd dfe = new DeleteFromEnd();
        dfe.head = new ListNode(10);
        ListNode firstNode = new ListNode(20);
        ListNode secondNode = new ListNode(30);
        ListNode thirdNode = new ListNode (40);
        ListNode forthNode = new ListNode(50);

        dfe.head.next = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = forthNode;

        dfe.printList();
        System.out.println();
        try{
            System.out.println("Deleted element is :" + dfe.deleteEnd());
            System.out.println("Deleted element is :" + dfe.deleteEnd());
            System.out.println("Deleted element is :" + dfe.deleteEnd());
            System.out.println("Deleted element is :" + dfe.deleteEnd());
            System.out.println("Deleted element is :" + dfe.deleteEnd());
            System.out.println("Deleted element is :" + dfe.deleteEnd());
        }catch (NullPointerException exp){
            System.out.println(exp.getMessage());
        }
        dfe.printList();
    }
}


