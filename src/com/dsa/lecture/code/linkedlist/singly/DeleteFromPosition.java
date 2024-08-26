package com.dsa.lecture.code.linkedlist.singly;

public class DeleteFromPosition {
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
    public int deletePosition(int position) throws NullPointerException{
        if (position == 1){
            int value = head.data;
            head = null;
            return value;
        }
        ListNode previousNode = head;
        int counter = 1;
        while(counter < position-1){
            previousNode = previousNode.next;
            counter++;
        }
        ListNode currentNode = previousNode.next;
        previousNode.next = currentNode.next;
        currentNode.next = null;
        return currentNode.data;
    }
    public static void main(String[] args){
        DeleteFromPosition dfp = new DeleteFromPosition();
        dfp.head = new ListNode(10);
        ListNode firstNode = new ListNode(20);
        ListNode secondNode = new ListNode(30);
        ListNode thirdNode = new ListNode (40);
        ListNode forthNode = new ListNode(50);

        dfp.head.next = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = forthNode;

        dfp.printList();
        System.out.println();
        try{
            System.out.println("Deleted element is :" + dfp.deletePosition(2));
            System.out.println("Deleted element is :" + dfp.deletePosition(3));
            System.out.println("Deleted element is :" + dfp.deletePosition(2));
            System.out.println("Deleted element is :" + dfp.deletePosition(2));
            System.out.println("Deleted element is :" + dfp.deletePosition(1));
            System.out.println("Deleted element is :" + dfp.deletePosition(1));
        }catch (Throwable exp){
            System.out.println(exp.getMessage());
        }
        dfp.printList();
    }
}

