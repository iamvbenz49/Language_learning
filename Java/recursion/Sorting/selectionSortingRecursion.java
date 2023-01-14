import java.util.Arrays;

public class selectionSortingRecursion {
    public static void main(String[] args) {
        int[] arr = {7,6,5,4,3,6,8,7,2,1};
        sort(arr,10,0,0);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr,int r,int c,int max){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[max])max = c;
        
            sort(arr, r, c+1, max);
        }
        else{
            swap(arr,r-1,max);
            sort(arr, r-1, 0, 0);
        }
    }
    public static void swap(int[] arr,int a,int b){
        int temp =arr[a];
        arr[a] = arr[b];
        arr[b] = temp; 
    }
}
