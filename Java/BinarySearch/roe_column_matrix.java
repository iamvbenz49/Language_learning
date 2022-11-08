package BinarySearch;

import java.util.Arrays;

public class row_column_matrix {
    public static void main(String[] args) {
        int target = 25;
        int[][] arr = {{10,20,30,40},
                        {11,25,35,45},
                        {28,29,37,49},
                    {33,34,38,50}};
        System.out.println(Arrays.toString(search(arr,target)));
    }
    static int[] search(int[][] arr,int target){
        
        int upper = arr.length-1;
        int lower = 0;
        
        while(upper>0 && lower<arr.length-1){
            System.out.println(upper + " "+lower);
            if(arr[lower][upper]<target){
                upper--;
            }
            else if(arr[lower][upper]>target){
                lower++;
            }
            else if(arr[lower][upper] == 0){
                int[] res = {upper,lower};
                return res;
            }
        }
        while(upper>0){
            if(arr[lower][upper]<target){
                upper--;
            }
            else if(arr[lower][upper] == 0){
                int[] res = {upper,lower};
                return res;
            }
            else{
                break;
            }
        }
        while(lower<=arr.length-1){
            if(arr[lower][upper]>target){
                lower++;
            }
            else if(arr[lower][upper] == 0){
                int[] res = {upper,lower};
                return res;
            }
            else{
                break;
            }
        }
        int[] x = {-1,-1};
        return x;
    }
}
