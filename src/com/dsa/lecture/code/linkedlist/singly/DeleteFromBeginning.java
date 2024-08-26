package com.dsa.lecture.code.linkedlist.singly;

public class DeleteFromBeginning {
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
    public int deleteFirst(){
        ListNode tempNode = head;
        head = head.next;
        tempNode.next = null;
        return tempNode.data;
    }
    public static void main(String[] args){
        DeleteFromBeginning dfb = new DeleteFromBeginning();
        dfb.head = new ListNode(10);
        ListNode firstNode = new ListNode(20);
        ListNode secondNode = new ListNode(30);
        ListNode thirdNode = new ListNode (40);
        ListNode forthNode = new ListNode(50);

        dfb.head.next = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = forthNode;

        dfb.printList();
        System.out.println();
        try{
            System.out.println("Deleted element is :" + dfb.deleteFirst());
            System.out.println("Deleted element is :" + dfb.deleteFirst());
            System.out.println("Deleted element is :" + dfb.deleteFirst());
            System.out.println("Deleted element is :" + dfb.deleteFirst());
            System.out.println("Deleted element is :" + dfb.deleteFirst());
            System.out.println("Deleted element is :" + dfb.deleteFirst());
        }catch (Throwable exp){
            System.out.println(exp.getMessage());
        }
        dfb.printList();
    }
}

