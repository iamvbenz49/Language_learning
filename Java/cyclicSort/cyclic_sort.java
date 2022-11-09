package cyclicSort;

import java.util.Arrays;

public class cyclic_sort {
    public static void main(String[] args) {
        int[] arr = {3,2,4,1,5};
        System.out.println(Arrays.toString(sort(arr)));
    }
    static int[] sort(int[] arr){
        int i = 0;
        while(i<arr.length){
            int incorrect = arr[i]-1;
            if(arr[i] == arr[incorrect]){
                i+=1; 
            }
            else{
                swap(arr,i,incorrect);
            }
        }
        return arr;
    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
