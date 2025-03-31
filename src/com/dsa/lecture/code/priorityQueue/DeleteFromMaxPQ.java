package com.dsa.lecture.code.priorityQueue;

public class DeleteFromMaxPQ {
    Integer[] heap;
    int n;
    int initialCapacity;
    public DeleteFromMaxPQ(int capacity) {
        initialCapacity = capacity;
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

    public void deleteMax() {
        int max = heap[1];
        swap(1,n);
        n--;
        sink(1);
        heap[n+1] = null;
        if (n > 0 && n == (heap.length-1)/4 && heap.length / 2 >= initialCapacity) {
            decSize(heap.length/2);
        }
    }
    public void decSize(int newSize) {
        Integer[] temp = new Integer[newSize];
        for (int i = 0; i <= n; i++) {
            temp[i] = heap[i];
        }
        heap = temp;
    }
    public void sink(int k) {
        while(2*k <= n) {
            int j = 2*k;
            if(j < n && heap[j] < heap[j+1]) {
                j++;
            }
            if(heap[k] > heap[j]) break;
            swap(k, j);
            k = j;
        }
    }
    public void swap(int first, int last) {
        int temp = heap[first];
        heap[first] = heap[last];
        heap[last] = temp;
    }
    public void display() {
        for (Integer element : heap) {
            System.out.print("[ " + element +" ]");
        }
    }

    public static void main(String[] args) {
        DeleteFromMaxPQ deleteFromMaxPQ = new DeleteFromMaxPQ(6);
        deleteFromMaxPQ.insert(2);
        deleteFromMaxPQ.insert(3);
        deleteFromMaxPQ.insert(1);
        deleteFromMaxPQ.insert(5);
        deleteFromMaxPQ.insert(4);
        deleteFromMaxPQ.insert(9);
        deleteFromMaxPQ.insert(6);
        deleteFromMaxPQ.insert(10);
        deleteFromMaxPQ.display();
        deleteFromMaxPQ.deleteMax();
        deleteFromMaxPQ.deleteMax();
        deleteFromMaxPQ.deleteMax();
        deleteFromMaxPQ.deleteMax();
        deleteFromMaxPQ.deleteMax();
        System.out.println();
        deleteFromMaxPQ.display();
    }
}
