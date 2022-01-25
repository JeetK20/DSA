package com.Jeet.Day1.Practice;

public class MyStack {
    private int[] arrayStack;
    private int top;
    private int max;

    public MyStack(int stackSize){
        arrayStack = new int[stackSize];
        top = -1;
        max = stackSize;
    }

    public void push(int n){
        if(!isFull())
            arrayStack[++top] = n;
        else
            System.out.println("Stack Overflow");
    }

    public int peek(){
        return arrayStack[top];
    }

    public void pop(){
        arrayStack[top--] = 0;
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == max);
    }

    public void showStack(){
        System.out.println("Stack is:");
        if(!isEmpty()) {
            for (int i = top; i > -1; i--) {
                System.out.println(arrayStack[i]);
            }
        }else
            System.out.println("Stack Underflow");
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack(10);
        stack.push(10);
        stack.push(25);
        stack.push(40);
        stack.showStack();
        stack.pop();
        stack.showStack();
        System.out.println("Stack top: "+stack.peek());
        System.out.println("Is Stack Empty? "+stack.isEmpty());
    }

}