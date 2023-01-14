import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {7,6,5,4,3,6,8,7,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){

        for(int i =1;i<arr.length;i++){
            int j = i;
            while(j>0 && arr[j-1]>arr[j]){
                swap(arr,j,j-1);
                j = j-1;
            }
        }
    }
    public static void swap(int[] arr,int a,int b){
        int temp =arr[a];
        arr[a] = arr[b];
        arr[b] = temp; 
    }
}
