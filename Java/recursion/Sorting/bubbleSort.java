package Sorting;


import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,7,1,2,8,11,4,3,9};
        sort(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr,int r ,int c){
        if(r==0){
            return;
        }
        else if(c<r){
            if(arr[c]>arr[c+1]){
                swap(arr,c);
            }
            sort(arr,r,c+1);
        }
        else{
            sort(arr,r-1,0);
        }
    }
    static void swap(int[] arr,int i){
        int temp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = temp;
    }
}
