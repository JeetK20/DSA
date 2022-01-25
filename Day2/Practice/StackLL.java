package com.Jeet.Day2.Practice;

class List{
    int data;
    List next;
    List(int data){
        this.data = data;
        this.next = null;
    }
}

public class StackLL {
    List head=null,temp;

    void push(int data){
        List newNode = new List(data);
        if(head!=null){
            newNode.next = head;
        }
        head = newNode;
    }

    void pop(){
        temp = head;
        if(head.next!=null)
            head = head.next;
        else
            head = null;
    }

    void display(){
        temp = head;
        if(temp == null){
            System.out.println("Empty Stack");
            return;
        }
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    void reverse(){
        List next=null,pre=null;
        temp=head;
        while (temp!=null){
            next = temp.next;
            temp.next = pre;
            pre = temp;
            temp = next;
        }
        head = pre;
    }


    public static void main(String[] args) {

        StackLL stack = new StackLL();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.pop();
        stack.display();
        stack.reverse();
    }
}