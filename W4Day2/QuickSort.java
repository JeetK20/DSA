package com.Jeet.W4Day2;

public class QuickSort{

    public int partition(int[] arr, int low, int high){
        int pivot = arr[(low+high)/2];

        while(low<=high){
            while(arr[low] < pivot)
                low++;
            while(arr[high] > pivot)
                high--;
            if(low<=high){
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;

                low++;
                high--;
            }
        }
        return low;
    }

    public void QuickSortRecursion (int[] arr, int low, int high){
        int num = partition(arr, low, high);
        if(low < num-1)
            QuickSortRecursion(arr, low, num-1);
        if(num<high)
            QuickSortRecursion(arr, num, high);
    }

    public static void main(String[] args) {
        int[] arr = {20, 28, 10, 17, 5};
        int length = arr.length;
        QuickSort qs = new QuickSort();
        qs.QuickSortRecursion(arr, 0, length-1);

        for(int i:arr)
            System.out.print(i+" ");
    }

}

