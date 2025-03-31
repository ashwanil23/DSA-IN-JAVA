package com.dsa.lecture.code.priorityQueue;

public class InsertInMaxPQ {
    Integer[] heap;
    int n;
     public InsertInMaxPQ(int capacity) {
         heap = new Integer[capacity+1];
         n = 0;
     }
    public boolean isEmpty() {
        return n == 0;
    }
    public int size() {
        return n;
    }
    public void insert(int element) {
         if(n == heap.length - 1) {
             IncSize(2* heap.length);
         }
         n++;
         heap[n] = element;
         swim(n);
    }

    private void swim(int k) {
        while(k > 1 && this.heap[k] > heap[k/2]) {
            int temp = heap[k];
            heap[k] = heap[k/2];
            heap[k/2] = temp;
            k = k/2;
        }
    }

    private void IncSize(int newSize) {
         Integer[] temp = new Integer[newSize];
        for (int i = 0; i < heap.length; i++) {
            temp[i] = heap[i];
        }
        heap = temp;
    }
    public void display() {
        for (Integer element : heap) {
            System.out.print("[ " + element +" ]");
        }
    }
    public static void main(String[] args) {
        InsertInMaxPQ insertInMaxPQ = new InsertInMaxPQ(5);
        insertInMaxPQ.insert(10);
        insertInMaxPQ.insert(9);
        insertInMaxPQ.insert(1);
        insertInMaxPQ.insert(5);
        insertInMaxPQ.insert(4);
        insertInMaxPQ.insert(2);
        insertInMaxPQ.insert(6);
        insertInMaxPQ.insert(3);
        insertInMaxPQ.display();
    }
}
