package com.Jeet.W4Day2;

public class Sorts {

    public static void SelectionSort(){
        int[] a = {20, 28, 10, 17, 5};
        int temp, min;

        for(int i=0; i<a.length; i++){
            min = i;
            for(int j=i+1; j<a.length; j++){
                if(a[j]<a[min])
                    min=j;
            }
            temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
        for (int j : a) System.out.print(j + " ");
    }

    public static void InsertionSort(){
        int[] a = {20, 28, 10, 17, 5};
        int temp, j;
        for(int i=1; i<a.length; i++){
            temp=a[i];
            j=i;
            while(j>0 && a[j-1]>temp){
                a[j]=a[j-1];
                j--;
            }
            a[j]=temp;
            for(int x:a)
                System.out.print(x + " ");
            System.out.println();
        }

    }

}
