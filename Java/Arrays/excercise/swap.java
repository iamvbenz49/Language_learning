package Arrays.excercise;

import java.sql.Array;
import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        swap(arr,0,1);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int n1,int n2){
        int temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;
    }
}
