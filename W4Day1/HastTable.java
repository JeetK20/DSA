package com.Jeet.W4Day1;

public class HastTable {

    int[] arr;
    int size;

    public HastTable(int size){
        this.size = size;
        arr = new int[size];
    }

    public void insert(int data){
        arr[hashFun(data)] = data;
    }

    public void delete(int data){
        if(arr[hashFun(data)] == data)
            arr[hashFun(data)] = 0;
        else
            System.out.println("Not found");
    }

    public boolean search(int data){
        return arr[hashFun(data)]==data;
    }

    public void printHashTable(){
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public int hashFun(int data){
        return (data%size);
    }


    public static void main(String[] args) {

        HastTable hs = new HastTable(10);
        hs.insert(1);
        hs.insert(67);
        hs.insert(22);
        hs.insert(90);
        hs.delete(1);
        System.out.println(hs.search(90));
        hs.printHashTable();


    }
}
