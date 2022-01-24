package com.Jeet.Day1.Practice;

public class MyQueue {

    private int[] queueArray;
    private int head,tail;

    public MyQueue(){
        queueArray = new int[1000];
        head = 0;
        tail = -1;
    }

    public void enqueue(int n){
        queueArray[++tail] = n;
    }

    public void dequeue(){
        if(isEmpty())
            System.out.println("Empty Queue!");
        else
            queueArray[head++] = 0;
    }

    public boolean isEmpty(){
        return (head>=tail);
    }

    public void show(){
        System.out.print("\nQueue is:");
        if(isEmpty())
            System.out.println("Empty!");
        else
            for (int i = head; i <= tail; i++)
                System.out.print(" "+queueArray[i]);
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(9);
        queue.show();
        queue.dequeue();
        queue.dequeue();
        queue.show();
    }
}
