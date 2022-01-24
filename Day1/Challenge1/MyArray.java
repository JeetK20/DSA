package com.Jeet.Day1.Challenge1;

public class MyArray {

    int[] reverseArray(int[] arr){
        int[] temp =  new int[arr.length];
        int len = temp.length;
        for (int i = 0; i < arr.length; i++,len--)
            temp[len-1] = arr[i];
        return temp;
    }

    public static void main(String[] args) {
        int[] array = {5,8,7,6};
        MyArray m = new MyArray();

        array = m.reverseArray(array);
        for (int i: array)
            System.out.print(i+ " ");

    }
}

