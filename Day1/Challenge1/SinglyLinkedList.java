package com.Jeet.Day1.Challenge1;

public class SinglyLinkedList {
    int data;
    SinglyLinkedList next;

    public SinglyLinkedList(int data){
        this.data = data;
        this.next = null;
    }

    public void addSLL(int data){
        SinglyLinkedList s = this;
        while(s.next != null){
            s = s.next;
        }
        s.next = new SinglyLinkedList(data);
    }

    public void printSLL(){
        SinglyLinkedList s = this;
        while(s != null){
            System.out.println(s.data);
            s = s.next;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList head = new SinglyLinkedList(5);
        head.addSLL(6);
        head.addSLL(7);
        head.addSLL(8);
        head.addSLL(9);
        head.printSLL();
    }

}
