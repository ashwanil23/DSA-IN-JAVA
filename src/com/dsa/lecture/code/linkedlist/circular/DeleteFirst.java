package com.dsa.lecture.code.linkedlist.circular;

import java.util.NoSuchElementException;

public class DeleteFirst {
    private ListNode tail;
    private int length;

    public static class ListNode{
        ListNode next;
        int data;
        public ListNode(int data){
            this.data = data;
        }
    }
    public DeleteFirst(){
        this.tail = null;
        length = 0;
    }
     public boolean isEmpty(){
        return length == 0;
     }
     public int length(){
        return length;
     }

     public void insert(int data){
        ListNode newNode = new ListNode(data);
        if(isEmpty()){
            tail = newNode;
            tail.next = newNode;
        }else{
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
        }
         length++;
     }

    public int delete() {
        ListNode head = tail.next;
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if(tail.next == tail){
            tail.next = null;
            return tail.data;
        }else {
            tail.next = head.next;
            head.next = null;
        }
        length--;
        return head.data;
    }


    public void display(){
        if(isEmpty()) {
            System.out.println("Empty");
            return;
        }
         ListNode first = tail.next;
         while(first != tail){
             System.out.print(first.data + "-->");
             first = first.next;
         }
         System.out.println(first.data);
     }

    @Override
    public String toString() {
        return "Implementation{" +
                "tail=" + tail +
                ", length=" + length +
                ", data=" + tail.data+
                '}';
    }

    public static void main(String[] args) {
        DeleteFirst df = new DeleteFirst();
        df.insert(10);
        df.insert(20);
        df.insert(30);
        df.insert(40);
        df.insert(50);
        df.insert(60);
        System.out.println("deleted node is : "+df.delete());
        System.out.println("first node is : "+df.tail.next.data);
        System.out.print("List: -->");
        df.display();
    }
}
