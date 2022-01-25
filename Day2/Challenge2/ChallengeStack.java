package com.Jeet.Day2.Challenge2;

import java.util.Scanner;

public class ChallengeStack {
    private int[] arrayStack;
    private int top;

    private int[] max;
    private int m;

    public ChallengeStack(){
        arrayStack = new int[100];
        top = -1;
        max = new int[100];
        m = 0;
    }

    public void push(int n){
        if(!isFull()) {
            arrayStack[++top] = n;
            if(top == -1){
                max[++m] = n;
            }else if(max[m] < n){
                max[++m] = n;
            }
        }
        else
            System.out.println("Stack Overflow");
    }

    public int peek(){
        return arrayStack[top];
    }

    public void pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
        }else{
            int check = arrayStack[top];
            arrayStack[top--] = 0;
            if(max[m] == check || top==-1)
                max[m--] = 0;
        }
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == 100);
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

    public int[] getMax(){
        return max;
    }

    public static void main(String[] args) {

        String[] ops = {"1 97","2","1 20","2","1 26","1 20","2","3","1 91","3"};
        int n = ops.length;

        ChallengeStack stack = new ChallengeStack();


        for (int i = 0; i < n; i++) {
            if( (ops[i].charAt(0)) == '1'){
                Scanner sc = new Scanner(ops[i]);
                sc.nextInt();
                stack.push(sc.nextInt());
            }
            else if(ops[i]=="2"){
                stack.pop();
            }
            else if(ops[i]=="3"){
                stack.getMax();
            }
        }

        for (int i: stack.getMax()) {
            if(i!=0)
                System.out.println(i);
        }

    }

}
