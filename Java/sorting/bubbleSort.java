package sorting;
import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {7,6,5,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    swap(arr,i,j);
                }
            }
        }
    }
    public static void swap(int[] arr,int a,int b){
        int temp =arr[a];
        arr[a] = arr[b];
        arr[b] = temp; 
    }
}
