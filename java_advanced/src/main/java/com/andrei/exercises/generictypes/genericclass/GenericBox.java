package com.andrei.exercises.generictypes.genericclass;

public class GenericBox<T> {
    private Object[] array;
    private int counter = 0;
    private int capacity;

    public GenericBox(int n) {
        this.array = new Object[n];
        this.capacity = n;
    }

    public void add(T obj) {
        if (counter < capacity) {
            this.array[counter++] = obj;
        }
    }

    public void print() {
        for (Object obj : array) {
            System.out.println(obj);
        }
    }
}
