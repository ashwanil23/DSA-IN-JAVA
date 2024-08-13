package com.dsa.lecture.code.linkedlist;

public class RemoveDuplicate {
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
    private void removeDuplicates(){
        if(head.next == null){
            return;
        }
        ListNode current = head;
        while(current.next != null){
            if(current.data == current.next.data){
                current.next = current.next.next;
            }else{
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
        RemoveDuplicate rds = new RemoveDuplicate();
        rds.head = new RemoveDuplicate.ListNode(20);
        RemoveDuplicate.ListNode firstNode = new RemoveDuplicate.ListNode(20);
        RemoveDuplicate.ListNode secondNode = new RemoveDuplicate.ListNode(20);
        RemoveDuplicate.ListNode thirdNode = new RemoveDuplicate.ListNode(20);
        RemoveDuplicate.ListNode forthNode = new RemoveDuplicate.ListNode(40);

        rds.head.next = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = forthNode;
        rds.printList();
        System.out.println("Total " + rds.listCount(rds.head) + " members");
        rds.removeDuplicates();
        rds.printList();
    }

}
