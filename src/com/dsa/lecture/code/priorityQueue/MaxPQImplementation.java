package com.dsa.lecture.code.priorityQueue;

public class MaxPQImplementation {
    Integer[] heap;
    int n;

    public MaxPQImplementation(int capacity) {
        this.heap = new Integer[capacity+1];
        n = 0;
    }
    public boolean isEmpty() {
        return n == 0;
    }
    public int size() {
        return n;
    }

    public static void main(String[] args) {
        MaxPQImplementation pq = new MaxPQImplementation(5);

    }
}
