package com.ocheejeh.datastructures;

import java.util.Arrays;

public class MyArray<T> {
    private int len;
    private int capacity;
    private T[] array;

    public MyArray() {
        this(16);
    }

    public MyArray(int capacity){
        if(capacity < 0) throw new IllegalArgumentException(String.format("%s capacity not allow", capacity));
        this.capacity = capacity;
        array = (T[]) new Object[capacity];
        this.len = 0;
    }

    public boolean add(T item){
        if(capacity == 0) return false;
        if(len >= capacity){
            capacity *= 2;
            T[] newArray = (T[]) new Object[capacity];
            for (int i = 0; i < len; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[len++] = item;
        return true;
    }

    public int size(){
        return this.len;
    }

    public int indexOf(T item){
        for (int i = 0; i < len; i++) {
            if(array[i] == item) return i;
        }
        return -1;
    }

    /**
     * @param index of item to be returned
     * @return item or null if none
     */
    public T get(int index){
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < size(); i++) {
            if(i == index) return array[i];
        }
        return null;
    }

    public boolean contains(T item){
        return this.indexOf(item) != -1;
    }

    /**
     * remove item at the given index
     * @param index
     * @return
     */
    public T remove(int index) {
        if(index < 0 || size() == 0) return null;
        T[] newArray = (T[]) new Object[len - 1];
        int k = 0;
        T item = null;
        for (int j = 0; j <= len; j++) {
            if(index == j){
                item = array[j];
                len--;
            } else {
                newArray[k] = array[j];
                k++;
            }
        }
        array = newArray;

        return item;
    }
}
